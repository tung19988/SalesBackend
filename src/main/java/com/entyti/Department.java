package com.entyti;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "department")

public class Department implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_department")
    private Integer idDepartment;
    @Column(name = "department_name")
    private String departmentName;

    @OneToMany(cascade=CascadeType.ALL, mappedBy = "idDepartment")
    private List<Employee> listEmployee ;
    
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(
            name = "work_de", 
            joinColumns = { @JoinColumn(name = "id_department") }, 
            inverseJoinColumns = { @JoinColumn(name = "id_work") } )
        private Set<Workk> idWork = new HashSet<>() ; 

    
    

	public void setIdWork(Set<Workk> idWork) {
		this.idWork = idWork;
	}
	public Department() {
    }
    public Department(Integer idDepartment) {
        this.idDepartment = idDepartment;
    }

    public Integer getIdDepartment() {
        return idDepartment;
    }
    
	public void setListEmployee(List<Employee> listEmployee) {
		this.listEmployee = listEmployee;
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

//    public void setWorkkCollection(List<Workk> workkCollection) {
//        this.workkCollection = workkCollection;
//    }

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
