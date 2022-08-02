package com.exemplo.springxml.model;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "CD")
public class CDCatalog {
    @JacksonXmlProperty
    private String TITLE;

    @JacksonXmlProperty
    private String ARTIST;

    @JacksonXmlProperty
    private String COUNTRY;

    @JacksonXmlProperty
    private String COMPANY;

    @JacksonXmlProperty
    private String PRICE;

    @JacksonXmlProperty
    private String YEAR;

    public CDCatalog() { }

    public CDCatalog(String TITLE, String ARTIST, String COUNTRY, String COMPANY, String PRICE, String YEAR) {
        this.TITLE = TITLE;
        this.ARTIST = ARTIST;
        this.COUNTRY = COUNTRY;
        this.COMPANY = COMPANY;
        this.PRICE = PRICE;
        this.YEAR = YEAR;
    }

    @Override
    public String toString() {
        return "CDCatalog{" +
                "TITLE='" + TITLE + '\'' +
                ", ARTIST='" + ARTIST + '\'' +
                ", COUNTRY='" + COUNTRY + '\'' +
                ", COMPANY='" + COMPANY + '\'' +
                ", PRICE='" + PRICE + '\'' +
                ", YEAR='" + YEAR + '\'' +
                '}';
    }
}