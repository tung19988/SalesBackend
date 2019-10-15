package com.entyti;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "opportunity")

public class Opportunity implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_opportunity")
    private Integer idOpportunity;
    @NotNull
    @Column(name = "cus_name")
    private String cusName;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Column(name = "email")
    private String email;
    @Column(name = "phone_num")
    private Integer phoneNum;
    @Column(name = "pro_name")
    private String proName;
    @Column(name = "amountt")
    private Integer amountt;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "price")
    private Double price;
    @Column(name = "date_of_purchase")
    private String dateOfPurchase;
    @Column(name = "delivery")
    private String delivery;
    @Column(name = "sources")
    private String sources;
    @Column(name = "stt")
    private String stt;
    @Column(name = "total_money")
    private Double totalMoney;
    @JoinColumn(name = "id_empl", referencedColumnName = "id_empl")
    @ManyToOne(optional = false)
    private Employee idEmpl;

    public Opportunity() {
    }

    public Opportunity(Integer idOpportunity) {
        this.idOpportunity = idOpportunity;
    }

    public Opportunity(Integer idOpportunity, String cusName) {
        this.idOpportunity = idOpportunity;
        this.cusName = cusName;
    }

    public Integer getIdOpportunity() {
        return idOpportunity;
    }

    public void setIdOpportunity(Integer idOpportunity) {
        this.idOpportunity = idOpportunity;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(Integer phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public Integer getAmountt() {
        return amountt;
    }

    public void setAmountt(Integer amountt) {
        this.amountt = amountt;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    public String getDelivery() {
        return delivery;
    }

    public void setDelivery(String delivery) {
        this.delivery = delivery;
    }

    public String getSources() {
        return sources;
    }

    public void setSources(String sources) {
        this.sources = sources;
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public Double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Double totalMoney) {
        this.totalMoney = totalMoney;
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
        hash += (idOpportunity != null ? idOpportunity.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Opportunity)) {
            return false;
        }
        Opportunity other = (Opportunity) object;
        if ((this.idOpportunity == null && other.idOpportunity != null) || (this.idOpportunity != null && !this.idOpportunity.equals(other.idOpportunity))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entyti.Opportunity[ idOpportunity=" + idOpportunity + " ]";
    }
    
}

