package za.ac.cput.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Pen extends MyProduct {
    private String color;
    protected Pen() {}
    public Pen(long productId, String name,String color) {
        this.productId=productId;
        this.name=name;
        this.color=color;
    }
    public String getColor() {return color;}
    public void setColor(String color) {this.color=color;}

    @Override
    public String toString() {
        return "Pen{" +
                "color='" + color + '\'' +
                ", productId=" + productId +
                ", name='" + name + '\'' +
                '}';
    }
}
