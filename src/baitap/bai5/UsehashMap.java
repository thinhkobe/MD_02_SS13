package baitap.bai5;

import java.util.*;

public class UsehashMap {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        // Thêm các phần tử vào HashMap
        hashMap.put("A", 10);
        hashMap.put("B", 20);
        hashMap.put("C", 30);
        hashMap.put("d", 15);
        List<Map.Entry<String,Integer>> list=new ArrayList<>(hashMap.entrySet());
        list.sort(Map.Entry.comparingByValue());
        System.out.println(hashMap);
        System.out.println(list);
    }
}
