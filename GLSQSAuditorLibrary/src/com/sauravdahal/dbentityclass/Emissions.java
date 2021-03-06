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
@Table(name = "EMISSIONS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Emissions.findAll", query = "SELECT e FROM Emissions e")
    , @NamedQuery(name = "Emissions.findByEid", query = "SELECT e FROM Emissions e WHERE e.eid = :eid")
    , @NamedQuery(name = "Emissions.findByVehicletype", query = "SELECT e FROM Emissions e WHERE e.vehicletype = :vehicletype")
    , @NamedQuery(name = "Emissions.findByVehicleid", query = "SELECT e FROM Emissions e WHERE e.vehicleid = :vehicleid")
    , @NamedQuery(name = "Emissions.findByEmissionYear", query = "SELECT e FROM Emissions e WHERE e.emissionYear = :emissionYear")
    , @NamedQuery(name = "Emissions.findByEmissionMonth", query = "SELECT e FROM Emissions e WHERE e.emissionMonth = :emissionMonth")
    , @NamedQuery(name = "Emissions.findByCo2", query = "SELECT e FROM Emissions e WHERE e.co2 = :co2")
    , @NamedQuery(name = "Emissions.findByCo", query = "SELECT e FROM Emissions e WHERE e.co = :co")
    , @NamedQuery(name = "Emissions.findByVoc", query = "SELECT e FROM Emissions e WHERE e.voc = :voc")
    , @NamedQuery(name = "Emissions.findByNox", query = "SELECT e FROM Emissions e WHERE e.nox = :nox")
    , @NamedQuery(name = "Emissions.findBySox", query = "SELECT e FROM Emissions e WHERE e.sox = :sox")
    , @NamedQuery(name = "Emissions.findByPm10", query = "SELECT e FROM Emissions e WHERE e.pm10 = :pm10")
    , @NamedQuery(name = "Emissions.findByPm25", query = "SELECT e FROM Emissions e WHERE e.pm25 = :pm25")})
public class Emissions implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EID")
    private Integer eid;
    @Column(name = "VEHICLETYPE")
    private String vehicletype;
    @Column(name = "VEHICLEID")
    private Integer vehicleid;
    @Column(name = "EMISSION_YEAR")
    private Integer emissionYear;
    @Column(name = "EMISSION_MONTH")
    private String emissionMonth;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CO2")
    private Double co2;
    @Column(name = "CO")
    private Double co;
    @Column(name = "VOC")
    private Double voc;
    @Column(name = "NOX")
    private Double nox;
    @Column(name = "SOX")
    private Double sox;
    @Column(name = "PM10")
    private Double pm10;
    @Column(name = "PM25")
    private Double pm25;

    public Emissions() {
    }

    public Emissions(Integer eid) {
        this.eid = eid;
    }

    public Integer getEid() {
        return eid;
    }

    public void setEid(Integer eid) {
        this.eid = eid;
    }

    public String getVehicletype() {
        return vehicletype;
    }

    public void setVehicletype(String vehicletype) {
        this.vehicletype = vehicletype;
    }

    public Integer getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(Integer vehicleid) {
        this.vehicleid = vehicleid;
    }

    public Integer getEmissionYear() {
        return emissionYear;
    }

    public void setEmissionYear(Integer emissionYear) {
        this.emissionYear = emissionYear;
    }

    public String getEmissionMonth() {
        return emissionMonth;
    }

    public void setEmissionMonth(String emissionMonth) {
        this.emissionMonth = emissionMonth;
    }

    public Double getCo2() {
        return co2;
    }

    public void setCo2(Double co2) {
        this.co2 = co2;
    }

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getVoc() {
        return voc;
    }

    public void setVoc(Double voc) {
        this.voc = voc;
    }

    public Double getNox() {
        return nox;
    }

    public void setNox(Double nox) {
        this.nox = nox;
    }

    public Double getSox() {
        return sox;
    }

    public void setSox(Double sox) {
        this.sox = sox;
    }

    public Double getPm10() {
        return pm10;
    }

    public void setPm10(Double pm10) {
        this.pm10 = pm10;
    }

    public Double getPm25() {
        return pm25;
    }

    public void setPm25(Double pm25) {
        this.pm25 = pm25;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (eid != null ? eid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Emissions)) {
            return false;
        }
        Emissions other = (Emissions) object;
        if ((this.eid == null && other.eid != null) || (this.eid != null && !this.eid.equals(other.eid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sauravdahal.dbentityclass.Emissions[ eid=" + eid + " ]";
    }
    
}
