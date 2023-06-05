/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lthdt.btl;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PhongBan {
    private String tenPB;

    private List<NhanVien> ds = new ArrayList<>();

    public PhongBan(String tenPB) {
        this.tenPB = tenPB;
    }

    
    
    
    /**
     * @return the tenPB
     */
    public String getTenPB() {
        return tenPB;
    }

    /**
     * @param tenPB the tenPB to set
     */
    public void setTenPB(String tenPB) {
        this.tenPB = tenPB;
    }

    /**
     * @return the ds
     */
    public List<NhanVien> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(List<NhanVien> ds) {
        this.ds = ds;
    }
}
