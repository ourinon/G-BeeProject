package com.example.demo.Content;

public class AgencyDto {
	private int agencySeq;
	private String agencyName;
	private String agencyLogo;
	
	public AgencyDto(int agencySeq, String agencyName, String agencyLogo) {
		this.agencySeq = agencySeq;
		this.agencyName = agencyName;
		this.agencyLogo = agencyLogo;
	}
	
	public AgencyDto() {}

	public int getAgencySeq() {
		return agencySeq;
	}

	public void setAgencySeq(int agencySeq) {
		this.agencySeq = agencySeq;
	}

	public String getAgencyName() {
		return agencyName;
	}

	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}

	public String getAgencyLogo() {
		return agencyLogo;
	}

	public void setAgencyLogo(String agencyLogo) {
		this.agencyLogo = agencyLogo;
	}
	
	
	

}
