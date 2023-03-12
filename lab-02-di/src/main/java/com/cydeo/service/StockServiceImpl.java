package com.cydeo.service;

import com.cydeo.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class StockServiceImpl implements StockService{
    @Override
    public boolean checkStockIsAvailable(Product product, int quantity) {
        return product.getRemainingQuantity() > quantity;
    }
}
