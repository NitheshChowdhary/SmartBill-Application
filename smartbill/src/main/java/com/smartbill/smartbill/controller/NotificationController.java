package com.smartbill.smartbill.controller;

import com.smartbill.smartbill.model.BillResponse;
import com.smartbill.smartbill.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/send")
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @PostMapping
    public String sendBill(@RequestBody BillResponse billResponse, @RequestParam String mobile) {
        boolean sent = notificationService.sendBillToMobile(billResponse, mobile);
        return sent ? "Bill sent successfully!" : "Failed to send bill.";
    }
}
