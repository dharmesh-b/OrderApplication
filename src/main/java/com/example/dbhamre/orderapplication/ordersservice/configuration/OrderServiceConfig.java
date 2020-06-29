package com.example.dbhamre.orderapplication.ordersservice.configuration;

import com.example.dbhamre.orderapplication.model.evt.OrderEvent;
import com.example.dbhamre.orderapplication.model.evt.PaymentEvent;
import com.example.dbhamre.orderapplication.ordersservice.eventhandlers.PaymentEventConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;
import reactor.core.publisher.FluxSink;

import java.util.function.Consumer;
import java.util.function.Supplier;

@Configuration
public class OrderServiceConfig {
	 @Autowired
	    private PaymentEventConsumerService consumerService;

	    @Bean
	    public DirectProcessor<OrderEvent> getFlux(){
	        return DirectProcessor.create();
	    }

	    @Bean
	    public FluxSink<OrderEvent> orderEventChannel(DirectProcessor<OrderEvent> processor){
	        return processor.sink();
	    }

	    @Bean
	    public Supplier<Flux<OrderEvent>> orderEventPublisher(DirectProcessor<OrderEvent> processor){
	        return () -> processor;
	    }

	    @Bean
	    public Consumer<PaymentEvent> paymentEventConsumer(){
	        return consumerService::consumePaymentEvent;
	    }

}
