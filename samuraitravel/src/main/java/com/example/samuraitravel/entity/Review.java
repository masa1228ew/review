package com.example.samuraitravel.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="review")
@Data
public class Review {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name="id")
 private Integer id;
 
 @ManyToOne
 @JoinColumn(name="user_id")
 private User user;
 
 @ManyToOne
 @JoinColumn(name="house_id")
 private House house;
 
 @Column(name="review")
 private Integer review;
 
 @Column(name="created_at",insertable=false,updatable=false)
 private Timestamp createdAt;
 
 @Column(name="content")
 private String content;
}
