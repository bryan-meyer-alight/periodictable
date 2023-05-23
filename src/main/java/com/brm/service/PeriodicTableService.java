package com.brm.service;

import com.brm.dto.PeriodicTableDTO;
import com.brm.pojo.Element;

public interface PeriodicTableService {

    Element getElementBySymbol(PeriodicTableDTO periodicTableInputDTO) throws Exception;
}
