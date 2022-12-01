package com.example.asset;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class AssetApplication  {   // implements CommandLineRunne

	public static void main(String[] args) {
		SpringApplication.run(AssetApplication.class, args);
	}

//	@Autowired // 자동으로 주입 (스프링이 관리하는 데이터 소스(객체))
//	DataSource dataSource;
//
//	@Override
//	public void run(String... args) throws Exception {
//		System.out.println("스프링 부트가 관리하는 빈을 사용할 수 있음");
//		Connection connection = dataSource.getConnection();
//
//		connection.close(); // sql을 가져올 수 있음
//	}
}
