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
@Table(name = "comment_emp")
public class Comment_emp implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_com")
	    private Integer idComment;
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
	    
	    @JoinColumn(name = "id_empl", referencedColumnName = "id_empl")
	    @ManyToOne(optional = false)
	    private Employee idEmpl;

		public Integer getIdComment() {
			return idComment;
		}

		public void setIdComment(Integer idComment) {
			this.idComment = idComment;
		}

		public String getNote() {
			return note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public String getContactTime() {
			return contactTime;
		}

		public void setContactTime(String contactTime) {
			this.contactTime = contactTime;
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

		public Employee getIdEmpl() {
			return idEmpl;
		}

		public void setIdEmpl(Employee idEmpl) {
			this.idEmpl = idEmpl;
		}

		@Override
		public String toString() {
			return "Comment_emp [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}    
}
