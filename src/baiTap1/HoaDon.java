/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap1;

import java.util.ArrayList;

/**
 *
 * @author hp-pc
 */
public class HoaDon {
    
    private HoaDonHeader donHeader;
    private ArrayList<CTHD>ListChiTietHoaDon;

    private HoaDon(Builder builder) {
        this.ListChiTietHoaDon=builder.ListChiTietHoaDon;
        this.donHeader=builder.donHeader;
    }

    

    @Override
    public String toString() {
        return ListChiTietHoaDon +"\n" + donHeader;
    }
    
    
    
    public static class Builder
    {
         private HoaDonHeader donHeader;
        private ArrayList<CTHD>ListChiTietHoaDon;
        
        public Builder()
        {
            ListChiTietHoaDon=new ArrayList<>();
        }
        
        public Builder AddCTHD(CTHD cthd)
        {
            this.ListChiTietHoaDon.add(cthd);
            return this;// trả về kiểu Builder
        }
        public Builder AddHD(HoaDonHeader donHeader)
        {
            this.donHeader=donHeader;
            return this;
        }
        
        public HoaDon Build()
        {
            return new HoaDon(this);
        }
    } 
}
