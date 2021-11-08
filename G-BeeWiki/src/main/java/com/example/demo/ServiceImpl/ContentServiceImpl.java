package com.example.demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.ContentDao;
import com.example.demo.Dto.AgencyDto;
import com.example.demo.Dto.EvaluationDto;
import com.example.demo.Dto.SubjectDto;
import com.example.demo.Service.ContentService;

@Service
public class ContentServiceImpl implements ContentService{
	
	@Autowired
	ContentDao contentDao;
	
	public List<AgencyDto> getAllAgency() {
		return contentDao.getAllAgency();
	}
	
	public List<EvaluationDto> getAllEvaluation() {
		return contentDao.getAllEvaluation();
	}
	
	public List<SubjectDto> getAllSubject() {
		return contentDao.getAllSubject();
	}
	
	public List<AgencyDto> getAgencyById(int agencyId) {
		return contentDao.getAgencyById(agencyId);
	}
	
	public List<EvaluationDto> getEvaluationById(String evaluationId) {
		return contentDao.getEvaluationById(evaluationId);
	}
	
	public List<SubjectDto> getSubjectById(String subjectId) {
		return contentDao.getSubjectById(subjectId);
	}

	public List<AgencyDto> insertAgency(AgencyDto dto) {
		return contentDao.insertAgency(dto);
	}

	public List<EvaluationDto> insertEvaluation(EvaluationDto dto) {
		return contentDao.insertEvaluation(dto);
	}

	public List<SubjectDto> insertSubject(SubjectDto dto) {
		return contentDao.insertSubject(dto);
	}

	public List<AgencyDto> updateAgency(int agencyId, AgencyDto dto) {
		return contentDao.updateAgency(agencyId, dto);
	}

	public List<EvaluationDto> updateEvaluation(String evaluationId, EvaluationDto dto) {
		return contentDao.updateEvaluation(evaluationId, dto);
	}

	public List<SubjectDto> updateSubject(String subjectId, SubjectDto dto) {
		return contentDao.updateSubject(subjectId, dto);
	}

	public List<AgencyDto> deleteAgency(int agencyId) {
		return contentDao.deleteAgency(agencyId);
	}

	public List<EvaluationDto> deleteEvaluation(String evaluationId) {
		return contentDao.deleteEvaluation(evaluationId);
	}

	public List<SubjectDto> deleteSubject(String subjectId) {
		return contentDao.deleteSubject(subjectId);
	}


}
