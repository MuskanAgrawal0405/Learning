package com.dsc.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Tryyyy")
@Inheritance(strategy = InheritanceType.JOINED)
public class DoubleValuedDS implements Serializable {
	private static final long serialVersionUID = 1L;
	@Getter
	@Setter
	@Column(name = "SerialNumber")
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int primaryKey;
	@Getter
	@Setter
	@Column(name = "Stitch_Type")
	private String key;
	@Getter
	@Setter
	@Column(name = "Durability")
	private int value;
}
