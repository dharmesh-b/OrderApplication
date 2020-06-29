package com.example.dbhamre.orderapplication.model.evt;

import com.example.dbhamre.orderapplication.model.enums.PaymentStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class PaymentEvent {

	 private Integer orderId;
	 private PaymentStatus status;
	 public PaymentEvent(Integer orderId) {
	        this.orderId = orderId;
	    }
	    
	 
	    public Integer getOrderId() {
	    	  return orderId;
	    	 }
	    public PaymentStatus getStatus() {
	    	  return status;
	    	 }
	      
	      public void setOrderId(Integer orderId) {
	      	  this.orderId = orderId;
	      	 }
	      public void setStatus(PaymentStatus status) {
	    	  this.status = status;
	    	 }
	      
	      
}
