package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dto.AgencyDto;
import com.example.demo.Dto.EvaluationDto;
import com.example.demo.Dto.ReViewDto;
import com.example.demo.Dto.SubjectDto;
import com.example.demo.ServiceImpl.ContentServiceImpl;

@RestController
@RequestMapping("/content")
public class ContentController {
	
	@Autowired
	ContentServiceImpl contentservice;
	
	@GetMapping("/agency")
	public List<AgencyDto> getAllAgency() { // 모든 소속사 정보출력
		return contentservice.getAllAgency();
	}
	
	@GetMapping("/evaluation")
	public List<EvaluationDto> getAllEvaluation() { // 모든 평가항목 출력
		return contentservice.getAllEvaluation();
	}
	
	@GetMapping("/subject")
	public List<SubjectDto> getAllSubject() { // 모든 과목 출력
		return contentservice.getAllSubject();
	}
	
	@GetMapping("/{AgencyId}")
	public List<AgencyDto> getAgencyById(@PathVariable int AgencyId) { // 해당 소속사 정보출력
		return contentservice.getAgencyById(AgencyId);
	}
	
	@GetMapping("/{evaluationId}")
	public List<EvaluationDto> getEvaluationById(@PathVariable String evaluationId) { // 해당 평가항목 출력
		return contentservice.getEvaluationById(evaluationId);
	}
	
	@GetMapping("/{subjectId}")
	public List<SubjectDto> getSubjectById(@PathVariable String subjectId) { // 해당 과목 출력
		return contentservice.getSubjectById(subjectId);
	}
	
	@PostMapping("/insertAgency")
	public List<AgencyDto> insertAgency(@RequestBody AgencyDto dto) { // 소속사 정보추가
		return contentservice.insertAgency(dto);
	}
	
	@PostMapping("/insertEvaluation")
	public List<EvaluationDto> insertEvaluation(@RequestBody EvaluationDto dto) { // 평가항목 추가
		return contentservice.insertEvaluation(dto);
	}
	
	@PostMapping("/insertSubject")
	public List<SubjectDto> insertSubject(@RequestBody SubjectDto dto) { // 과목 추가
		return contentservice.insertSubject(dto);
	}
	
	@PutMapping("/agency/{AgencyId}")
	public List<AgencyDto> updateAgency(@PathVariable int AgencyId, @RequestBody AgencyDto dto) { // 소속사 업데이트
		return contentservice.updateAgency(AgencyId, dto);
	}
	
	@PutMapping("/evaluation/{evaluationId}")
	public List<EvaluationDto> updateEvaluation(@PathVariable String evaluationId, @RequestBody EvaluationDto dto) { //평가항목 업데이트 
		return contentservice.updateEvaluation(evaluationId, dto);
	}
	
	@PutMapping("/subject/{subjectId}")
	public List<SubjectDto> updateSubject(@PathVariable String subjectId, @RequestBody SubjectDto dto) {	// 과목 업데이트
		return contentservice.updateSubject(subjectId, dto);
	}
	
	@DeleteMapping("/agency/{AgencyId}")
	public List<AgencyDto> deleteAgency(@PathVariable int AgencyId) { // 소속사 삭제
		return contentservice.deleteAgency(AgencyId);
	}
	
	@DeleteMapping("/evaluation/{evaluationId}")
	public List<EvaluationDto> deleteEvaluation(@PathVariable String evaluationId) { //평가항목 삭제 
		return contentservice.deleteEvaluation(evaluationId);
	}
	
	@DeleteMapping("/subject/{subjectId}")
	public List<SubjectDto> deleteSubject(@PathVariable String subjectId) {	// 과목 삭제
		return contentservice.deleteSubject(subjectId);
	}
	
	

}
