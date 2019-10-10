package com.entyti;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "workk")

public class Workk implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @NotNull
    @Column(name = "id_work")
    private String idWork;
    @Column(name = "work_name")
    private String workName;
    @Column(name = "statuss")
    private Boolean statuss;
    @Column(name = "prioritize")
    private String prioritize;
    @JoinColumn(name = "id_department", referencedColumnName = "id_department")
    @ManyToOne(optional = false)
    private Department idDepartment;
    @JoinColumn(name = "id_empl", referencedColumnName = "id_empl")
    @ManyToOne(optional = false)
    private Employee idEmpl;

    public Workk() {
    }

    public Workk(String idWork) {
        this.idWork = idWork;
    }

    public String getIdWork() {
        return idWork;
    }

    public void setIdWork(String idWork) {
        this.idWork = idWork;
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

    public Department getIdDepartment() {
        return idDepartment;
    }

    public void setIdDepartment(Department idDepartment) {
        this.idDepartment = idDepartment;
    }

    public Employee getIdEmpl() {
        return idEmpl;
    }

    public void setIdEmpl(Employee idEmpl) {
        this.idEmpl = idEmpl;
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
