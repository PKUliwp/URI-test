package com.uri.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/live")
public class ToyApplication {
	@GetMapping(produces = MediaType.TEXT_PLAIN_VALUE, value = "/filter")
	public String filter(@RequestParam("ids") int[] ids,
						 @RequestParam("packageId") int[] packageId,
						 @RequestParam("deviceId") int deviceId,
						 @RequestParam(value = "couch_das", defaultValue = "") String[] couchDas,
						 @RequestParam(value = "roaming_das", defaultValue = "") String[] roamingDas,
						 @RequestParam(value = "start", defaultValue = "0") long start,
						 @RequestParam(value = "end", defaultValue = "0") long end,
						 @RequestParam(value = "column", defaultValue = "AVAILABLE") String column,
						 @RequestParam(value = "order", defaultValue = "ASC") String order) {
		return "ok";
	}

	@RequestMapping("/health_check")
	public String health() {
		return "ok";
	}

	public static void main(String[] args) {
		SpringApplication.run(ToyApplication.class, args);
	}
}
