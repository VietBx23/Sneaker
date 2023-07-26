package com.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.entity.Order;
import com.poly.entity.OrderDetail;
import com.poly.entity.Report;


public interface OrderDetailDAO extends JpaRepository<OrderDetail, Long> {
	
	@Query("select o from OrderDetail o ")
	
	List<OrderDetail> getReportOrderDetail();
}
