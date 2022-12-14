//package com.example.demo;
//
//import javax.persistence.Column;
//import javax.persistence.EnumType;
//import javax.persistence.Enumerated;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//
//import org.hibernate.annotations.Entity;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.context.annotation.Role;
//import org.springframework.data.annotation.Id;
//
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//
//
//@Getter
//@NoArgsConstructor
//@Entity
//public class User extends TimeEntity {    
//	@Id    
//	@GeneratedValue(strategy = GenerationType.IDENTITY)    
//	private Long id;     
//	@Column(nullable = false, length = 30, unique = true)    
//	private String username; // 아이디     
//	@Column(nullable = false, unique = true)    
//	private String nickname;     
//	@Column(length = 100)    
//	private String password;     
//	@Column(nullable = false, length = 50)    
//	private String email;     
//	@Enumerated(EnumType.STRING)    
//	@Column(nullable = false)    
//	private Role role;     
//	/* 회원정보 수정을 위한 set method*/
//	public void modify(String nickname, String password) {
//		this.nickname = nickname;        
//		this.password = password;    
//		}     
//	/* 소셜로그인시 이미 등록된 회원이라면 수정날짜만 업데이트하고     
//	 * * 기존 데이터는 그대로 보존하도록 예외처리 */    
//	public User updateModifiedDate() {        
//		this.onPreUpdate();        
//		return this;    
//		}     
//	
//		/*
//		 * public String getRoleValue() { return this.role.getValue(); }
//		 */
//		
//}
//
