package com.entyti;


import java.io.Serializable;

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
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;
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
    
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "idCus")

    private List<Comment_cus> commCollec;
    
	public void setCommCollec(List<Comment_cus> commCollec) {
		this.commCollec = commCollec;
	}
	public Customer(Integer idCus) {
		
		this.idCus = idCus;
	}
	
	public Customer() {
		super();
	}
	public Customer(Integer idCus, String nameCus, Integer phoneNum, String email, String stt, String userCus,
			String passCus, String content, List<Comment_cus> commCollec) {
		super();
		this.idCus = idCus;
		this.nameCus = nameCus;
		this.phoneNum = phoneNum;
		this.email = email;
		this.stt = stt;
		this.userCus = userCus;
		this.passCus = passCus;
		this.content = content;
		this.commCollec = commCollec;
	}


    @Column(name = "pass_cus")
    private String  passCus;
    
    @OneToMany(cascade=CascadeType.ALL,mappedBy = "idCus")
//    @JoinColumn(name="id_comcus")
    private Collection<Comment_cus> idCommcus;
    
     


	public Integer getIdCus() {
		return idCus;
	}

	public void setIdCommcus(Collection<Comment_cus> idCommcus) {
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

		return "Customer [idCus=" + idCus + ", nameCus=" + nameCus + ", phoneNum=" + phoneNum + ", email=" + email
				+ ", stt=" + stt + ", userCus=" + userCus + ", passCus=" + passCus + ", content=" + content
				+ ", commCollec=" + commCollec + "]";
	}


}