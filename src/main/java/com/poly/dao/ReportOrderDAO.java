package com.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.entity.ReportOrder;

public interface ReportOrderDAO extends JpaRepository<ReportOrder, Long> {

	@Query("SELECT o.id, a.fullname,a.email,o.address,p.name, od.price, od.quantity, p.size,p.create_date FROM Account a JOIN Order o ON a.username = o.account.username"
			+ " JOIN OrderDetail od ON o.id = od.order.id" + " JOIN Product p ON od.product.id = p.id")
	List<ReportOrder> getAllOrderInfo();
}
