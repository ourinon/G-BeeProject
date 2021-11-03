package com.example.demo.ReView;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.web.servlet.ModelAndView;

@Repository
public class ReViewDao {
	
	public ReViewDto dto1;
	
	public static List<ReViewDto> reviews;
	
	static {
		reviews = new ArrayList();
		
		reviews.add(new ReViewDto(1, "���1", "�ۼ���1", "���� ����1", "�� �׸�1"));
		reviews.add(new ReViewDto(2, "���2", "�ۼ���2", "���� ����2", "�� �׸�2"));
		reviews.add(new ReViewDto(3, "���3", "�ۼ���3", "���� ����3", "�� �׸�3"));
		reviews.add(new ReViewDto(4, "���4", "�ۼ���4", "���� ����4", "�� �׸�4"));
		reviews.add(new ReViewDto(5, "���5", "�ۼ���5", "���� ����5", "�� �׸�5"));
		
	}
	
	public List<ReViewDto> getAllReviews() {
		return reviews;
	}
	
	public List<ReViewDto> getReviewById(int reviewId) {
		return null;
	}
	
	public List<ReViewDto> insertReview(ReViewDto dto) {
		return null;
	}

	public List<ReViewDto> updateReview(int reviewId, ReViewDto dto) {
		return null;
	}

	public List<ReViewDto> deleteReview(int reviewId) {
		return null;
	}


}
