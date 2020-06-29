package com.example.dbhamre.orderapplication.ordersservice.entity;

import com.example.dbhamre.orderapplication.model.enums.OrderStatus;
import lombok.Data;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@ToString
public class PurchaseOrder {
	@Id
    @GeneratedValue
    private Integer id;
    private Integer userId;
    private Integer productId;
    private Integer price;
    private OrderStatus status;
    
    public Integer getUserId() {
    	// TODO Auto-generated method stub
    	return userId;
    	}
    public Integer getId() {
    	// TODO Auto-generated method stub
    	return id;
    	}
    public Integer getPrice() {
    	// TODO Auto-generated method stub
    	return price;
    	}
    public OrderStatus getStatus() {
    	// TODO Auto-generated method stub
    	return status;
    	}
    
    public Integer getProductId() {
    	// TODO Auto-generated method stub
    	return productId;
    	}
    
    public void setOrderId(Integer orderId) {
  	  this.id = orderId;
  	 }
    public void setUserId(Integer userId) {
	  this.userId = userId;
	 }
  
    public void setPrice(Integer price) {
  	  this.price = price;
  	 }
    
    public void setProductId(Integer productId) {
    	  this.productId = productId;
    	 }
    public void setStatus(OrderStatus status) {
  	  this.status = status;
  	 }
}
