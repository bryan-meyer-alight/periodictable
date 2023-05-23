package com.brm.api;

import com.brm.dto.PeriodicTableDTO;
import com.brm.pojo.Element;
import com.brm.service.PeriodicTableService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/periodictable")
public class PeriodicTableController {

    @Autowired
    private PeriodicTableService periodicTableService;

    @PostMapping(value = "/getelementbysymbol", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> getElementBySymbol(@RequestBody PeriodicTableDTO periodicTableInputDTO) {
        try {
            Element element = periodicTableService.getElementBySymbol(periodicTableInputDTO);
            return new ResponseEntity<>(new ObjectMapper().writeValueAsString(element), HttpStatus.OK);
        }
        catch (Exception e){
            String errorMessage = "The element with the given symbol could not be retrieved.";
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, errorMessage, e);
        }
    }
}
