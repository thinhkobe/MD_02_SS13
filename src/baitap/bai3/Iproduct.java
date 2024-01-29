package baitap.bai3;

import java.util.List;

public interface Iproduct <T,E>{
    void addProduct(T Product);
    void editProduct(E id);
    void removeProduct(E id);
    List<T> SreachByName(String name);
}
