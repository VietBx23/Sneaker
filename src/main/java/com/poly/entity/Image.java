package com.poly.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Images")
public class Image {

	@Id
	String id;
	@ManyToOne @JoinColumn(name = "product_id")
	Product product;
	String image1;
	String image2;
	String image3;
	String image4;
	String image5;
	String image6;
}
