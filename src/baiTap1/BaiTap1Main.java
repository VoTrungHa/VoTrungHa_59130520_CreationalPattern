/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap1; 
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author hp-pc
 */
public class BaiTap1Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      
     CTHD cthd=  new CTHD.Builder().addSanPham("Điện thoại Sam Sung")
                .addchietKhau("10%")
                .addsoLuong(1)
                .addDonGia(120000)
                .Build();
     CTHD cthd1=  new CTHD.Builder().addSanPham("Tivi Sonny")
                .addchietKhau("10%")
                .addsoLuong(1)
                .addDonGia(70000)
                .Build();
      HoaDonHeader donHeader=new HoaDonHeader.Builder()
                .addMaHD("SS001")
                .addNgayBan("12/05/2020")
                .addTenKH("Vo Trung Ha")
                .Build();
        HoaDon hd=new HoaDon.Builder()
                .AddHD(donHeader)
                .AddCTHD(cthd)
                .AddCTHD(cthd1)
                .Build(); 
        System.out.println(hd.toString());
        
    }
    
}
