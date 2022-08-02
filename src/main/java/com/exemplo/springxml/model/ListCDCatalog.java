package com.exemplo.springxml.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@JacksonXmlRootElement(localName = "CATALOG")
public class ListCDCatalog implements Serializable {

    private static final long serialVersionUID = 22L;

    @JacksonXmlProperty(localName = "CD")
    @JacksonXmlElementWrapper(useWrapping = false)
    private List<CDCatalog> listCDs = new ArrayList<>();

    @JacksonXmlElementWrapper(useWrapping = false)
    public List<CDCatalog> getListCDs() {
        return listCDs;
    }

    @JacksonXmlElementWrapper(useWrapping = false)
    public void setListCDs(List<CDCatalog> listCDs) {
        this.listCDs = listCDs;
    }

    @Override
    public String toString() {
        return "ListCDCatalog{" +
                "listCDs=" + listCDs +
                '}';
    }
}
