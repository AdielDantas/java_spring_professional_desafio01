package com.devsuperior.javaspringprofessional.desafio01.services;

import com.devsuperior.javaspringprofessional.desafio01.entities.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private ShippingService shippingService;

    public double total(Order order) {
        double discountedPrice = order.getBasic() * (1 - order.getDiscount() / 100);
        double shippingCost = shippingService.shipment(order);
        return discountedPrice + shippingCost;
    }
}
