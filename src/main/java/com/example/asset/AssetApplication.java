package com.example.asset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;


@SpringBootApplication
public class AssetApplication  {

	public static void main(String[] args) {
		SpringApplication.run(AssetApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception{
//		boolean flag =
//	이 부분에서 sql문 호출 진행
//	}
}


