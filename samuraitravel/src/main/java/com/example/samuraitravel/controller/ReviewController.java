package com.example.samuraitravel.controller;

import com.example.samuraitravel.repository.ReviewRepository;


public class ReviewController{
	private final ReviewRepository reviewRepository;
	
	public ReviewController(ReviewRepository reviewRepository) {
		this.reviewRepository = reviewRepository;
	}
	
//	@GetMapping
//	public String show(Model model) {
//		List<Review> newReview = reviewRepository.findTop10ByOrderByCreatedAtDesc(house);
//		model.addAttribute("newReview",newReview);
//		return "house/show";
//	}
	
}