package baitap.bai12;

import java.util.Random;
import java.util.TreeMap;

public class SeconlargestElement {
    public static void main(String[] args) {
        //B1: Khai báo và khởi tạo một mảng các số nguyên.
        //B2: Khai báo một đối tượng TreeMap để lưu trữ các phần tử trong mảng.
        // Với TreeMap, các phần tử sẽ được sắp xếp theo thứ tự tăng dần của khóa.
        //B3: Sử dụng một vòng lặp để đưa các phần tử của mảng vào TreeMap.
        // Đối với mỗi phần tử trong mảng, thêm nó vào TreeMap với giá trị là 0.
        //B4: Lấy giá trị của phần tử lớn nhất trong TreeMap.
        //B5: Xóa phần tử lớn nhất khỏi TreeMap.
        //B6: Lúc này phần tử lớn nhất trong treemap sẽ là phần tử lớn thứ 2 trong mảng ban đầu
        // , ta dung phương thức lastKey() để lấy nó ra.
        Random random=new Random();
        TreeMap<Integer, Integer> treeMap=new TreeMap<>();
        for (int i = 0; i <10; i++) {
            treeMap.put(i*random.nextInt(10),0);
        }
        System.out.println(treeMap);
        int largertestElement=treeMap.lastKey();
        System.out.println("lon nhat :"+largertestElement);
        treeMap.remove(largertestElement);
        int second=treeMap.lastKey();
        System.out.println("lon 2 : "+second);
    }
}
