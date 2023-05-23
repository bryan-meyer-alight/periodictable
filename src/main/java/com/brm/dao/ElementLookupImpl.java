package com.brm.dao;

import com.brm.pojo.Element;
import com.brm.pojo.PeriodicTable;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@Component
public class ElementLookupImpl implements ElementLookup {

    private PeriodicTable periodicTable;

    public Element findElementBySymbol(String symbol) throws Exception {

        try {
            Optional<Element> elementOptional = this.periodicTable.getElements().stream()
                    .filter(e -> e.getSymbol().equalsIgnoreCase(symbol))
                    .findFirst();
            return elementOptional.orElse(null);
        }
        catch (Exception e) {
            throw new Exception("An error occurred while finding the element with the given symbol.");
        }
    }

    @PostConstruct
    private void loadPeriodicTable() throws Exception {

        ObjectMapper objectMapper = new ObjectMapper();

        try {
            this.periodicTable = objectMapper.readValue(Element.class.getClassLoader().getResourceAsStream("periodictable.json"), PeriodicTable.class);
        }
        catch (Exception e) {
            throw new Exception("The periodic table could not be loaded from the JSON file.", e);
        }
    }
}
