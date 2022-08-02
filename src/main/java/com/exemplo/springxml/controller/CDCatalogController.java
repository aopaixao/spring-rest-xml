package com.exemplo.springxml.controller;

import com.exemplo.springxml.model.CDCatalog;
import com.exemplo.springxml.model.ListCDCatalog;
import com.exemplo.springxml.service.CDCatalogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cd")
public class CDCatalogController {
    @Autowired
    CDCatalogService cdCatalogService;

    @PostMapping(
            consumes = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE },
            produces = { MediaType.APPLICATION_XML_VALUE, MediaType.APPLICATION_JSON_VALUE }
    )
    public ResponseEntity<ListCDCatalog> createCD(@RequestBody ListCDCatalog catalogs) {
        ListCDCatalog listCDCatalog = cdCatalogService.createCDCatalog(catalogs);
        return new ResponseEntity<>(listCDCatalog, HttpStatus.OK);
    }
}
