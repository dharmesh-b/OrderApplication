package com.example.dbhamre.orderapplication.model.evt;

import lombok.Data;
@Data
public class OrderEvent {
	private Integer orderId;
    private Integer userId;
    private Integer price;
  
}
