package dev.pauloruan.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import dev.pauloruan.api.data.Me;
import dev.pauloruan.api.service.MyService;

@RestController
@RequestMapping("/api/v1")
public class MyController {
	private final MyService myService;

	@Autowired
	public MyController(MyService myService) {
		this.myService = myService;
	}

	@GetMapping()
	@ResponseStatus(HttpStatus.OK)
	public Me myData() {
		return myService.myData();
	}
}
