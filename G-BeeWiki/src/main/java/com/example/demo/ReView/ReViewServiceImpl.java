package com.example.demo.ReView;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service("ReViewService")
public class ReViewServiceImpl implements ReViewService{
	
	@Autowired
	ReViewDao reviewDao;
	
	public List<ReViewDto> getAllReviews() {
		return reviewDao.getAllReviews();
	}
	
	public List<ReViewDto> getReviewById(int reviewId) {
		// TODO Auto-generated method stub
		return reviewDao.getReviewById(reviewId);
	}
	
	public List<ReViewDto> insertReview(ReViewDto dto) {
		return reviewDao.insertReview(dto);
	}

	public List<ReViewDto> updateReview(int reviewId, ReViewDto dto) {
		// TODO Auto-generated method stub
		return reviewDao.updateReview(reviewId, dto);
	}

	public List<ReViewDto> deleteReview(int reviewId) {
		// TODO Auto-generated method stub
		return reviewDao.deleteReview(reviewId);
	}

	
	

}
