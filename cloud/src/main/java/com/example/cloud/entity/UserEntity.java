package com.example.cloud.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
public class UserEntity {
	@Id
	private long id;
	private String name;
	private String address;
	private long mno;
}
