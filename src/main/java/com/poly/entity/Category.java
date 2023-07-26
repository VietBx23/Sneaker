package com.poly.entity;

import java.io.Serializable;
import java.util.List;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Entity
@Table(name = "Categories")
public class Category implements Serializable{

	@Id
	private String id;
	@NotBlank
	private String name;
	private @OneToMany(mappedBy = "category")
	List<Product> products;
	
}
