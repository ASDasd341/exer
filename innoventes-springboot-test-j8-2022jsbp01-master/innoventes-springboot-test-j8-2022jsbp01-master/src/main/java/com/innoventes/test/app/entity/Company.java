package com.innoventes.test.app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Table(name = "company", uniqueConstraints = {@UniqueConstraint(columnNames = "company_code")})
@Entity
public class Company extends BaseEntity {

	public static final String getcompanyName = null;


	@Id
	@SequenceGenerator(sequenceName = "company_seq", allocationSize = 1, name = "company_seq")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "company_seq")
	private Long id;

	@NotNull(message = "name cannot be null")
	@NotEmpty(message = "name can not be empty")
	@Size(min = 5, message = "name must have 5 characters")
	@Column(name = "company_name")
	private String company;

	public Object getName() {
		// TODO Auto-generated method stub
		return null;
	};

	@NotBlank(message = "email cannot be blank")
	@Email(message = "Invalid email id")
	@Column(name = "email")
	private String email;
	
	
	@Positive(message = "integer strrength must be positive value")
	@Column(name = "strength")
	private Integer strength;
	
	@Column(name = "website_url")
	private String webSiteURL;


	public Long getId() {
		// TODO Auto-generated method stub
		return this.id;
	}
	
	
	@Pattern(regexp = "[A-Za-z]{2}[0-9]{2}[EN]$", message = "Invalid format")
	@Column(name = "company_code")
	private String companyCode;

	public @NotNull(message = "name cannot be null") @NotEmpty(message = "name can not be empty") @Size(min = 5, message = "name must have 5 characters") String setCompany(Object company) {
	 return this.company;
		
	}

	public @Positive(message = "integer strrength must be positive value") Integer setStrength(Object strength2) {
		return this.strength;
	}

	public @NotBlank(message = "email cannot be blank") @Email(message = "Invalid email id") String setEmail(Object email2) {
		return this.email;
	}

	public Long setId(Long id2) {
		return this.id;
	}

//	public String getCompany() {
//		return company;
//	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public String getWebSiteURL() {
		return webSiteURL;
	}

	public void setWebSiteURL(String webSiteURL) {
		this.webSiteURL = webSiteURL;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}



	public void setCompanyName(Object companyName) {
		this.setCompanyName(companyName);
	}

//	public String getCompany() {
//		return company;
//	}

//	public void setWebSiteURL(Object webSiteURL) {
//	}

}
