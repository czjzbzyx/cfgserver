package com.vip.dw.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = { "com.vip.dw.*" })
@EnableConfigServer
@EnableDiscoveryClient
//@ServletComponentScan(value = { "com.vip.dw.*" })
public class Starter {

	public static void main(String[] args) {

		
		System.out.println(Math.abs("test-consumer-group3".hashCode()) % 50);
	
		SpringApplication.run(Starter.class, args);

	}

}
