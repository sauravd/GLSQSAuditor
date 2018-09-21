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
@Table(name = "VEHICLE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehicle.findAll", query = "SELECT v FROM Vehicle v")
    , @NamedQuery(name = "Vehicle.findByVehId", query = "SELECT v FROM Vehicle v WHERE v.vehId = :vehId")
    , @NamedQuery(name = "Vehicle.findByVehNoWheels", query = "SELECT v FROM Vehicle v WHERE v.vehNoWheels = :vehNoWheels")
    , @NamedQuery(name = "Vehicle.findByVehFuelType", query = "SELECT v FROM Vehicle v WHERE v.vehFuelType = :vehFuelType")
    , @NamedQuery(name = "Vehicle.findByVehKm", query = "SELECT v FROM Vehicle v WHERE v.vehKm = :vehKm")
    , @NamedQuery(name = "Vehicle.findByVehFuel", query = "SELECT v FROM Vehicle v WHERE v.vehFuel = :vehFuel")
    , @NamedQuery(name = "Vehicle.findByVehAvgPayld", query = "SELECT v FROM Vehicle v WHERE v.vehAvgPayld = :vehAvgPayld")
    , @NamedQuery(name = "Vehicle.findByVehAvgDistPerTrip", query = "SELECT v FROM Vehicle v WHERE v.vehAvgDistPerTrip = :vehAvgDistPerTrip")
    , @NamedQuery(name = "Vehicle.findByVehYrMfd", query = "SELECT v FROM Vehicle v WHERE v.vehYrMfd = :vehYrMfd")
    , @NamedQuery(name = "Vehicle.findByVehGrossWt", query = "SELECT v FROM Vehicle v WHERE v.vehGrossWt = :vehGrossWt")
    , @NamedQuery(name = "Vehicle.findByVehBrkdwnHrs", query = "SELECT v FROM Vehicle v WHERE v.vehBrkdwnHrs = :vehBrkdwnHrs")
    , @NamedQuery(name = "Vehicle.findByVehEmptyTripDist", query = "SELECT v FROM Vehicle v WHERE v.vehEmptyTripDist = :vehEmptyTripDist")
    , @NamedQuery(name = "Vehicle.findByVehAvgSpeed", query = "SELECT v FROM Vehicle v WHERE v.vehAvgSpeed = :vehAvgSpeed")
    , @NamedQuery(name = "Vehicle.findByVehBackhaulingDist", query = "SELECT v FROM Vehicle v WHERE v.vehBackhaulingDist = :vehBackhaulingDist")
    , @NamedQuery(name = "Vehicle.findByVehAvgIdlingTime", query = "SELECT v FROM Vehicle v WHERE v.vehAvgIdlingTime = :vehAvgIdlingTime")
    , @NamedQuery(name = "Vehicle.findByVehOperatingHrs", query = "SELECT v FROM Vehicle v WHERE v.vehOperatingHrs = :vehOperatingHrs")
    , @NamedQuery(name = "Vehicle.findByVehTirePressure", query = "SELECT v FROM Vehicle v WHERE v.vehTirePressure = :vehTirePressure")
    , @NamedQuery(name = "Vehicle.findByVehRefrigerentType", query = "SELECT v FROM Vehicle v WHERE v.vehRefrigerentType = :vehRefrigerentType")})
public class Vehicle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "VEH_ID")
    private Integer vehId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VEH_NO_WHEELS")
    private Double vehNoWheels;
    @Column(name = "VEH_FUEL_TYPE")
    private String vehFuelType;
    @Column(name = "VEH_KM")
    private Double vehKm;
    @Column(name = "VEH_FUEL")
    private Double vehFuel;
    @Column(name = "VEH_AVG_PAYLD")
    private Double vehAvgPayld;
    @Column(name = "VEH_AVG_DIST_PER_TRIP")
    private Double vehAvgDistPerTrip;
    @Column(name = "VEH_YR_MFD")
    private Integer vehYrMfd;
    @Column(name = "VEH_GROSS_WT")
    private Double vehGrossWt;
    @Column(name = "VEH_BRKDWN_HRS")
    private Double vehBrkdwnHrs;
    @Column(name = "VEH_EMPTY_TRIP_DIST")
    private Double vehEmptyTripDist;
    @Column(name = "VEH_AVG_SPEED")
    private Double vehAvgSpeed;
    @Column(name = "VEH_BACKHAULING_DIST")
    private Double vehBackhaulingDist;
    @Column(name = "VEH_AVG_IDLING_TIME")
    private Double vehAvgIdlingTime;
    @Column(name = "VEH_OPERATING_HRS")
    private Double vehOperatingHrs;
    @Column(name = "VEH_TIRE_PRESSURE")
    private Double vehTirePressure;
    @Column(name = "VEH_REFRIGERENT_TYPE")
    private String vehRefrigerentType;

    public Vehicle() {
    }

    public Vehicle(Integer vehId) {
        this.vehId = vehId;
    }

    public Integer getVehId() {
        return vehId;
    }

    public void setVehId(Integer vehId) {
        this.vehId = vehId;
    }

    public Double getVehNoWheels() {
        return vehNoWheels;
    }

    public void setVehNoWheels(Double vehNoWheels) {
        this.vehNoWheels = vehNoWheels;
    }

    public String getVehFuelType() {
        return vehFuelType;
    }

    public void setVehFuelType(String vehFuelType) {
        this.vehFuelType = vehFuelType;
    }

    public Double getVehKm() {
        return vehKm;
    }

    public void setVehKm(Double vehKm) {
        this.vehKm = vehKm;
    }

    public Double getVehFuel() {
        return vehFuel;
    }

    public void setVehFuel(Double vehFuel) {
        this.vehFuel = vehFuel;
    }

    public Double getVehAvgPayld() {
        return vehAvgPayld;
    }

    public void setVehAvgPayld(Double vehAvgPayld) {
        this.vehAvgPayld = vehAvgPayld;
    }

    public Double getVehAvgDistPerTrip() {
        return vehAvgDistPerTrip;
    }

    public void setVehAvgDistPerTrip(Double vehAvgDistPerTrip) {
        this.vehAvgDistPerTrip = vehAvgDistPerTrip;
    }

    public Integer getVehYrMfd() {
        return vehYrMfd;
    }

    public void setVehYrMfd(Integer vehYrMfd) {
        this.vehYrMfd = vehYrMfd;
    }

    public Double getVehGrossWt() {
        return vehGrossWt;
    }

    public void setVehGrossWt(Double vehGrossWt) {
        this.vehGrossWt = vehGrossWt;
    }

    public Double getVehBrkdwnHrs() {
        return vehBrkdwnHrs;
    }

    public void setVehBrkdwnHrs(Double vehBrkdwnHrs) {
        this.vehBrkdwnHrs = vehBrkdwnHrs;
    }

    public Double getVehEmptyTripDist() {
        return vehEmptyTripDist;
    }

    public void setVehEmptyTripDist(Double vehEmptyTripDist) {
        this.vehEmptyTripDist = vehEmptyTripDist;
    }

    public Double getVehAvgSpeed() {
        return vehAvgSpeed;
    }

    public void setVehAvgSpeed(Double vehAvgSpeed) {
        this.vehAvgSpeed = vehAvgSpeed;
    }

    public Double getVehBackhaulingDist() {
        return vehBackhaulingDist;
    }

    public void setVehBackhaulingDist(Double vehBackhaulingDist) {
        this.vehBackhaulingDist = vehBackhaulingDist;
    }

    public Double getVehAvgIdlingTime() {
        return vehAvgIdlingTime;
    }

    public void setVehAvgIdlingTime(Double vehAvgIdlingTime) {
        this.vehAvgIdlingTime = vehAvgIdlingTime;
    }

    public Double getVehOperatingHrs() {
        return vehOperatingHrs;
    }

    public void setVehOperatingHrs(Double vehOperatingHrs) {
        this.vehOperatingHrs = vehOperatingHrs;
    }

    public Double getVehTirePressure() {
        return vehTirePressure;
    }

    public void setVehTirePressure(Double vehTirePressure) {
        this.vehTirePressure = vehTirePressure;
    }

    public String getVehRefrigerentType() {
        return vehRefrigerentType;
    }

    public void setVehRefrigerentType(String vehRefrigerentType) {
        this.vehRefrigerentType = vehRefrigerentType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vehId != null ? vehId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehicle)) {
            return false;
        }
        Vehicle other = (Vehicle) object;
        if ((this.vehId == null && other.vehId != null) || (this.vehId != null && !this.vehId.equals(other.vehId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sauravdahal.dbentityclass.Vehicle[ vehId=" + vehId + " ]";
    }
    
}
