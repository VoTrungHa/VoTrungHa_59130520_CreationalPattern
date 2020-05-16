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
public class MyStringBuilder {
    
    private String str;

    private MyStringBuilder(Builder builder) {
        this.str=builder.str;
    } 
    @Override
    public String toString() {
        return "Chuổi str: "+str;
    }
     
    public static class Builder{
        private String str; 
        public Builder AddStr(String str)
        {
            this.str=str;
            return this;
        }
        public Builder AddBool(boolean b)
        {
            this.str+=b;
            return this;
        }
        public Builder AddFloat(Float f)
        {
            this.str+=f;
            return this;
        }
        public MyStringBuilder builde()
        {
            return new MyStringBuilder(this);
        }
    }
}
