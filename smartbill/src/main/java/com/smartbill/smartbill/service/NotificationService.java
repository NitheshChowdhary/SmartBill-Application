package com.smartbill.smartbill.service;

import com.smartbill.smartbill.model.BillResponse;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    public boolean sendBillToMobile(BillResponse billResponse, String mobile) {
        // Placeholder logic — in real case, call SMS/WhatsApp API like Twilio, MSG91, etc.
        System.out.println("Sending bill to mobile: " + mobile);
        System.out.println("Bill Details: " + billResponse);
        // Simulate success
        return true;
    }
}
