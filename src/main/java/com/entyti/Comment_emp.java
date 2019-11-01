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
	    @Column(name = "id_comemp")
	    private Integer idCommente;
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

	

		public Comment_emp(Integer idComment) {
			super();
			this.idCommente = idComment;
		}

		public Comment_emp() {
			super();
		}

		public Comment_emp(Integer idComment, String note, String appointmentTime, String contactTime, String datee,
				String icon, Employee idEmpl) {
			super();
			this.idCommente = idComment;
			this.note = note;
			this.appointmentTime = appointmentTime;
			this.contactTime = contactTime;
			this.datee = datee;
			this.icon = icon;
			this.idEmpl = idEmpl;
		}
		 
		
	
		public Integer getIdCommente() {
			return idCommente;
		}

		public void setIdCommente(Integer idCommente) {
			this.idCommente = idCommente;
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
