/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sauravdahal.dbentityclass;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Saurav Dahal <saurav@mekonginstitute.org>
 */
@Entity
@Table(name = "COMPANY")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Company.findAll", query = "SELECT c FROM Company c")
    , @NamedQuery(name = "Company.findByCompId", query = "SELECT c FROM Company c WHERE c.compId = :compId")
    , @NamedQuery(name = "Company.findByCompCountry", query = "SELECT c FROM Company c WHERE c.compCountry = :compCountry")
    , @NamedQuery(name = "Company.findByCompCity", query = "SELECT c FROM Company c WHERE c.compCity = :compCity")
    , @NamedQuery(name = "Company.findByCompEmail", query = "SELECT c FROM Company c WHERE c.compEmail = :compEmail")
    , @NamedQuery(name = "Company.findByCompPhoneNo", query = "SELECT c FROM Company c WHERE c.compPhoneNo = :compPhoneNo")
    , @NamedQuery(name = "Company.findByCompCountryCode", query = "SELECT c FROM Company c WHERE c.compCountryCode = :compCountryCode")})
public class Company implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "COMP_ID")
    private Integer compId;
    @Column(name = "COMP_COUNTRY")
    private String compCountry;
    @Column(name = "COMP_CITY")
    private String compCity;
    @Column(name = "COMP_EMAIL")
    private String compEmail;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COMP_PHONE_NO")
    private Double compPhoneNo;
    @Column(name = "COMP_COUNTRY_CODE")
    private Double compCountryCode;

    public Company() {
    }

    public Company(Integer compId) {
        this.compId = compId;
    }

    public Integer getCompId() {
        return compId;
    }

    public void setCompId(Integer compId) {
        this.compId = compId;
    }

    public String getCompCountry() {
        return compCountry;
    }

    public void setCompCountry(String compCountry) {
        this.compCountry = compCountry;
    }

    public String getCompCity() {
        return compCity;
    }

    public void setCompCity(String compCity) {
        this.compCity = compCity;
    }

    public String getCompEmail() {
        return compEmail;
    }

    public void setCompEmail(String compEmail) {
        this.compEmail = compEmail;
    }

    public Double getCompPhoneNo() {
        return compPhoneNo;
    }

    public void setCompPhoneNo(Double compPhoneNo) {
        this.compPhoneNo = compPhoneNo;
    }

    public Double getCompCountryCode() {
        return compCountryCode;
    }

    public void setCompCountryCode(Double compCountryCode) {
        this.compCountryCode = compCountryCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (compId != null ? compId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Company)) {
            return false;
        }
        Company other = (Company) object;
        if ((this.compId == null && other.compId != null) || (this.compId != null && !this.compId.equals(other.compId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sauravdahal.dbentityclass.Company[ compId=" + compId + " ]";
    }
    
}
