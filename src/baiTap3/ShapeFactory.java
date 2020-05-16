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
public class ShapeFactory{ 
    private static ShapeFactory instance; // đảm bảo việc tạo đối tượng chỉ do chính lớp đó đảm nhân;
    protected ShapeFactory()
    { 
    }
    public static ShapeFactory createInstance()// staic chp phép truy cập phương thưc nay thông qua ten class
                                                // 
    {
        if(instance==null)
        {
            instance=new ShapeFactory();
        }
        return instance;
    }
    
    public Shape createShape(ShapeType shapeType)
    { 
        switch(shapeType)
        {
            case Rectangle:  return new Rectangle(); 
            case Triangle: return new Triangle();
            case Circle: return new Circle();
            default: return null;
        } 
         
    }
    
}
