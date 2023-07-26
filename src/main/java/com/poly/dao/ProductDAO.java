package com.poly.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.poly.entity.Product;
import com.poly.entity.Report;
import com.poly.entity.ReportOrder;

public interface ProductDAO extends JpaRepository<Product, Long> {
//@Query("\r\n"
//		+ "Select o from Product p\r\n"
//		+ "inner join Image im on im.product = p.id")
//List<Product> findAll();
	@Query("Select o from Product o where o.category like 'NK' ")
	List<Product> findImageNK();

	@Query("SELECT new Report(o.category, sum(o.price), count(o)) " + " FROM Product o " + " GROUP BY o.category"
			+ " ORDER BY sum(o.price) DESC")
	List<Report> getInventoryByCategory();
	
	
	
	// report

//	@Query("SELECT a.id as accountId, a.username, o.id as orderId, o.orderDate, od.id as orderDetailId, p.name as productName, od.quantity "
//			+ "FROM Account a " + "JOIN Order o ON a.id = o.accountId " + "JOIN OrderDetail od ON o.id = od.orderId "
//			+ "JOIN Product p ON od.productId = p.id")

	

}
