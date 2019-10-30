package com.entyti;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.NotNull;


/**
 *
 * @author Admin
 */
@Entity
@Table(name = "employee")

public class Employee implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empl")
    private Integer idEmpl;
    @NotNull
    @Column(name = "name_empl")
    private String nameEmpl;
    @Column(name = "phone_num")
    private Integer phoneNum;
//    @Column(name = "levell")
//    private String levell;
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
    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name="id_empl")
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpl")
    private Collection<Opportunity> opportunityCollection;
    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name="id_empl")
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpl")
    private Collection<Workk> workkC;
//    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//    @JoinColumn(name="id_empl")
//    @OneToMany(mappedBy = "idEmpl")
//    private Collection<Department> departmentCollection;
//    @JoinColumn(name = "id_department", referencedColumnName = "id_department")
//    @ManyToOne(optional = false)
//    private Department idDepartment;
    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name="id_empl")
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpl")
    private Collection<Decentraliza> dec;
    
    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
    @JoinColumn(name="id_empl")
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpl")
    private Collection<Note> noteCollection;
    public Employee() {
    }

    public Employee(Integer idEmpl) {
        this.idEmpl = idEmpl;
    }

    public Employee(Integer idEmpl, String nameEmpl, String userr, String pass ) {
        this.idEmpl = idEmpl;
        this.nameEmpl = nameEmpl;
        this.userr = userr;
        this.pass = pass;
    }

    public Integer getIdEmpl() {
        return idEmpl;
    }

    public void setIdEmpl(Integer idEmpl) {
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

//    public String getLevell() {
//        return levell;
//    }
//
//    public void setLevell(String levell) {
//        this.levell = levell;
//    }

    
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

//    @XmlTransient
//    public Collection<Opportunity> getOpportunityCollection() {
//        return opportunityCollection;
//    }

    public void setOpportunityCollection(Collection<Opportunity> opportunityCollection) {
        this.opportunityCollection = opportunityCollection;
    }

//    @XmlTransient
//    public Collection<Workk> getWorkkCollection() {
//        return workkC;
//    }

    public void setWorkkCollection(Collection<Workk> workkCollection) {
        this.workkC = workkCollection;
    }
    
    

//    @XmlTransient
//    public Collection<Department> getDepartmentCollection() {
//        return departmentCollection;
//    }

//    public void setDepartmentCollection(Collection<Department> departmentCollection) {
//        this.departmentCollection = departmentCollection;
//    }

//    public Department getIdDepartment() {
//        return idDepartment;
//    }
//
//    public void setIdDepartment(Department idDepartment) {
//        this.idDepartment = idDepartment;
//    }

//    public Collection<Decentraliza> getDec() {
//		return dec;
//	}

	public void setNoteCollection(Collection<Note> noteCollection) {
		this.noteCollection = noteCollection;
	}

	public void setDec(Collection<Decentraliza> dec) {
		this.dec = dec;
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
