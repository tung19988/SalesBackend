package com.entyti;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "workk")

public class Workk implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_work")
    private Integer idWork;
    @Column(name = "work_name")
    private String workName;
    @Column(name = "statuss")
    private Boolean statuss;
    @Column(name = "prioritize")
    private String prioritize;
//    @JoinColumn(name = "id_empl", referencedColumnName = "id_empl")
//    @ManyToOne()
//    private Employee idEmpl;
//    @JoinColumn(name = "id_department", referencedColumnName = "id_department")
//    @ManyToOne()
//    private Department idDepartment;
    @ManyToMany()
    @JoinTable(
        name = "work_de", 
        joinColumns = { @JoinColumn(name = "id_work") }, 
        inverseJoinColumns = { @JoinColumn(name = "id_department") }
        )
    private Set<Department> idDepartment = new HashSet<>() ; 
    
    @ManyToMany()
    @JoinTable(
        name = "work_em", 
        joinColumns = { @JoinColumn(name = "id_work") }, 
        inverseJoinColumns = { @JoinColumn(name = "id_empl") }
        )
    private Set<Employee> idEmpl = new HashSet<>() ; 
   
    
    @JoinColumn(name = "assigner", referencedColumnName = "id_empl")
    @ManyToOne()
    private Employee assignerr;

    
	public Set<Employee> getIdEmpl() {
		return idEmpl;
	}

	public void setIdEmpl(Set<Employee> idEmpl) {
		this.idEmpl = idEmpl;
	}

	public Set<Department> getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(Set<Department> idDepartment) {
		this.idDepartment = idDepartment;
	}

	public Workk() {
    }

	public Workk(Integer idWork) {
		super();
		this.idWork = idWork;
	}


    public Integer getIdWork() {
        return idWork;
    }

    public void setIdWork(Integer idWork) {
        this.idWork = idWork;
    }

    public Employee getAssigner() {
		return assignerr;
	}

	public void setAssigner(Employee assigner) {
		this.assignerr = assigner;
	}

	public String getWorkName() {
        return workName;
    }

    public void setWorkName(String workName) {
        this.workName = workName;
    }

    public Boolean getStatuss() {
        return statuss;
    }

    public void setStatuss(Boolean statuss) {
        this.statuss = statuss;
    }

    public String getPrioritize() {
        return prioritize;
    }

    public void setPrioritize(String prioritize) {
        this.prioritize = prioritize;
    }


    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idWork != null ? idWork.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Workk)) {
            return false;
        }
        Workk other = (Workk) object;
        if ((this.idWork == null && other.idWork != null) || (this.idWork != null && !this.idWork.equals(other.idWork))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entyti.Workk[ idWork=" + idWork + " ]";
    }
    
}