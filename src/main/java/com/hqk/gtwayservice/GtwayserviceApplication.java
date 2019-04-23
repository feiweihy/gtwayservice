package com.hqk.gtwayservice;

import com.hqk.gtwayservice.resolver.IpResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableHystrix
public class GtwayserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GtwayserviceApplication.class, args);
	}

	@Bean
	public IpResolver ipResolver(){
		return new IpResolver();
	}

}
