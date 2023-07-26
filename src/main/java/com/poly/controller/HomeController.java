package com.poly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.poly.dao.ImageDAO;
import com.poly.dao.OrderDAO;
import com.poly.dao.ProductDAO;

import com.poly.entity.Image;
import com.poly.entity.Product;
import com.poly.entity.Report;

@Controller
public class HomeController {
	@Autowired
	ProductDAO prodao;

	@Autowired
	ImageDAO imgdao;


	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("products", prodao.findAll());
		return "/user/index";
	}

	@RequestMapping("/about")
	public String about() {
		return "/user/about";
	}

	@RequestMapping("/nike")
	public String shopNike(Model model) {
		List<Product> product = prodao.findImageNK();

		model.addAttribute("products", product);
		return "/user/nike";
	}

	@RequestMapping("/mlb")
	public String shopMlb() {
		return "/user/mlb";
	}

	@RequestMapping("/adidas")
	public String shopAdidas() {
		return "/user/adidas";
	}

	@RequestMapping("/contact")
	public String contact() {
		return "/user/contact";
	}

	@RequestMapping("/cart")
	public String cart() {
		return "/user/cart";
	}

	@RequestMapping("/login")
	public String login() {
		return "/user/login";
	}

	@RequestMapping("/signup")
	public String signup() {
		return "/user/signup";
	}

	@RequestMapping("/forget-password")
	public String forgetPassword() {
		return "/user/forget-password";
	}

}
