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
@Table(name = "dec_work")
public class DecWork  implements Serializable {
	 private static final long serialVersionUID = 1L;
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private Integer id;
	    @JoinColumn(name = "id_work", referencedColumnName = "id_work")
	    @ManyToOne(optional = false)
	    private Workk idwork;
	    
	    @JoinColumn(name = "id_de", referencedColumnName = "id_de")
	    @ManyToOne(optional = false)
	    private Decentraliza idde;

		public DecWork() {
			super();
		}

		public DecWork(Integer id, Workk idwork, Decentraliza idde) {
			super();
			this.id = id;
			this.idwork = idwork;
			this.idde = idde;
		}

		public DecWork(Integer id) {
			super();
			this.id = id;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Workk getIdwork() {
			return idwork;
		}

		public void setIdwork(Workk idwork) {
			this.idwork = idwork;
		}

		public Decentraliza getIdde() {
			return idde;
		}

		public void setIdde(Decentraliza idde) {
			this.idde = idde;
		}

		public static long getSerialversionuid() {
			return serialVersionUID;
		}

		@Override
		public String toString() {
			return "DecWork [id=" + id + ", idwork=" + idwork + ", idde=" + idde + "]";
		}
	    
	    
	    
	    
}
