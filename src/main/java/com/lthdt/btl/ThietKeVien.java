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
public class ThietKeVien extends NhanVien{
    private double tienThuong;
    Scanner sc = new Scanner(System.in);

    public ThietKeVien() {
        super();
    }

    public ThietKeVien(String maNV, String ngaySinh, String hoTen, String Email, String gioiTinh, double luongCB, double heSo,double tienThuong) {
        super(maNV, ngaySinh, hoTen, Email, gioiTinh, luongCB, heSo);
        this.tienThuong = tienThuong;
    }
    
    
    
    

    @Override
    public void nhapNV() {
        super.nhapNV(); 
        System.out.print("Nhap tien thuong: ");
        tienThuong = sc.nextDouble();
    }

    
    @Override
    public void xuatNV() {
        super.xuatNV(); 
        System.out.printf("Tien thuong: %.0f\n",this.tienThuong);
    }

    @Override
    public double tinhLuong() {
        this.luong = this.luongCB * this.heSo + this.tienThuong; 
        return this.luong;
    }

    @Override
    public double tinhTuoi() {
        return super.tinhTuoi(); 
    }

    
    

    

    
    
    /**
     * @return the tienThuong
     */
    public double getTienThuong() {
        return tienThuong;
    }

    /**
     * @param tienThuong the tienThuong to set
     */
    public void setTienThuong(double tienThuong) {
        this.tienThuong = tienThuong;
    }
}
