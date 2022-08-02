package com.exemplo.springxml.service;

import com.exemplo.springxml.model.CDCatalog;
import com.exemplo.springxml.model.ListCDCatalog;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class CDCatalogService {
    private static final Logger logger = Logger.getLogger(CDCatalogService.class.getName());

    public ListCDCatalog createCDCatalog(ListCDCatalog listCDCatalog){
        logger.info(listCDCatalog.toString());
        return listCDCatalog;
    }
}
