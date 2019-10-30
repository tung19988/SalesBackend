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
@Table(name = "commentt")
public class Commentt implements Serializable {
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
	    
	    @JoinColumn(name = "id_opportunity", referencedColumnName = "id_opportunity")
	    @ManyToOne(optional = false)
	    private Opportunity idOppo;
	    
	   
		public String getIcon() {
			return icon;
		}


		public void setIcon(String icon) {
			this.icon = icon;
		}


		public Commentt() {
			super();
		}
		

		
		public String getAppointmentTime() {
			return appointmentTime;
		}


		public void setAppointmentTime(String appointmentTime) {
			this.appointmentTime = appointmentTime;
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

//ddddddddddd

		public Commentt(Integer idComment, String note, Opportunity idOppo) {
			super();
			this.idComment = idComment;
			this.note = note;
			this.idOppo = idOppo;
		}

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

		public Opportunity getIdOppo() {
			return idOppo;
		}

		public void setIdOppo(Opportunity idOppo) {
			this.idOppo = idOppo;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}


		@Override
		public String toString() {
			return "Commentt [idComment=" + idComment + ", note=" + note + ", appointmentTime=" + appointmentTime
					+ ", contactTime=" + contactTime + ", datee=" + datee + ", idOppo=" + idOppo + "]";
		}	    
}
