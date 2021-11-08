package com.example.demo.Service;

import java.util.List;

import com.example.demo.Dto.AgencyDto;
import com.example.demo.Dto.EvaluationDto;
import com.example.demo.Dto.SubjectDto;

public interface ContentService {
	
	// 불러오기
	public List<AgencyDto> getAllAgency();
	
	public List<EvaluationDto> getAllEvaluation() ;
	
	public List<SubjectDto> getAllSubject();
	
	//하나 불러오기 (디테일)
	
	public List<AgencyDto> getAgencyById(int agencyId);
	
	public List<EvaluationDto> getEvaluationById(String evaluationId);
	
	public List<SubjectDto> getSubjectById(String subjectId);
	
	// 추가
	public List<AgencyDto> insertAgency(AgencyDto dto);

	public List<EvaluationDto> insertEvaluation(EvaluationDto dto);

	public List<SubjectDto> insertSubject(SubjectDto dto);
	
	// 수정
	public List<AgencyDto> updateAgency(int agencyId, AgencyDto dto);

	public List<EvaluationDto> updateEvaluation(String evaluationId, EvaluationDto dto);

	public List<SubjectDto> updateSubject(String subjectId, SubjectDto dto);
	
	//삭제
	
	public List<AgencyDto> deleteAgency(int agencyId);

	public List<EvaluationDto> deleteEvaluation(String evaluationId);

	public List<SubjectDto> deleteSubject(String subjectId);
		
	

}
