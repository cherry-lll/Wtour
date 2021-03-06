package com.wtour.controller;

import com.wtour.service.OrderService;
import com.wtour.unit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/order")
public class OrderController {

	@Autowired
	public OrderService orderService;

	@RequestMapping("orderlist_page")
	public String orderListPage(){
		return "orderList";
	}

	@RequestMapping("orderlist")
	public Result orderList(Integer page, Integer limit){
		Result result = orderService.getOrderList(page, limit);
		return result;
	}
}
