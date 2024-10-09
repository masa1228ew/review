package com.example.samuraitravel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.House;
import com.example.samuraitravel.entity.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {
public List<Review> findByHouseId(Integer houseId);
public List<Review> findTop10ByOrderByCreatedAtDesc(House house);
}
