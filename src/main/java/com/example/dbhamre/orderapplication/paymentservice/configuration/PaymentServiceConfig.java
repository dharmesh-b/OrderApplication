package com.example.dbhamre.orderapplication.paymentservice.configuration;

import com.example.dbhamre.orderapplication.model.evt.OrderEvent;
import com.example.dbhamre.orderapplication.model.evt.PaymentEvent;
import com.example.dbhamre.orderapplication.paymentservice.eventhandlers.OrderEventProcessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class PaymentServiceConfig {

    @Autowired
    private OrderEventProcessorService orderEventProcessorService;

    @Bean
    public Function<OrderEvent, PaymentEvent> orderEventProcessor(){
        return orderEventProcessorService::processOrderEvent;
    }
}