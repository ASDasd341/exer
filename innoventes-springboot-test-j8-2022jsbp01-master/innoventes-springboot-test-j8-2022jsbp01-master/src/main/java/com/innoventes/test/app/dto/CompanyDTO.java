package com.innoventes.test.app.dto;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CompanyDTO {

	@Id
	@SequenceGenerator(sequenceName = "company_seq", allocationSize = 1, name = "company_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_seq")
	private Long id;

	@NotNull(message = "name cannot be null")
	@NotEmpty(message = "name can not be empty")
	@Size(min = 5, message = "name must have 5 characters")
	private String company;

	@NotBlank(message = "email cannot be blank")
	@Email(message = "Invalid email id")
	private String email;


	@Positive(message = "integer strrength must be positive value")
	private Integer strength;
	
	private String webSiteURL;
	

	@Pattern(regexp = "[A-Za-z]{2}[0-9]{2}[EN]$", message = "Invalid format")
	@Column(name = "company_code")
	private String companyCode;

	public void orElseThrow(Exception exception) {
		
	}

	public String getCompany() {

		return this.getCompany();
	}

	public Object getStrength() {
		
		return this.getStrength();
	}

	public Object getEmail() {
		
		return this.getEmail();
	}


	public void setId(Long id) {

	}

	public Long getId() {
		return this.getId();
	}

	public String getWebSiteURL() {
		return this.getWebSiteURL();
	}

	public void setCompany(String company) {

	}

	public void setEmail(String email) {
	}

	public void setStrength(Integer strength) {
	}

	public void setWebSiteURL(String webSiteURL) {
	}
}
