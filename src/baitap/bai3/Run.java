package baitap.bai3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Run {
     static    Scanner sc=new Scanner(System.in);
     static    ProductManagerment productManagerment=new ProductManagerment();
    public static void main(String[] args) {
        while (true){
            System.out.println("=======MENU=====");
            System.out.println("1.Thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phẩm theo id\n" +
                    "3.Xóa sản phẩm theo id\n" +
                    "4.Tìm kiếm sản phẩm theo tên\n" +
                    "5.Hiển thị danh sách sản phẩm\n" +
                    "6.Sắp xếp sản phẩm tăng dần,\n" +
                    "7.giảm dần theo giá\n" +
                    "8.Thoát\n" +
                    "9.sắp xếp theo số lượng");
            System.out.println("nhập lựa chọn");
            int choice= Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    addSP();
                    break;
                case 2:
                    System.out.println("nhập id SP");
                    int id= Integer.parseInt(sc.nextLine());
                    productManagerment.editProduct(id);
                    break;
                case 3:
                    System.out.println("nhập id SP");
                    int idRemove= Integer.parseInt(sc.nextLine());
                    productManagerment.removeProduct(idRemove);
                    break;
                case 4:
                    System.out.println("nhập tên");
                    String key=sc.nextLine();
                    System.out.println(productManagerment.SreachByName(key));
                    break;
                case 5:
                    productManagerment.displayAll();
                    break;
                case 6:
                   sortByPriceIncree();
                    break;
                case 7:
                   sortByPriceDecree();
                    break;
                case 8:
                    return;
                case 9:
                    sortByQuantityIncree();
                    break;
                default:
                    System.err.println("nhập sai lựa chọn");
            }
        }
    }
    private static void addSP(){
        Product product=new Product();
        product.inputData(sc);
        productManagerment.addProduct(product);
    }
    private static void sortByPriceIncree(){
       List<Product> list=new ArrayList<>(productManagerment.productList);
        list.sort((o1, o2) -> (int) (o1.getPrice() - o2.getPrice()));
        System.out.println(list);
    }
    private static void sortByPriceDecree(){
        List<Product> list=new ArrayList<>(productManagerment.productList);
        list.sort((o1, o2) -> (int) (o2.getPrice() - o1.getPrice()));
        System.out.println(list);
    }
    private static void sortByName(){
        List<Product> list=new ArrayList<>(productManagerment.productList);
        list.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

    }
    private static void sortByQuantityIncree(){
        List<Product> list=new ArrayList<>(productManagerment.productList);
        list.sort((o1, o2) -> o1.getQuantity()- o2.getQuantity());
        System.out.println(list);
    }
}
