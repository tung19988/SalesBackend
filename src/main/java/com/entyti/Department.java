package com.entyti;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")

public class Department implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_department")
    private Integer idDepartment;
    @Column(name = "department_name")
    private String departmentName;
    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name="id_department")

//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartment")
    private List<Workk> workkCollection;
//    @JoinColumn(name = "id_empl", referencedColumnName = "id_empl")
//    @ManyToOne

//    private Employee idEmpl;

//    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//    @JoinColumn(name="id_empl")
//    private List<Employee> employeeC;
    
//    public List<Employee> getEmployeeC() {
//		return employeeC;
//	}
//
//	public void setEmployeeC(List<Employee> employeeC) {
//		this.employeeC = employeeC;
//	}

	//    private Employee idEmpl;
//    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//    @JoinColumn(name="id_department")
   // @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartment")
//    private Collection<Employee> employeeCollection;

    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name="id_empl")
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpl")
    private Collection<Decentraliza> dec;

    public Department() {
    }
    public void setDec(Collection<Decentraliza> dec) {
		this.dec = dec;
	}
    public Department(Integer idDepartment) {
        this.idDepartment = idDepartment;
    }

    public Integer getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Integer idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

//    @XmlTransient
//    public Collection<Workk> getWorkkCollection() {
//        return workkCollection;
//    }

    public void setWorkkCollection(List<Workk> workkCollection) {
        this.workkCollection = workkCollection;
    }

//    public Employee getIdEmpl() {
//        return idEmpl;
//    }
//
//    public void setIdEmpl(Employee idEmpl) {
//        this.idEmpl = idEmpl;
//    }

//    @XmlTransient
//    public Collection<Employee> getEmployeeCollection() {
//        return employeeCollection;
//    }

//    public void setEmployeeCollection(Collection<Employee> employeeCollection) {
//        this.employeeCollection = employeeCollection;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDepartment != null ? idDepartment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Department)) {
            return false;
        }
        Department other = (Department) object;
        if ((this.idDepartment == null && other.idDepartment != null) || (this.idDepartment != null && !this.idDepartment.equals(other.idDepartment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entyti.Department[ idDepartment=" + idDepartment + " ]";
    }
}
