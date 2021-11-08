package com.example.demo.Dto;

public class EvaluationDto {
	private String EvalSeq;
	private String EvalContent;
	
	public EvaluationDto(String evalSeq, String evalContent) {
		EvalSeq = evalSeq;
		EvalContent = evalContent;
	}
	
	public EvaluationDto() {}

	public String getEvalSeq() {
		return EvalSeq;
	}

	public void setEvalSeq(String evalSeq) {
		EvalSeq = evalSeq;
	}

	public String getEvalContent() {
		return EvalContent;
	}

	public void setEvalContent(String evalContent) {
		EvalContent = evalContent;
	}
	
	

}
