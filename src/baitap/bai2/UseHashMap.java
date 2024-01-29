package baitap.bai2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {
        List<Integer> randomIntegerList = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            int randomNumber=(int)(Math.random()*10)+1;
            randomIntegerList.add(randomNumber);

        }
        System.out.println("danh sach so ngau nhien có 15 số"+randomIntegerList);
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        // Duyệt các phần tử có trong mảng và đưa nó vào HashMap
        for (int i = 0; i < randomIntegerList.size(); i++) {
            int currentNumber = randomIntegerList.get(i);
            // Kiểm tra xem khóa đã tồn tại trong HashMap chưa
            if (hashMap.containsKey(currentNumber)) {
                // Nếu đã tồn tại, tăng giá trị tương ứng với khóa đó
                int currentValue = hashMap.get(currentNumber);
                hashMap.put(currentNumber, currentValue + 1);
            } else {
                // Nếu chưa tồn tại, thêm khóa mới vào HashMap
                hashMap.put(currentNumber, 1);
            }
        }
        System.out.println("list các số "+hashMap);


//        for (Map.Entry<Integer, Integer> integerIntegerEntry : hashMap.entrySet()) {
//            if (integerIntegerEntry.getValue()==1){
//                System.out.println(integerIntegerEntry.getKey()+"xuất hiện 1 lần");
//            }
//        }
        for (Integer key :hashMap.keySet()){
            if (hashMap.get(key)==1){
                System.out.println(key+":"+ hashMap.get(key));
            }
        }
    }
}
