package com.ewolff.microservice.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//http://192.168.99.100:8080/  docker link
//https://github.com/ewolff/microservice-kafka/tree/master/docker
@SpringBootApplication
public class OrderApp {

	public static void main(String[] args) {
		SpringApplication.run(OrderApp.class, args);
	}

}
