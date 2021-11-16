package com.itheima.dao;

import com.itheima.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UerDao extends JpaRepository<User,Integer> {
}
