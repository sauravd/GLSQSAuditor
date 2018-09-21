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
@Table(name = "FUELPRICE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fuelprice.findAll", query = "SELECT f FROM Fuelprice f")
    , @NamedQuery(name = "Fuelprice.findByFulPriceId", query = "SELECT f FROM Fuelprice f WHERE f.fulPriceId = :fulPriceId")
    , @NamedQuery(name = "Fuelprice.findByFulType", query = "SELECT f FROM Fuelprice f WHERE f.fulType = :fulType")
    , @NamedQuery(name = "Fuelprice.findByFulPrice", query = "SELECT f FROM Fuelprice f WHERE f.fulPrice = :fulPrice")})
public class Fuelprice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FUL_PRICE_ID")
    private Integer fulPriceId;
    @Column(name = "FUL_TYPE")
    private String fulType;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FUL_PRICE")
    private Double fulPrice;

    public Fuelprice() {
    }

    public Fuelprice(Integer fulPriceId) {
        this.fulPriceId = fulPriceId;
    }

    public Integer getFulPriceId() {
        return fulPriceId;
    }

    public void setFulPriceId(Integer fulPriceId) {
        this.fulPriceId = fulPriceId;
    }

    public String getFulType() {
        return fulType;
    }

    public void setFulType(String fulType) {
        this.fulType = fulType;
    }

    public Double getFulPrice() {
        return fulPrice;
    }

    public void setFulPrice(Double fulPrice) {
        this.fulPrice = fulPrice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fulPriceId != null ? fulPriceId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fuelprice)) {
            return false;
        }
        Fuelprice other = (Fuelprice) object;
        if ((this.fulPriceId == null && other.fulPriceId != null) || (this.fulPriceId != null && !this.fulPriceId.equals(other.fulPriceId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sauravdahal.dbentityclass.Fuelprice[ fulPriceId=" + fulPriceId + " ]";
    }
    
}
