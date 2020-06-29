package com.example.dbhamre.orderapplication.ordersservice.controller;

import com.example.dbhamre.orderapplication.model.dto.OrderRequestDTO;
import com.example.dbhamre.orderapplication.model.dto.OrderResponseDTO;
import com.example.dbhamre.orderapplication.ordersservice.entity.PurchaseOrder;
import com.example.dbhamre.orderapplication.ordersservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {
	@Autowired
    private OrderService orderService;

    @PostMapping("/create")
    public PurchaseOrder createOrder(@RequestBody OrderRequestDTO dto){
        return this.orderService.createOrder(dto);
    }

    @GetMapping("/all")
    public List<OrderResponseDTO> getOrders(){
        return this.orderService.getAll();
    }
}
