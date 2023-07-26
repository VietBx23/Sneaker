package com.poly.dao;



import org.springframework.data.jpa.repository.JpaRepository;


import com.poly.entity.Image;

public interface ImageDAO extends JpaRepository<Image, String>{
//    @Query("select o.image1 from Image where o.Product.id = ?")
//	List<Image> findImage(String id,String image);
}
