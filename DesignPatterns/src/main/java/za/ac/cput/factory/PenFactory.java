package za.ac.cput.factory;

import za.ac.cput.domain.Pen;
import za.ac.cput.util.Helper;

public class PenFactory {
    public static Pen buildPen(long productId,String name,String color){
        if(productId<=0){
            return null;
        }
        if(Helper.isNullOrEmpty(name)||Helper.isNullOrEmpty(color)){
            return null;
        }
        return new Pen(productId,name,color);
    }
}
