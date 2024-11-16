package com.devsuperior.javaspringprofessional.desafio01.services;

import com.devsuperior.javaspringprofessional.desafio01.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    public double shipment(Order order) {
        double basicAmount = order.getBasic();
        if (basicAmount < 100.00) {
            return 20.00;
        } else if (basicAmount < 200.00) {
            return 12.00;
        } else {
            return 0.00;
        }
    }
}
