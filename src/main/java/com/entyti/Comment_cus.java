package com.entyti;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comment_cus")
public class Comment_cus implements Serializable {
	
	private static final long serialVersionUID = 1L;
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_com")
	    private Integer idCom;
	    @Column(name = "note")
	    private String note;
	    @Column(name = "appointment_time")
	    private String appointmentTime;
	    @Column(name = "contact_time")
	    private String contactTime;
	    @Column(name = "datee")
	    private String datee;
	    @Column(name = "icon")
	    private String icon;
		@JoinColumn(name = "id_cus", referencedColumnName = "id_cus")
	    @ManyToOne(optional = false)
	    private Customer idCus;
		public Integer getIdCom() {
			return idCom;
		}

		public void setIdCom(Integer idCom) {
			this.idCom = idCom;
		}

		public String getNote() {
			return note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public String getDatee() {
			return datee;
		}

		public void setDatee(String datee) {
			this.datee = datee;
		}

		public String getIcon() {
			return icon;
		}

		public void setIcon(String icon) {
			this.icon = icon;
		}

		public Customer getIdCus() {
			return idCus;
		}

		public void setIdCus(Customer idCus) {
			this.idCus = idCus;
		}

		public String getContactTime() {
			return contactTime;
		}

		public void setContactTime(String contactTime) {
			this.contactTime = contactTime;
		}

		@Override
		public String toString() {
			return "Comment_cus [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}    
}
