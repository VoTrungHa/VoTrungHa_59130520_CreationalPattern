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
        setBrush("Cọ");
        setFrame("Gỗ các cạnh lần lượt là 3 4 10s");
        setPaper("A4");
    }
    @Override
    public String draw() { 
       return "Brush: "+getBrush()+"\nPaper: "+getPaper()+"\nFrame: "+getFrame();
    }
    
}
