/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.divudi.data.dataStructure;

import com.divudi.entity.Department;
import java.util.Date;

/**
 *
 * @author safrin
 */
public class DepartmentStock {
    private Department department;
    private double stock;
    private double average;
    private Date expiryDate;
    private double purchaseRate;
    private double retailSale;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double getPurchaseRate() {
        return purchaseRate;
    }

    public void setPurchaseRate(double purchaseRate) {
        this.purchaseRate = purchaseRate;
    }

    public double getRetailSale() {
        return retailSale;
    }

    public void setRetailSale(double retailSale) {
        this.retailSale = retailSale;
    }
    
    
    
}
