package za.ac.cput.service;
//The service layer is what the business is allowing the application to do example on the client side
public interface IService<T, ID> {
    T create (T t);

    T read (ID id);

    T update(T t);

}
