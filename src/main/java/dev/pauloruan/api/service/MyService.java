package dev.pauloruan.api.service;

import org.springframework.stereotype.Service;

import dev.pauloruan.api.data.Me;

@Service
public class MyService {

	public Me myData() {
		return new Me("Paulo Ruan", "Back-End Developer", new String[] { "Java", "Spring Boot", "Docker", "Cloud" });
	}
}
