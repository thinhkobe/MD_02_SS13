package baitap.bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManagerment implements Iproduct<Product ,Integer >{
    static int nextId=1;
    List<Product> productList=new ArrayList<>();
    @Override
    public void addProduct(Product product) {
        productList.add(product);
        product.setId(nextId++);
    }

    @Override
    public void editProduct(Integer id) {
        Scanner sc=new Scanner(System.in);
        for (Product product : productList) {
            if (product==findById(id)){
                product.inputData(sc);
            }
        }
    }

    @Override
    public void removeProduct(Integer id) {
        for (Product product : productList) {
           if ( product.getId()==id){
               productList.remove(product);
           }
        }
    }

    @Override
    public List<Product> SreachByName(String name) {
        List<Product> resultList=new ArrayList<>();
        for (Product product : productList) {
            boolean check = product.getName().toLowerCase().trim().contains(name);
            if (check){
                resultList.add(product);
            }
        }
        return resultList;
    }
    public Product findById(Integer id){
        for (Product product : productList) {
            if (product.getId()==id){
                return product;
            }
        }
        System.err.println("nhập sai thông tin");
        return null;
    }
    public void displayAll (){
        for (Product product : productList) {
            System.out.println(product);
        }
    }
    public List<Product> getProductList(){
        return productList;
    }
}
