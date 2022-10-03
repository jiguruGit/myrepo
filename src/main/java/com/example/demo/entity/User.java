package com.example.demo.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "User")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
	
	private String id;
	
	private String name;
	
	private String date_of_birth;
	
	private String password;
	
	private String user_type_id;
	
	private boolean is_active;
	
	private Date created_on;
	
	private Date updated_on ;
}
