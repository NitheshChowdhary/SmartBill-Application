package com.smartbill.smartbill.service;

import com.smartbill.smartbill.model.BillRequest;
import com.smartbill.smartbill.model.BillResponse;
import com.smartbill.smartbill.utility.GstCalculator;
import org.springframework.stereotype.Service;

@Service
public class BillingService {

    public BillResponse generateBill(BillRequest request) {
        System.out.println("Received BillRequest: " + request);
        System.out.println("Items received: " + request.getItems());

        double subtotal = GstCalculator.calculateSubtotal(request.getItems());
        double gst = GstCalculator.calculateGST(request.getItems());
        double totalBeforeDiscount = subtotal + gst;
        double discounted = totalBeforeDiscount - request.getDiscount();
        double grandTotal = discounted + request.getTip();

        System.out.println("Subtotal: " + subtotal);
        System.out.println("GST: " + gst);
        System.out.println("Discount: " + request.getDiscount());
        System.out.println("Tip: " + request.getTip());
        System.out.println("Grand Total: " + grandTotal);

        return new BillResponse(subtotal, gst, request.getDiscount(), request.getTip(), grandTotal);
    }
}
