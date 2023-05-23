package com.brm.service;

import com.brm.dao.ElementLookup;
import com.brm.dto.PeriodicTableDTO;
import com.brm.pojo.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeriodicTableServiceImpl implements PeriodicTableService {

    @Autowired
    private ElementLookup elementLookup;

    public Element getElementBySymbol(PeriodicTableDTO periodicTableInputDTO) throws Exception {

        try {
            return this.elementLookup.findElementBySymbol(periodicTableInputDTO.getSymbol());
        }
        catch (Exception e) {
            throw new Exception("An error occurred while loading the element with the given symbol.");
        }
    }
}
