package com.smartbill.smartbill.utility;

import com.smartbill.smartbill.model.Item;
import java.util.List;

public class GstCalculator {
    private static final double GST_RATE = 0.18; // 18%

    public static double calculateSubtotal(List<Item> items) {
        if (items == null) return 0;
        return items.stream()
                .mapToDouble(Item::getPrice)
                .sum();
    }

    public static double calculateGST(List<Item> items) {
        return calculateSubtotal(items) * GST_RATE;
    }
}
