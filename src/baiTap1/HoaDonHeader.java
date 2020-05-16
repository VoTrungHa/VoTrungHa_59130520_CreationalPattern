/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author hp-pc
 */
public class HoaDonHeader {
    private String maHD;
    private String ngayBan;
    private String TenKH;

    private HoaDonHeader(Builder builder) {
        this.maHD=builder.maHD;
        this.TenKH=builder.TenKH; 
        this.ngayBan=builder.ngayBan;
    }

    @Override
    public String toString() {
        return "maHD: " + maHD + "\nngayBan:" +ngayBan + "\nTenKH:" + TenKH;
    }
 
     
    public static class Builder{
        
        private String maHD;
        private String ngayBan;
        private String TenKH;
    
        public Builder addMaHD(String maHD)
        {
            this.maHD=maHD;
            return this;
        }
        public Builder addNgayBan(String ngayBan)
        {
            this.ngayBan=ngayBan;
            return this;
        }
        public Builder addTenKH(String TenKH)
        {
            this.TenKH=TenKH;
            return this;
        }
        
        public HoaDonHeader Build()
        {
            return new HoaDonHeader(this);
        }
        
    }
    
}
