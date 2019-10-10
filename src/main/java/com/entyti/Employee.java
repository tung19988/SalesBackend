package com.entyti;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "employee")

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @NotNull
    @Column(name = "id_empl")
    private String idEmpl;
    @NotNull
    @Column(name = "name_empl")
    private String nameEmpl;
    @Column(name = "phone_num")
    private Integer phoneNum;
    @Column(name = "levell")
    private String levell;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Column(name = "email")
    private String email;
    @Column(name = "stt")
    private Boolean stt;
    @Column(name = "addresss")
    private String addresss;
    @Column(name = "date_of_birth")
    private String dateOfBirth;
    @NotNull
    @Column(name = "userr")
    private String userr;
    @NotNull
    @Column(name = "pass")
    private String pass;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpl")
    private Collection<Opportunity> opportunityCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpl")
    private Collection<Workk> workkCollection;
    @OneToMany(mappedBy = "idEmpl")
    private Collection<Department> departmentCollection;
    @JoinColumn(name = "id_department", referencedColumnName = "id_department")
    @ManyToOne(optional = false)
    private Department idDepartment;

    public Employee() {
    }

    public Employee(String idEmpl) {
        this.idEmpl = idEmpl;
    }

    public Employee(String idEmpl, String nameEmpl, String userr, String pass) {
        this.idEmpl = idEmpl;
        this.nameEmpl = nameEmpl;
        this.userr = userr;
        this.pass = pass;
    }

    public String getIdEmpl() {
        return idEmpl;
    }

    public void setIdEmpl(String idEmpl) {
        this.idEmpl = idEmpl;
    }

    public String getNameEmpl() {
        return nameEmpl;
    }

    public void setNameEmpl(String nameEmpl) {
        this.nameEmpl = nameEmpl;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getLevell() {
        return levell;
    }

    public void setLevell(String levell) {
        this.levell = levell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getStt() {
        return stt;
    }

    public void setStt(Boolean stt) {
        this.stt = stt;
    }

    public String getAddresss() {
        return addresss;
    }

    public void setAddresss(String addresss) {
        this.addresss = addresss;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getUserr() {
        return userr;
    }

    public void setUserr(String userr) {
        this.userr = userr;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @XmlTransient
    public Collection<Opportunity> getOpportunityCollection() {
        return opportunityCollection;
    }

    public void setOpportunityCollection(Collection<Opportunity> opportunityCollection) {
        this.opportunityCollection = opportunityCollection;
    }

    @XmlTransient
    public Collection<Workk> getWorkkCollection() {
        return workkCollection;
    }

    public void setWorkkCollection(Collection<Workk> workkCollection) {
        this.workkCollection = workkCollection;
    }

    @XmlTransient
    public Collection<Department> getDepartmentCollection() {
        return departmentCollection;
    }

    public void setDepartmentCollection(Collection<Department> departmentCollection) {
        this.departmentCollection = departmentCollection;
    }

    public Department getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Department idDepartment) {
        this.idDepartment = idDepartment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEmpl != null ? idEmpl.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.idEmpl == null && other.idEmpl != null) || (this.idEmpl != null && !this.idEmpl.equals(other.idEmpl))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entyti.Employee[ idEmpl=" + idEmpl + " ]";
    }
    
}
