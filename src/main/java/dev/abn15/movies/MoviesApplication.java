package dev.abn15.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@RestController //tells the framework that its not just a normal class
public class MoviesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviesApplication.class, args);
	}
//	@GetMapping("/") lets framework this is a endpoint the argument is the point location "/root" will show content at localhost8080/root
//public String apiRoot(){
//	return "angel";
//	}



}
