package com.smartbill.smartbill.model;

import lombok.Data;
import java.util.List;

@Data
public class BillRequest {
    private List<Item> items;
    private double discount;
    private double tip;
}
