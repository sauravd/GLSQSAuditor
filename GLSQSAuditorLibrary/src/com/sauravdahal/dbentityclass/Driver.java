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
@Table(name = "DRIVER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Driver.findAll", query = "SELECT d FROM Driver d")
    , @NamedQuery(name = "Driver.findByDriverId", query = "SELECT d FROM Driver d WHERE d.driverId = :driverId")
    , @NamedQuery(name = "Driver.findByDriverNumber", query = "SELECT d FROM Driver d WHERE d.driverNumber = :driverNumber")
    , @NamedQuery(name = "Driver.findByDriverTrained", query = "SELECT d FROM Driver d WHERE d.driverTrained = :driverTrained")
    , @NamedQuery(name = "Driver.findByDriverUntrained", query = "SELECT d FROM Driver d WHERE d.driverUntrained = :driverUntrained")
    , @NamedQuery(name = "Driver.findByDriverTrainer", query = "SELECT d FROM Driver d WHERE d.driverTrainer = :driverTrainer")})
public class Driver implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "DRIVER_ID")
    private Integer driverId;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DRIVER_NUMBER")
    private Double driverNumber;
    @Column(name = "DRIVER_TRAINED")
    private Double driverTrained;
    @Column(name = "DRIVER_UNTRAINED")
    private Double driverUntrained;
    @Column(name = "DRIVER_TRAINER")
    private String driverTrainer;

    public Driver() {
    }

    public Driver(Integer driverId) {
        this.driverId = driverId;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public Double getDriverNumber() {
        return driverNumber;
    }

    public void setDriverNumber(Double driverNumber) {
        this.driverNumber = driverNumber;
    }

    public Double getDriverTrained() {
        return driverTrained;
    }

    public void setDriverTrained(Double driverTrained) {
        this.driverTrained = driverTrained;
    }

    public Double getDriverUntrained() {
        return driverUntrained;
    }

    public void setDriverUntrained(Double driverUntrained) {
        this.driverUntrained = driverUntrained;
    }

    public String getDriverTrainer() {
        return driverTrainer;
    }

    public void setDriverTrainer(String driverTrainer) {
        this.driverTrainer = driverTrainer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (driverId != null ? driverId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Driver)) {
            return false;
        }
        Driver other = (Driver) object;
        if ((this.driverId == null && other.driverId != null) || (this.driverId != null && !this.driverId.equals(other.driverId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.sauravdahal.dbentityclass.Driver[ driverId=" + driverId + " ]";
    }
    
}
