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
@Table(name = "comment_cus")
public class CommentCus {
	   	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_comcus")
	    private Integer idCommcus;
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


	    
		public Integer getIdCommcus() {
			return idCommcus;
		}

		public void setIdCommcus(Integer idCommcus) {
			this.idCommcus = idCommcus;
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

		@Override
		public String toString() {
			return "CommentCus [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
					+ super.toString() + "]";
		}
	    
}
