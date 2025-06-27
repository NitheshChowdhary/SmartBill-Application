package com.smartbill.smartbill.controller;

import com.smartbill.smartbill.model.BillRequest;
import com.smartbill.smartbill.model.BillResponse;
import com.smartbill.smartbill.service.BillingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/bill")
public class BillController {

    @Autowired
    private BillingService billingService;

    @PostMapping
    public BillResponse generateBill(@RequestBody BillRequest request) {
        return billingService.generateBill(request);
    }
}
