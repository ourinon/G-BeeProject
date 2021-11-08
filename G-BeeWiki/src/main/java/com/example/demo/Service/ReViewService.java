package com.example.demo.Service;

import java.util.List;

import org.springframework.web.servlet.ModelAndView;

import com.example.demo.Dto.ReViewDto;

public interface ReViewService {
	
	public List<ReViewDto> getAllReviews();
	
	public List<ReViewDto> getReviewById(int reviewId); // 리뷰 아이디 로 리뷰 하나 가져오기
	
	public List<ReViewDto> insertReview(ReViewDto dto);
	
	public List<ReViewDto> updateReview(int reviewId, ReViewDto dto);

	public List<ReViewDto> deleteReview(int reviewId);


}
