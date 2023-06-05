/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lthdt.btl;


import java.util.Scanner;



/**
 *
 * @author Admin
 */
public class LapTrinhVien extends NhanVien{
    private double luongOT;
    Scanner sc = new Scanner(System.in);
    public LapTrinhVien() {
        super();
    }

    public LapTrinhVien(String maNV, String ngaySinh, String hoTen, String Email, String gioiTinh, double luongCB, double heSo, double luongOT) {
        super(maNV, ngaySinh, hoTen, Email, gioiTinh, luongCB, heSo);
        this.luongOT = luongOT;
    }
    
    @Override
    public void nhapNV() {
        super.nhapNV(); 
        System.out.print("Nhap luong OT: ");
        luongOT = sc.nextDouble();
    }

    @Override
    public void xuatNV() {
        super.xuatNV(); 
        System.out.printf("Luong OT: %.0f\n", this.luongOT);
    }

    @Override
    public double tinhLuong() {
        this.luong = this.luongCB * this.heSo + this.luongOT;
        return this.luong;
    }

    

    @Override
    public double tinhTuoi() {
        return super.tinhTuoi(); 
    }

    
    
    /**
     * @return the luongOT
     */
    public double getLuongOT() {
        return luongOT;
    }

    /**
     * @param luongOT the luongOT to set
     */
    public void setLuongOT(double luongOT) {
        this.luongOT = luongOT;
    }

    

    
    
    
    }
