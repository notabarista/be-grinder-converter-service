package org.notabarista.controller;

import lombok.NonNull;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.time.StopWatch;
import org.notabarista.dto.GrinderConversionDTO;
import org.notabarista.dto.GrinderSizeDTO;
import org.notabarista.entity.response.Response;
import org.notabarista.entity.response.ResponseStatus;
import org.notabarista.exception.AbstractNotabaristaException;
import org.notabarista.service.GrinderConversionService;
import org.notabarista.service.GrinderSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/grinder/size")
@Log4j2
public class GrinderSizeController {

    @Autowired
    private GrinderSizeService grinderSizeService;

    @GetMapping("/all")
    public ResponseEntity<Response<GrinderSizeDTO>> getAll() throws AbstractNotabaristaException {
        StopWatch watch = new StopWatch();
        watch.start();
        if (log.isInfoEnabled()) {
            log.info("Find all");
        }

        List<GrinderSizeDTO> grinderSizes = grinderSizeService.findAll();

        watch.stop();
        return new ResponseEntity<>(
                new Response<GrinderSizeDTO>(ResponseStatus.SUCCESS, watch.getTime(), grinderSizes, grinderSizes.size(), 1, 0, grinderSizes.size(), ""),
                HttpStatus.OK);
    }

    @GetMapping(value = "/byGrinder", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Response<GrinderSizeDTO>> findByGrinder(@NonNull @RequestParam String grinder) {
        StopWatch watch = new StopWatch();
        watch.start();
        if (log.isInfoEnabled()) {
            log.info("Find by grinder: " + grinder);
        }

        List<GrinderSizeDTO> grinderSizesByGrinder = grinderSizeService.findGrinderSizesByGrinder(grinder);

        watch.stop();
        return new ResponseEntity<>(
                new Response<GrinderSizeDTO>(ResponseStatus.SUCCESS, watch.getTime(), grinderSizesByGrinder, grinderSizesByGrinder.size(), 1, 0, grinderSizesByGrinder.size(), ""),
                HttpStatus.OK);
    }

    @GetMapping(value = "/byGrinderAndSize", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Response<GrinderSizeDTO>> findByGrinderAndSize(@NonNull @RequestParam String grinder, @NonNull @RequestParam String grindSize) {
        StopWatch watch = new StopWatch();
        watch.start();
        if (log.isInfoEnabled()) {
            log.info("Find by grinder: " + grinder);
        }

        List<GrinderSizeDTO> grinderSizes = grinderSizeService.findGrinderSizesByGrindSize(grinder, grindSize);

        watch.stop();
        return new ResponseEntity<>(
                new Response<GrinderSizeDTO>(ResponseStatus.SUCCESS, watch.getTime(), grinderSizes, grinderSizes.size(), 1, 0, grinderSizes.size(), ""),
                HttpStatus.OK);
    }

}
