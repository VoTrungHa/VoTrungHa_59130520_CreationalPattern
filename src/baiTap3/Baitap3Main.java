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
public class Baitap3Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ShapeFactory factory= ShapeFactory.createInstance();
         
        Shape Triangle= factory.createShape(ShapeType.Triangle);
        Shape Circle= factory.createShape(ShapeType.Circle);
        
        System.out.println(Triangle.draw());
        System.out.println(Circle.draw());
        
    
}
}
