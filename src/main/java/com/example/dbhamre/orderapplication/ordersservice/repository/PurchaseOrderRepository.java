package com.example.dbhamre.orderapplication.ordersservice.repository;

import com.example.dbhamre.orderapplication.ordersservice.entity.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Integer> {

}
