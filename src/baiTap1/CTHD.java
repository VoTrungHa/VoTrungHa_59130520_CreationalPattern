/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap1;

/**
 *
 * @author hp-pc
 */
public class CTHD {
    
    private String sanPham;
    private int soLuong;
    private double donGia;
    private String chietKhau;

    private CTHD(Builder builder) {
         this.chietKhau=builder.chietKhau;
         this.soLuong=builder.soLuong;
         this.donGia=builder.donGia;
         this.sanPham=builder.sanPham;
    }

    @Override
    public String toString() {
        return "sanPham: " + sanPham + "\nsoLuong: " + soLuong + "\ndonGia: " + donGia + "\nchietKhau:" + chietKhau+"\n";
    }
 
    public static class Builder{
    private String sanPham;
    private int soLuong;
    private double donGia;
    private String chietKhau;
    
    public Builder addSanPham(String sanPham)
    {
        this.sanPham=sanPham;
        return this;// 
    }
    public Builder addsoLuong(int soLuong)
    {
        this.soLuong=soLuong;
        return this;
    }
    public Builder addDonGia(double donGia)
    {
        this.donGia=donGia;
        return this;
    }
    public Builder addchietKhau(String chietKhau)
    {
        this.chietKhau=chietKhau;
        return this;
    }
    public CTHD Build()
    {
        return new CTHD(this);
    }
        
    }
}
