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
	    
	    @JoinColumn(name = "id_opportunity", referencedColumnName = "id_opportunity")
	    @ManyToOne(optional = false)
	    private Opportunity idOppo;

		public Commentt() {
			super();
		}

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
			return "Commentt [idComment=" + idComment + ", note=" + note + ", idOppo=" + idOppo + "]";
		}

	    
}
