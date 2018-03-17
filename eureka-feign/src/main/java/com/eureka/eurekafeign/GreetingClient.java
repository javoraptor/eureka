package com.eureka.eurekafeign;

import org.springframework.cloud.openfeign.FeignClient;

//import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient extends GreetingController {
}