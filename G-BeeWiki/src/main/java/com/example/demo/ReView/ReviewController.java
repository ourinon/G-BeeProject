package com.example.demo.ReView;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/review")
public class ReviewController {
	
	@Autowired
	ReViewServiceImpl reviewService;
	
	@GetMapping("") // 리뷰 다 가져오기
	public List<ReViewDto> getAllReviews() {
		return reviewService.getAllReviews();
	}
	
	@GetMapping("/{reviewId}") // 리뷰아이디로 하나 가져오기
	public List<ReViewDto> getReviewById(@PathVariable int reviewId) {
		return reviewService.getReviewById(reviewId);
	}
	
	@PostMapping("/insertReview") // 리뷰 추가
	public List<ReViewDto> insertReview(@RequestBody ReViewDto dto) {
		return reviewService.insertReview(dto);
	}
	
	@PutMapping("/{reviewId}") // 리뷰 업데이트
	public List<ReViewDto> updateReview(@PathVariable int reviewId, @RequestBody ReViewDto dto) {
		return reviewService.updateReview(reviewId, dto);
	}
	
	@DeleteMapping("/{reviewId}") // 리뷰 삭제
	public List<ReViewDto> deleteReview(@PathVariable int reviewId) {
		return reviewService.deleteReview(reviewId);
	}
	

}
