package com.example.asset.repository;

import com.example.asset.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;

@Repository
public class UserDao {   // 데이터 입력,수정,삭제,조회 >빈으로 관리
     private final JdbcTemplate jdbcTemplate;

     public UserDao(DataSource dataSource) {
       jdbcTemplate = new JdbcTemplate();
     }

     // user 테이블에 저장, 성공여부 불리언으로 판단
    public boolean addUser(User user){
         String sql = "INSERT INTO user(Name, Id, password, birthday, email, nickname, phone_num) VALUE(?, ?, ?, ?, ?, ?, ?)";
         int result = jdbcTemplate.update(sql, user.getName(), user.getId(), user.getPassword(), user.getBirthday(),
                 user.getEmail(), user.getNickname(), user.getPhone_num());
         return result == 1;
    }
    // 삭제
    public boolean deleteUser(int Id){
         String sql = "DELETE FROM user WHERE ID = ?";
         int result = jdbcTemplate.update(sql, Id);
         return result == 1;
    }

    // 원하는 건 가져오기
    public User getUser(int Id){
         String sql = "SELECT Id, Name FROM user WHERE Id=?";
         return jdbcTemplate.queryForObject(sql, (rs, rowNum) ->{
             User user = new User();
             user.setId(rs.getInt("ID"));
             user.setName(rs.getString("Name"));
             return user;
         }, Id); //userId
    }
}
