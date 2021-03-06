package com.wtour.controller;

import com.wtour.service.ViewService;
import com.wtour.unit.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {

	@Autowired
	public ViewService viewService;

	@RequestMapping("/viewlist_page")
	public String viewList_Page() {
		return "viewList";
	}

	public Result viewList(Integer page, Integer limit) {
		Result result = viewService.getViewList(page, limit);
		return result;
	}
}
