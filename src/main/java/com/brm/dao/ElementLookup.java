package com.brm.dao;

import com.brm.pojo.Element;

public interface ElementLookup {

    Element findElementBySymbol(String symbol) throws Exception;
}
