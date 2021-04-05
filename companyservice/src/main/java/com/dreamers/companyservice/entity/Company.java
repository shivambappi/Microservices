package com.dreamers.companyservice.entity;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity

@Data
@AllArgsConstructor
@NoArgsConstructor
@XmlRootElement
public class Company {
	
	private static final Long SerialVersionUID=1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer companyId;
	private String companyName;
	private String companyAddress;

}
