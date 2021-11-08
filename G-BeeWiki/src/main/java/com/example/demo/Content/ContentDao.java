package com.example.demo.Content;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class ContentDao {
	
	public static List<EvaluationDto> evals;
	public static List<SubjectDto> subjects;
	public static List<AgencyDto> agencys;
	
	static {
		evals = new ArrayList();
		
		evals.add(new EvaluationDto("평가항목 1", "설명1"));
		evals.add(new EvaluationDto("평가항목 2", "설명2"));
		evals.add(new EvaluationDto("평가항목 3", "설명3"));
		evals.add(new EvaluationDto("평가항목 4", "설명4"));
		evals.add(new EvaluationDto("평가항목 5", "설명5"));
	}
	
	static {
		subjects = new ArrayList();
		
		subjects.add(new SubjectDto("과목명 1", "과목설명 1"));
		subjects.add(new SubjectDto("과목명 2", "과목설명 2"));
		subjects.add(new SubjectDto("과목명 3", "과목설명 3"));
		subjects.add(new SubjectDto("과목명 4", "과목설명 4"));
		subjects.add(new SubjectDto("과목명 5", "과목설명 5"));
	}
	
	static {
		agencys = new ArrayList();
		
		agencys.add(new AgencyDto(1, "기관명 1", "로고 1"));
		agencys.add(new AgencyDto(2, "기관명 2", "로고 2"));
		agencys.add(new AgencyDto(3, "기관명 3", "로고 3"));
		agencys.add(new AgencyDto(4, "기관명 4", "로고 4"));
		agencys.add(new AgencyDto(5, "기관명 5", "로고 5"));
	}
	
	public List<EvaluationDto> getAllEvaluation() {
		return evals;
	}
	
	public List<SubjectDto> getAllSubject() {
		return subjects;
	}
	
	public List<AgencyDto> getAllAgency() {
		return agencys;
	}
	
	public List<AgencyDto> getAgencyById(int agencyId) {
		return null;
	}

	public List<EvaluationDto> getEvaluationById(String evaluationId) {
		return null;
	}

	public List<SubjectDto> getSubjectById(String subjectId) {
		return null;
	}

	public List<AgencyDto> insertAgency(AgencyDto dto) {
		return null;
	}

	public List<EvaluationDto> insertEvaluation(EvaluationDto dto) {
		return null;
	}
	
	public List<SubjectDto> insertSubject(SubjectDto dto) {
		return null;
	}
	
	public List<AgencyDto> updateAgency(int agencyId, AgencyDto dto) {
		return null;
	}

	public List<EvaluationDto> updateEvaluation(String evaluationId, EvaluationDto dto) {
		return null;
	}

	public List<SubjectDto> updateSubject(String subjectId, SubjectDto dto) {
		return null;
	}

	public List<AgencyDto> deleteAgency(int agencyId) {
		return null;
	}

	public List<EvaluationDto> deleteEvaluation(String evaluationId) {
		return null;
	}

	public List<SubjectDto> deleteSubject(String subjectId) {
		return null;
	}

	
}
