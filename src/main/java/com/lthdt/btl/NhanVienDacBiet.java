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
public class NhanVienDacBiet extends NhanVien{
    private String ngayNhamChuc;
    Scanner sc = new Scanner(System.in);
    public NhanVienDacBiet() {
        super();
    }

    public NhanVienDacBiet(String maNV, String ngaySinh, String hoTen, String Email, String gioiTinh, double luongCB, double heSo,String ngayNhamChuc) {
        super(maNV, ngaySinh, hoTen, Email, gioiTinh, luongCB, heSo);
        this.ngayNhamChuc = ngayNhamChuc;
    }

    @Override
    public void nhapNV() {
        super.nhapNV(); 
        System.out.print("Ngay nham chuc: ");
        ngayNhamChuc = sc.nextLine();
    }
    
    @Override
    public void xuatNV() {
        super.xuatNV(); 
        System.out.printf("Ngay nham chuc: %s",this.ngayNhamChuc);
    }

    @Override
    public double tinhLuong() {
        this.luong = this.luongCB * this.heSo;
        return this.luong;
    }
    

    
    

   

    
    
    

    /**
     * @return the ngayNhamChuc
     */
    public String getNgayNhamChuc() {
        return ngayNhamChuc;
    }

    /**
     * @param ngayNhamChuc the ngayNhamChuc to set
     */
    public void setNgayNhamChuc(String ngayNhamChuc) {
        this.ngayNhamChuc = ngayNhamChuc;
    }
}
