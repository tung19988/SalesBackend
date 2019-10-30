package com.entyti;

import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_cus")
    private Integer idCus;
    @Column(name = "name_cus")
    private String nameCus;
    @Column(name = "phone_num")
    private Integer phoneNum;
    @Column(name = " email")
    private String  email;
    @Column(name = " stt")
    private String stt;
    @Column(name = "user_cus")
    private String  userCus;
    @Column(name = "content")
    private String  content;
    @Column(name = "pass_cus")
    private String  passCus;
    
    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name="id_comcus")
    private Collection<CommentCus> idCommcus;
    
     
//	public List<CommentCus> getCommCollection() {
//		return commCollection;
//	}
//	public void setCommCollection(List<CommentCus> commCollection) {
//		this.commCollection = commCollection;
//	}
    
	public Integer getIdCus() {
		return idCus;
	}
//	public List<CommentCus> getIdCommcus() {
//		return idCommcus;
//	}
	public void setIdCommcus(Collection<CommentCus> idCommcus) {
		this.idCommcus = idCommcus;
	}
	public void setIdCus(Integer idCus) {
		this.idCus = idCus;
	}
	public String getNameCus() {
		return nameCus;
	}
	public void setNameCus(String nameCus) {
		this.nameCus = nameCus;
	}
	public Integer getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(Integer phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStt() {
		return stt;
	}
	public void setStt(String stt) {
		this.stt = stt;
	}
	public String getUserCus() {
		return userCus;
	}
	public void setUserCus(String userCus) {
		this.userCus = userCus;
	}
	public String getPassCus() {
		return passCus;
	}
	public void setPassCus(String passCus) {
		this.passCus = passCus;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Customer [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}


	
    
    
}
