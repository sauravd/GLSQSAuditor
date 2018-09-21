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
@Table(name = "FUELTYPE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Fueltype.findAll", query = "SELECT f FROM Fueltype f")
    , @NamedQuery(name = "Fueltype.findByFuelId", query = "SELECT f FROM Fueltype f WHERE f.fuelId = :fuelId")
    , @NamedQuery(name = "Fueltype.findByFuelName", query = "SELECT f FROM Fueltype f WHERE f.fuelName = :fuelName")
    , @NamedQuery(name = "Fueltype.findByCo2PerUnit", query = "SELECT f FROM Fueltype f WHERE f.co2PerUnit = :co2PerUnit")})
public class Fueltype implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "FUEL_ID")
    private Integer fuelId;
    @Column(name = "FUEL_NAME")
    private String fuelName;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CO2_PER_UNIT")
    private Double co2PerUnit;

    public Fueltype() {
    }

    public Fueltype(Integer fuelId) {
        this.fuelId = fuelId;
    }

    public Integer getFuelId() {
        return fuelId;
    }

    public void setFuelId(Integer fuelId) {
        this.fuelId = fuelId;
    }

    public String getFuelName() {
        return fuelName;
    }

    public void setFuelName(String fuelName) {
        this.fuelName = fuelName;
    }

    public Double getCo2PerUnit() {
        return co2PerUnit;
    }

    public void setCo2PerUnit(Double co2PerUnit) {
        this.co2PerUnit = co2PerUnit;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (fuelId != null ? fuelId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Fueltype)) {
            return false;
        }
        Fueltype other = (Fueltype) object;
        if ((this.fuelId == null && other.fuelId != null) || (this.fuelId != null && !this.fuelId.equals(other.fuelId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sauravdahal.dbentityclass.Fueltype[ fuelId=" + fuelId + " ]";
    }
    
}
