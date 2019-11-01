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
@Table(name = "Emp_work")
public class Emp_work {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Integer id;
	
    @JoinColumn(name = "id_empl", referencedColumnName = "id_empl")
	@ManyToOne(optional = false)
	private Employee idEmpl;
    
    @JoinColumn(name = "id_work", referencedColumnName = "id_work")
   	@ManyToOne(optional = false)
   	private Workk idWork;

	public Emp_work(Integer id, Employee idEmpl, Workk idWork) {
		super();
		this.id = id;
		this.idEmpl = idEmpl;
		this.idWork = idWork;
	}

	public Emp_work(Integer id) {
		super();
		this.id = id;
	}

	public Emp_work() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	public Employee getIdEmpl() {
		return idEmpl;
	}

	public void setIdEmpl(Employee idEmpl) {
		this.idEmpl = idEmpl;
	}

	public Workk getIdWork() {
		return idWork;
	}

	public void setIdWork(Workk idWork) {
		this.idWork = idWork;
	}

	@Override
	public String toString() {
		return "Emp_work [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
    
    
}
