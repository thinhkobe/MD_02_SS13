package baitap.bai3;

import java.util.Scanner;

public class Product {
    int id;
    String name;
    double price;
    int quantity;

    public Product() {
    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void inputData(Scanner sc){
            System.out.println("nhập tên sản phẩm");
            this.name=sc.nextLine();
        System.out.println("nhập giá sản phẩm");
        this.price= Double.parseDouble(sc.nextLine());
        System.out.println("nhập số lượng sản phẩm sản phẩm");
        this.quantity= (int) Double.parseDouble(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }
}
