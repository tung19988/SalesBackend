package com.entyti;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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

//    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empl")
    private Integer idEmpl;
    @NotNull
    @Column(name = "name_empl")
    private String nameEmpl;
    @Column(name = "phone_num")
    private Integer phoneNum;
    @Column(name = "levell")
    private String levell;
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
    @OneToMany(cascade ={CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH},mappedBy = "idEmpl")
//    @JoinColumn(name="id_empl")
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpl")
    private Collection<Opportunity> opportunityCollection;
//    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//    @JoinColumn(name="id_empl")
//    @OneToMany(cascade ={CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH}, mappedBy = "idEmpl")
//    private List<Workk> workkC;
//    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//    @JoinColumn(name="id_empl")
//    @OneToMany(mappedBy = "idEmpl")
//    private Collection<Department> departmentCollection;
    @JoinColumn(name = "id_department", referencedColumnName = "id_department")
    @ManyToOne()
    private Department idDepartment;
//    @OneToMany(fetch=FetchType.LAZY,cascade=CascadeType.ALL)
//    @JoinColumn(name="id_empl")
//    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpl")
//    private Collection<Decentraliza> dec;

    @OneToMany(cascade=CascadeType.ALL,mappedBy = "idEmpl")
//    @JoinColumn(name="id_comemp")
    private List<Comment_emp> commCollection;
    
    @OneToMany(cascade=CascadeType.ALL, mappedBy = "assignerr")
    private List<Workk> listAssigner ;
    
    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(
        name = "work_em", 
        joinColumns = { @JoinColumn(name = "id_empl") }, 
        inverseJoinColumns = { @JoinColumn(name = "id_work") } )
    private Set<Workk> idWork = new HashSet<>() ; 
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpl")
    private Collection<Note> noteCollection;
  
    
	public Employee() {
		super();
	}

	public Employee(Integer idEmpl) {
		super();
		this.idEmpl = idEmpl;
	}


	public void setIdWork(Set<Workk> idWork) {
		this.idWork = idWork;
	}

	public void setCommCollection(List<Comment_emp> commCollection) {
		this.commCollection = commCollection;
	}
	
	public String getLevell() {
		return levell;
	}

	public void setLevell(String levell) {
		this.levell = levell;
	}
 
    
	public void setListAssigner(List<Workk> listAssigner) {
		this.listAssigner = listAssigner;
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

//    public void setWorkkCollection(List<Workk> workkCollection) {
//        this.workkC = workkCollection;
//    }
    
    

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
	
	

//	@Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (idEmpl != null ? idEmpl.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof Employee)) {
//            return false;
//        }
//        Employee other = (Employee) object;
//        if ((this.idEmpl == null && other.idEmpl != null) || (this.idEmpl != null && !this.idEmpl.equals(other.idEmpl))) {
//            return false;
//        }
//        return true;
//    }

    public Department getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(Department idDepartment) {
		this.idDepartment = idDepartment;
	}

//	@Override
//    public String toString() {
//        return "entyti.Employee[ idEmpl=" + idEmpl + " ]";
//    }
    
}
