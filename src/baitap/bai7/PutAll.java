package baitap.bai7;

import java.util.HashMap;

public class PutAll {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Thêm các phần tử vào HashMap
        hashMap.put("A", 10);
        hashMap.put("B", 20);
        hashMap.put("C", 30);
        hashMap.put("d", 15);
        HashMap<String, Integer> hashMap1 = new HashMap<>();
        hashMap1.putAll(hashMap);
    }
}
