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
public class Main {
    
    public static QuanLyDuAn q1 = new QuanLyDuAn();
    private static QuanLyNhanVien q2 = new QuanLyNhanVien();
    
    public static void main(String[] args) {
        
        
        Object();
        int choose;
        do {
        System.out.println("========MENU========");
        System.out.println("1.Quan Ly Du An");
        System.out.println("2.Quan Ly Nhan Vien");
        System.out.println("3.Thoat");
        System.out.print("Moi ban chon: ");
        Scanner sc = new Scanner(System.in);
        choose = sc.nextInt();
        switch(choose) {
            case 1 ->  {
                QuanLyDuAn();
            }
            case 2 ->  {
                QuanLyNhanVien();
            }
            
            
            default -> {
                System.exit(0);
                }
            }  
        }while(choose < 3);

        
    }
    
    
    
    
    
    
    
    
    
    
    public static void QuanLyDuAn() {
        int choose;
        do {
        Scanner sc = new Scanner(System.in);
        System.out.println("========Quan Ly Du An========");
        System.out.println("1.Them du an");
        System.out.println("2.Xoa du an");
        System.out.println("3.Sua du an");
        System.out.println("4.Tim kiem theo ten");
        System.out.println("5.Tim kiem theo thoi gian bat dau");
        System.out.println("6.Sap xep theo kinh phi");
        System.out.println("7.Xuat danh sach nhan vien cua du an");
        System.out.println("8.Thoat");
        System.out.print("Moi ban chon: ");
        choose = sc.nextInt();
        switch(choose) {
            case 1:{
                System.out.print("Nhap so du an: ");
                int n = sc.nextInt();
                DuAn[] DA = new DuAn[n];
                for(int i = 0; i < n; i++) {
                System.out.println("===NHAP THONG TIN DU AN "+ (i+1) +"====");
                DA[i] = new DuAn();
                DA[i].nhapDA();
                q1.themDA(DA[i]);
                }
                System.out.println("=> Them du an thanh cong !!!");
                q1.xuatDsDA();
                break;
            }
            case 2: {
                System.out.println("=====XOA DU AN=====");
                System.out.print("Nhap ten cua du an: ");
                sc.nextLine();
                String ten = sc.nextLine();
        
                q1.xoaDA(ten);
                q1.xuatDsDA();
                break;
            }
            case 3: {
               
                System.out.println("Nhap thu tu du an: ");
                int n = sc.nextInt();
                System.out.println("=> Nhap Du An Moi");
                DuAn d1 = new DuAn();
                d1.nhapDA();
                q1.suaDA(n, d1);
                System.out.println("=> Sua du an thanh cong");
                q1.xuatDsDA();
                break;
            }
            case 4: {
                System.out.print("Nhap ten du an: ");
                sc.nextLine();
                String a = sc.nextLine();
                System.out.println("=====Ket Qua Tim Kiem=====");
                q1.TimKiemDATheoTen(a).forEach(s -> s.xuatDA());
                break;
            }
            case 5: {
                System.out.print("Nhap thoi diem bat dau: ");
                sc.nextLine();
                String a = sc.nextLine();
                System.out.println("=====Ket Qua Tim Kiem=====");
                q1.TimKiemDATheoBatDau(a).forEach(s -> s.xuatDA());
                break;
            }
            case 6: {
                System.out.println("=====CHOOSE=====");
                System.out.println("- Tang Dan");
                System.out.println("- Giam Dan");
                System.out.print("Chon: ");
                int n = sc.nextInt();
                if(n == 1)
                    q1.sapXepDuAnTangDan();
                if(n == 2)
                    q1.sapXepDuAnGiamDan();
                
                
                 q1.xuatDsDA();
                break;
            }
            case 7: {
                System.out.print("Nhap ten du an: ");
                sc.nextLine();
                String ten = sc.nextLine();
                q1.TimKiemDATheoTen(ten).forEach(s->s.xuatDsNVCuaDA());
            }
            default: {
                
            }
        }
    }while(choose < 8);
}
   
    
    
    
    public static void QuanLyNhanVien() {
        int choose;
        do {
        Scanner sc = new Scanner(System.in);
        System.out.println("========Quan Ly Nhan Vien========");
        System.out.println("1.Them nhan vien");
        System.out.println("2.Tim kiem theo ten");
        System.out.println("3.Tim kiem theo ngay sinh");
        System.out.println("4.Tim kiem theo phong ban");
        System.out.println("5.Tim kiem theo do tuoi");
        System.out.println("6.Xuat danh sach than nhan theo ma NV");
        System.out.println("7.Xuat danh sach du an cua nhan vien");
        System.out.println("8.Thoat");
        System.out.print("Moi ban chon: ");
        choose = sc.nextInt();
        switch(choose) {
            case 1:{
            
            System.out.print("Nhap so nhan vien: ");
            int n = sc.nextInt();
        
            NhanVien[] NV = new NhanVien[n];
            for(int i = 0; i < n; i++) {
                System.out.println("Nhap thong tin nhan vien " + (i+1));
                System.out.println("====BANG NHAN VIEN====");
                System.out.println("1.Nhan vien thuong");
                System.out.println("2.Lap Trinh Vien");
                System.out.println("3.Kiem Thu Vien");
                System.out.println("4.Thiet Ke Vien");
                System.out.print("Chon loai nhan vien: ");
                int chon = sc.nextInt();
                switch(chon) {
                    case 1 ->  {
                    NV[i] = new NhanVien();
                    NV[i].nhapNV();
                    NV[i].tinhLuong();
                    NV[i].tinhTuoi();
                                getQ2().themNV(NV[i]); 
                    }
                    case 2 ->  {
                        NV[i] = new LapTrinhVien();
                        NV[i].nhapNV();
                        NV[i].tinhLuong();
                        NV[i].tinhTuoi();
                                getQ2().themNV(NV[i]);
                    
                    }
                    case 3 ->  {
                        NV[i] = new KiemThuVien();
                        NV[i].nhapNV();
                        NV[i].tinhLuong();
                        NV[i].tinhTuoi();
                                getQ2().themNV(NV[i]);
                    }
                    case 4 ->  {
                        NV[i] = new ThietKeVien();
                        NV[i].nhapNV();
                        NV[i].tinhLuong();
                        NV[i].tinhTuoi();
                                getQ2().themNV(NV[i]);
                    }

                
            }   
        }
        System.out.println("=> Them nhan vien thanh cong !!!!");
                    getQ2().xuatDsNV();
                break;
            }
            case 2: {
                System.out.print("Nhap ten nhan vien: ");
                sc.nextLine();
                String a = sc.nextLine();
                System.out.println("=====Ket Qua Tim Kiem=====");
                    getQ2().TimKiemTheoTen(a).forEach(s -> s.xuatNV());
                break;
            }
            case 3: {
                System.out.print("Nhap ngay sinh: ");
                sc.nextLine();
                String a = sc.nextLine();
                System.out.println("=====Ket Qua Tim Kiem=====");
                    getQ2().TimKiemTheoNgaySinh(a).forEach(s -> s.xuatNV());
                break;
            }
            case 4: {             
                break;
            }
            case 5: {
                System.out.print("Nhap khoang gia tri do tuoi: ");
                Double a = sc.nextDouble();
                Double b = sc.nextDouble();
                System.out.println("=====Ket Qua Tim Kiem=====");
                    getQ2().TimKiemTheoTuoi(a,b).forEach(s -> s.xuatNV());
                break;
            }
            case 6: {
                System.out.print("Nhap ma NV: ");
                sc.nextLine();
                String ma = sc.nextLine();
                    getQ2().TimKiemTheoMa(ma).forEach(s->s.xuatDsTNCuaNV());
                break;
            }
            case 7: {
                System.out.print("Nhap ten nhan vien: ");
                sc.nextLine();
                String ten = sc.nextLine();
                    getQ2().TimKiemTheoTen(ten).forEach(s->s.xuatDsDaCuaNV());
            }
            default: {
                
            }
        }
    }while(choose < 8);
    }


    
    public static void Object() {
        DuAn d1 = new DuAn("1","CNTT","2003","2004",200000,"Son Duong");
        DuAn d2 = new DuAn("2","KHMT","2003","2004",400000,"PTP");
        DuAn d3 = new DuAn("3","IM","2003","2004",300000,"THT");
        q1.themDA(d1,d2,d3);
        
        NhanVien n1 = new NhanVien("1","14/08/2001","Tran Son Duy","###","Nam",20000,4);
        NhanVien n2 = new LapTrinhVien("2","09/09/2002","Le Thi A","###","Nu",30000,2,10000);
        NhanVien n3 = new KiemThuVien("3","28/02/2003","Tran Van B","###","Nam",20000,5,3);
        NhanVien n4 = new ThietKeVien("4","01/02/2000","Tran Van C","###","Nam",15000,3,3000);
        
        ThanNhan m1 = new ThanNhan("Tran Ngoc Son","Nam","Ba","22/02/1980");
        ThanNhan m2 = new ThanNhan("Le Thi Rieng","Nam","Ong","22/02/1980");
        ThanNhan m3 = new ThanNhan("Pham Ngu Lao","Nam","Chu","22/02/1980");
        ThanNhan m4 = new ThanNhan("Tran Dan","Nam","Ba","22/02/1980");
        ThanNhan m5 = new ThanNhan("Nguyen Kim Phuc","Nam","Ba","22/02/1980");
        
        
        n1.tinhLuong();
        n2.tinhLuong();
        n3.tinhLuong();
        n4.tinhLuong();
        
        n1.tinhTuoi();
        n2.tinhTuoi();
        n3.tinhTuoi();
        n4.tinhTuoi();
        
        getQ2().themNV(n1,n2,n3,n4);
        
        n1.themDAChoNV(d1,d2);
        n2.themDAChoNV(d2,d3);
        n3.themDAChoNV(d2,d3,d1);
        n4.themDAChoNV(d1);
        
        
        
        n1.themTNchoNV(m1,m2);
        n2.themTNchoNV(m3);
        n3.themTNchoNV(m4);
        n4.themTNchoNV(m5);
        
        
        
        d1.themNVChoDA(n1,n4);
        d2.themNVChoDA(n1,n2,n3);
        d3.themNVChoDA(n2,n3);
        
//        q1.xuatThongTinCuaDA(d1);
//        q1.xuatThongTinCuaDA(d2);
//        q1.xuatThongTinCuaDA(d3);
//
//        
//        
//        q2.xuatThongTinCuaNV(n1);
//        q2.xuatThongTinCuaNV(n2);
//        q2.xuatThongTinCuaNV(n3);
//        q2.xuatThongTinCuaNV(n4);
    }
    /**
     * @return the q1
     */
    public QuanLyDuAn getQ1() {
        return q1;
    }

    /**
     * @param q1 the q1 to set
     */
    public void setQ1(QuanLyDuAn q1) {
        this.q1 = q1;
    }

    /**
     * @return the q2
     */
    public static QuanLyNhanVien getQ2() {
        return q2;
    }

    /**
     * @param aQ2 the q2 to set
     */
    public static void setQ2(QuanLyNhanVien aQ2) {
        q2 = aQ2;
    }

    

   
    
}
