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
public class Circle extends Shape{

    public Circle() {
        setBrush(" Circle ");
        setFrame("đường kính 4");
        setPaper("giấy ô ly");
    }
 
    @Override
    public String draw() { 
       return getBrush()+"\n"+getPaper()+"\n"+getFrame();
    }
 
}
