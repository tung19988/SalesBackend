package com.entyti;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "decentraliza")
public class Decentraliza {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "id_de")
private Integer idDe;
@Column(name = "levell")
private String levell;
@JoinColumn(name = "id_empl", referencedColumnName = "id_empl")
@ManyToOne(optional = false)
private Employee idEmpl;
@JoinColumn(name = "id_department", referencedColumnName = "id_department")
@ManyToOne(optional = false)
private Department idDepartment;
public Integer getIdDe() {
	return idDe;
}
public void setIdDe(Integer idDe) {
	this.idDe = idDe;
}
public String getLevell() {
	return levell;
}
public void setLevell(String levell) {
	this.levell = levell;
}
public Employee getIdEmpl() {
	return idEmpl;
}
public void setIdEmpl(Employee idEmpl) {
	this.idEmpl = idEmpl;
}
public Department getIdDepartment() {
	return idDepartment;
}
public void setIdDepartment(Department idDepartment) {
	this.idDepartment = idDepartment;
}
@Override
public String toString() {
	return "Decentraliza [idDe=" + idDe + ", levell=" + levell + ", idEmpl=" + idEmpl + ", idDepartment=" + idDepartment
			+ "]";
}


}
