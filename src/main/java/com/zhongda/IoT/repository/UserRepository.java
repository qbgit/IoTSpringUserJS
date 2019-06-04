package com.zhongda.IoT.repository;

import com.zhongda.IoT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * author 钱波.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}