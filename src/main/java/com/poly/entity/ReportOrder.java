package com.poly.entity;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReportOrder implements Serializable {
	@Id
	Long id;
	String fullname;
	String email;
	String address;
	String name;
	double price;
	int quantity;
	int size;
	Date createdate;

}
