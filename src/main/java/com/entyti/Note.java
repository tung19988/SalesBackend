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
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "note")
public class Note implements Serializable {
	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id_note")
	    private Integer idNote;
	    @Column(name = "note")
	    private String note;
	    @Column(name = "datee")
	    private String date;
	    
	    @JoinColumn(name = "id_empl", referencedColumnName = "id_empl")
	    @ManyToOne()
	    private Employee idEmpl;

		public Note() {
			super();
		}

		public Integer getIdNote() {
			return idNote;
		}

		public void setIdNote(Integer idNote) {
			this.idNote = idNote;
		}

		public String getNote() {
			return note;
		}

		public void setNote(String note) {
			this.note = note;
		}

		public String getDate() {
			return date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public Employee getIdEmpl() {
			return idEmpl;
		}

		public void setIdEmpl(Employee idEmpl) {
			this.idEmpl = idEmpl;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return "Note [idNote=" + idNote + ", note=" + note + ", date=" + date + ", idEmpl=" + idEmpl + "]";
		}
	    
	    
}
