package com.huifu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.huifu.movie.mapper")
public class MovieMpApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieMpApplication.class, args);
	}

}
