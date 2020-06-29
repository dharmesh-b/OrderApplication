package com.example.dbhamre.orderapplication.ordersservice.eventhandlers;

import com.example.dbhamre.orderapplication.model.enums.OrderStatus;
import com.example.dbhamre.orderapplication.model.evt.PaymentEvent;
import com.example.dbhamre.orderapplication.model.enums.PaymentStatus;
import com.example.dbhamre.orderapplication.ordersservice.repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class PaymentEventConsumerService {
	@Autowired
    private PurchaseOrderRepository purchaseOrderRepository;

    @Transactional
    public void consumePaymentEvent(PaymentEvent paymentEvent){
        this.purchaseOrderRepository.findById(paymentEvent.getOrderId())
                    .ifPresent(purchaseOrder -> {
                        purchaseOrder.setStatus(paymentEvent.getStatus().equals(PaymentStatus.APPROVED) ? OrderStatus.ORDER_COMPLETED : OrderStatus.ORDER_CANCELLED);
                        this.purchaseOrderRepository.save(purchaseOrder);
                    });
    }

}
