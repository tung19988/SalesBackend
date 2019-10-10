package com.entyti;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlTransient;

import com.sun.istack.NotNull;

@Entity
@Table(name = "department")

public class Department implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @NotNull
    @Column(name = "id_department")
    private String idDepartment;
    @Column(name = "department_name")
    private String departmentName;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartment")
    private Collection<Workk> workkCollection;
    @JoinColumn(name = "id_empl", referencedColumnName = "id_empl")
    @ManyToOne
    private Employee idEmpl;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idDepartment")
    private Collection<Employee> employeeCollection;

    public Department() {
    }

    public Department(String idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(String idDepartment) {
        this.idDepartment = idDepartment;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @XmlTransient
    public Collection<Workk> getWorkkCollection() {
        return workkCollection;
    }

    public void setWorkkCollection(Collection<Workk> workkCollection) {
        this.workkCollection = workkCollection;
    }

    public Employee getIdEmpl() {
        return idEmpl;
    }

    public void setIdEmpl(Employee idEmpl) {
        this.idEmpl = idEmpl;
    }

    @XmlTransient
    public Collection<Employee> getEmployeeCollection() {
        return employeeCollection;
    }

    public void setEmployeeCollection(Collection<Employee> employeeCollection) {
        this.employeeCollection = employeeCollection;
    }

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
