package com.ge.predix.labs.data.jpa.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ge.predix.labs.data.jpa.domain.Supplier;
import com.ge.predix.labs.data.jpa.service.SupplierService;

@ComponentScan
@RestController
public class SupplierApiController {

    @Autowired  private SupplierService supplierService;

    public static final String SUPPLIER = "/supplier";
    public static final String SEARCH_SUPPLIER = "/searchSupplier";



    @RequestMapping(value = SUPPLIER, method = RequestMethod.GET)
    public Collection<Supplier> productData() throws Exception {
        Collection<Supplier> supplier = supplierService.getAllSuppliers();
        return supplier;
    }

}