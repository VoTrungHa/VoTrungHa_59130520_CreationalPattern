/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author hp-pc
 */
public class BaiTap2Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        MyStringBuilder msb= new MyStringBuilder.Builder().AddStr("Builder").AddBool(true).AddFloat(2.2f).builde();
        System.out.println(msb.toString());
    }
    
}
