/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTap3;

/**
 *
 * @author hp-pc
 */
public class Rectangle extends Shape{
 
    public Rectangle() {
        setBrush(" Rectangle ");
        setFrame("chiều dai 4 rộng 2");
        setPaper("giấy ô ly");
    }
    @Override
    public String draw() { 
       return getBrush()+"\n"+getPaper()+"\n"+getFrame();
    }
    
}
