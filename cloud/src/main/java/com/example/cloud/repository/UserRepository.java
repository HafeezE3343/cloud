package com.example.cloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cloud.entity.UserEntity;
@Repository
public interface  UserRepository extends JpaRepository<UserEntity, Long> {

}
