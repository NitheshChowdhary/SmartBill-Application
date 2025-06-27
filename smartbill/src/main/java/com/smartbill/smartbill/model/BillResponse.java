package com.smartbill.smartbill.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BillResponse {
    private double subtotal;
    private double gstTotal;
    private double discount;
    private double tip;
    private double totalAmount;
}