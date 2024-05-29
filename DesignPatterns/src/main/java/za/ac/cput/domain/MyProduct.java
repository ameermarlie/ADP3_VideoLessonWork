package za.ac.cput.domain;

import jakarta.persistence.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="product_type",
        discriminatorType= DiscriminatorType.INTEGER)
public class MyProduct {
    @Id
    protected long productId;
    protected String name;

    protected MyProduct(){}

    public MyProduct(long productId, String name) {
        this.productId = productId;
        this.name = name;
    }
    public long getProductId() {return productId;}
    public String getName() {return name;}
}
