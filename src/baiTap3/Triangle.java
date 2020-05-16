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
public class Triangle extends Shape{
 public Triangle() {
        setBrush(" Triangle ");
        setFrame("các cạnh lần lượt là 3 4 10s");
        setPaper("giấy ô ly");
    }
    @Override
    public String draw() { 
       return getBrush()+"\n"+getPaper()+"\n"+getFrame();
    }
    
}
