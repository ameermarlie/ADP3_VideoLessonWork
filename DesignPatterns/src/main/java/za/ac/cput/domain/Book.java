package za.ac.cput.domain;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class Book extends MyProduct{
    private String author;
    public Book(){
    }
    public Book(long productId, String name,String author) {
        this.productId=productId;
        this.name=name;
        this.author=author;
    }
    public String getAuthor() {return author;}
    public void setAuthor(String author) {this.author=author;}


    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", productId=" + productId +
                ", name='" + name + '\'' +
                '}';
    }
}
