package com.mockcompany.webapp.controller;

import com.mockcompany.webapp.model.ProductItem;
import com.mockcompany.webapp.service.SearchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
/* java.util package provides useful utilities */
import java.util.Collection;


public class SearchControllerCopy {
    
    private final SearchService searchService = null;

    @GetMapping("/api/products/search")
    public Collection<ProductItem> search(@RequestParam("query") String query) {
        
        return this.searchService.search(query);
    }
}
