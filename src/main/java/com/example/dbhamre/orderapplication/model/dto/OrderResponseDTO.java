package com.example.dbhamre.orderapplication.model.dto;

import com.example.dbhamre.orderapplication.model.enums.OrderStatus;

import lombok.Data;

@Data
public class OrderResponseDTO {
	private Integer id;
    private Integer userId;
    private Integer productId;
    private Integer price;
    private OrderStatus status;
    
   }
