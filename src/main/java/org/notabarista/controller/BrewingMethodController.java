package org.notabarista.controller;

import lombok.NonNull;
import lombok.extern.log4j.Log4j2;
import org.apache.commons.lang3.time.StopWatch;
import org.notabarista.dto.BrewingMethodDTO;
import org.notabarista.entity.response.Response;
import org.notabarista.entity.response.ResponseStatus;
import org.notabarista.exception.AbstractNotabaristaException;
import org.notabarista.service.BrewingMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/brewing")
@Log4j2
public class BrewingMethodController {

    @Autowired
    private BrewingMethodService brewingMethodService;

    @GetMapping("/all")
    public ResponseEntity<Response<BrewingMethodDTO>> getAll() throws AbstractNotabaristaException {
        StopWatch watch = new StopWatch();
        watch.start();
        if (log.isInfoEnabled()) {
            log.info("Find all");
        }

        List<BrewingMethodDTO> brewingMethods = brewingMethodService.findAll();

        watch.stop();
        return new ResponseEntity<>(
                new Response<BrewingMethodDTO>(ResponseStatus.SUCCESS, watch.getTime(), brewingMethods, brewingMethods.size(), 1, 0, brewingMethods.size(), ""),
                HttpStatus.OK);
    }

    @GetMapping(value = "/byGrindSize", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Response<BrewingMethodDTO>> findbyGrindSize(@NonNull @RequestParam String grindSize) {
        StopWatch watch = new StopWatch();
        watch.start();
        if (log.isInfoEnabled()) {
            log.info("Find by grindSize: " + grindSize);
        }

        List<BrewingMethodDTO> brewingMethod = Collections.singletonList(brewingMethodService.findByGrindSize(grindSize));

        watch.stop();
        return new ResponseEntity<>(
                new Response<BrewingMethodDTO>(ResponseStatus.SUCCESS, watch.getTime(), brewingMethod, brewingMethod.size(), 1, 0, brewingMethod.size(), ""),
                HttpStatus.OK);
    }

    @GetMapping(value = "/byMethod", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Response<BrewingMethodDTO>> findbyMethod(@NonNull @RequestParam String method) {
        StopWatch watch = new StopWatch();
        watch.start();
        if (log.isInfoEnabled()) {
            log.info("Find by method: " + method);
        }

        List<BrewingMethodDTO> brewingMethod = Collections.singletonList(brewingMethodService.findByBrewingMethod(method));

        watch.stop();
        return new ResponseEntity<>(
                new Response<BrewingMethodDTO>(ResponseStatus.SUCCESS, watch.getTime(), brewingMethod, brewingMethod.size(), 1, 0, brewingMethod.size(), ""),
                HttpStatus.OK);
    }

    @GetMapping(value = "/bySpecification", produces = "application/json")
    @ResponseBody
    public ResponseEntity<Response<BrewingMethodDTO>> findbySpecification(@NonNull @RequestParam String specification) {
        StopWatch watch = new StopWatch();
        watch.start();
        if (log.isInfoEnabled()) {
            log.info("Find by specification: " + specification);
        }

        List<BrewingMethodDTO> brewingMethod = Collections.singletonList(brewingMethodService.findByGrindSpecification(specification));

        watch.stop();
        return new ResponseEntity<>(
                new Response<BrewingMethodDTO>(ResponseStatus.SUCCESS, watch.getTime(), brewingMethod, brewingMethod.size(), 1, 0, brewingMethod.size(), ""),
                HttpStatus.OK);
    }

}
