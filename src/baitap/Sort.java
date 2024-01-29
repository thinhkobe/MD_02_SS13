package baitap;

import java.util.TreeMap;

public class Sort {
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 1, 6, 3};

        // Bước 2: Khai báo và khởi tạo một TreeMap để lưu trữ các phần tử
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();

        // Bước 3: Sử dụng vòng lặp để đưa các phần tử của mảng vào TreeMap với giá trị là 0
        for (int element : array) {
            treeMap.put(element, 0);
        }

        // Bước 4: In ra các phần tử trong TreeMap (đã sắp xếp theo thứ tự tăng dần của khóa)
        System.out.println("Các phần tử trong TreeMap (theo thứ tự tăng dần của khóa):");
        for (Integer key : treeMap.keySet()) {
            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));

        }
    }
}
