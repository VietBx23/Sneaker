package com.poly.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;

@Service
public class SessionService {

	@Autowired
	HttpSession session;

	public <T> T get(String name, T defaultValue) {
		T value = get(name);
		return value != null ? value : defaultValue;
	}
	
	/**
	* Đọc giá trị của attribute trong session
	* @param name tên attribute
	* @return giá trị đọc được hoặc null nếu không tồn tại
	*/
	public <T> T get(String name) {
		if(session.getAttribute(name)!= null)
			return (T) session.getAttribute(name);
		else 
			return null;
	}

	/**
	* Thay đổi hoặc tạo mới attribute trong session
	* @param name tên attribute
	* @param value giá trị attribute
	*/
	public void set(String name, Object value) {
		session.setAttribute(name, value);
	}

	/**
	* Xóa attribute trong session
	* @param name tên attribute cần xóa
	*/
	public void remove(String name) {
		session.removeAttribute(name);
	}

}
