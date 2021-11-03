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
		
		evals.add(new EvaluationDto(1, "����1"));
		evals.add(new EvaluationDto(2, "����2"));
		evals.add(new EvaluationDto(3, "����3"));
		evals.add(new EvaluationDto(4, "����4"));
		evals.add(new EvaluationDto(5, "����5"));
	}
	
	static {
		subjects = new ArrayList();
		
		subjects.add(new SubjectDto("���� �̸�1", "���񳻿�1"));
		subjects.add(new SubjectDto("���� �̸�2", "���񳻿�2"));
		subjects.add(new SubjectDto("���� �̸�3", "���񳻿�3"));
		subjects.add(new SubjectDto("���� �̸�4", "���񳻿�4"));
		subjects.add(new SubjectDto("���� �̸�5", "���񳻿�5"));
	}
	
	static {
		agencys = new ArrayList();
		
		agencys.add(new AgencyDto(1, "�Ҽ� �̸�1"));
		agencys.add(new AgencyDto(2, "�Ҽ� �̸�2"));
		agencys.add(new AgencyDto(3, "�Ҽ� �̸�3"));
		agencys.add(new AgencyDto(4, "�Ҽ� �̸�4"));
		agencys.add(new AgencyDto(5, "�Ҽ� �̸�5"));
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
