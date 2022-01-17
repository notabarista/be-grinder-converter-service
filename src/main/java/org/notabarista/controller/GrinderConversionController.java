package org.notabarista.controller;

import lombok.NonNull;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.time.StopWatch;
import org.notabarista.dto.GrinderConversionDTO;
import org.notabarista.entity.response.Response;
import org.notabarista.entity.response.ResponseStatus;
import org.notabarista.exception.AbstractNotabaristaException;
import org.notabarista.service.GrinderConversionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/grinder")
@Log4j2
public class GrinderConversionController {

//    uI: grinderName + brewingMethod

//    UI: grinderName + grindSize

//UI: grinder types (uniquely) + brewing methods (uniquely) + grind sizes (uniquely)

    @Autowired
    private GrinderConversionService grinderConversionService;

    @GetMapping(value = "/findByGrinder/{grinder}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Response<GrinderConversionDTO>> getAllByGrinder(@NonNull @PathVariable String grinder) {
        StopWatch watch = new StopWatch();
        watch.start();
        if (log.isInfoEnabled()) {
            log.info("Find by grinder: " + grinder);
        }

        List<GrinderConversionDTO> grinderConversionsByGrinder = grinderConversionService.findGrinderConversionByGrinder(grinder);

        watch.stop();
        return new ResponseEntity<>(
                new Response<GrinderConversionDTO>(ResponseStatus.SUCCESS, watch.getTime(), grinderConversionsByGrinder, grinderConversionsByGrinder.size(), 1, 0, grinderConversionsByGrinder.size(), ""),
                HttpStatus.OK);
    }

    @GetMapping(value = "/findByGrinderAndBrewingMethod/{grinder}", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Response<GrinderConversionDTO>> getByGrinderAndBrewingMethod(@NonNull @PathVariable String grinder, @NonNull @RequestParam("brewing") String brewingMethod) throws AbstractNotabaristaException {
        StopWatch watch = new StopWatch();
        watch.start();
        if (log.isInfoEnabled()) {
            log.info("Find by grinder: " + grinder + " and brewing method: " + brewingMethod);
        }

        List<GrinderConversionDTO> grinderConversionsByGrinder = grinderConversionService.findGrinderConversionByGrinder(grinder);

        watch.stop();
        return new ResponseEntity<>(
                new Response<GrinderConversionDTO>(ResponseStatus.SUCCESS, watch.getTime(), grinderConversionsByGrinder, grinderConversionsByGrinder.size(), 1, 0, grinderConversionsByGrinder.size(), ""),
                HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<Response<GrinderConversionDTO>> getAll() throws AbstractNotabaristaException {
        StopWatch watch = new StopWatch();
        watch.start();
        if (log.isInfoEnabled()) {
            log.info("Find all");
        }

        List<GrinderConversionDTO> grinderConversionsByGrinder = grinderConversionService.findAll();

        watch.stop();
        return new ResponseEntity<>(
                new Response<GrinderConversionDTO>(ResponseStatus.SUCCESS, watch.getTime(), grinderConversionsByGrinder, grinderConversionsByGrinder.size(), 1, 0, grinderConversionsByGrinder.size(), ""),
                HttpStatus.OK);
    }

}
