package demo;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        // Tạo một đối tượng HashMap với khóa là String và giá trị là Integer
        HashMap<String, Integer> hashMap = new HashMap<>();

        // put(K key, V value): Thêm một cặp khóa-giá trị vào HashMap
        hashMap.put("Java", 1);
        hashMap.put("Python", 2);
        hashMap.put("C++", 3);

        // get(Object key): Lấy giá trị tương ứng với khóa
//        System.out.println(hashMap.get("Java"));//  ket qua 1
//
//        // remove(Object key): Loại bỏ cặp khóa-giá trị tương ứng với khóa cho trước
//        hashMap.replace("Java", 2); //thay đổi giá trị của java thành 2
//        System.out.println(hashMap);
//        System.out.println("Tập hợp các khóa trong HashMap: " + hashMap.keySet());
//
//        // containsKey(Object key): Kiểm tra xem HashMap có chứa một khóa cụ thể hay không
//        System.out.println(hashMap.containsKey("Java")); //trả về true
//
//        // containsValue(Object value): Kiểm tra xem HashMap có chứa một giá trị cụ thể hay không
//        System.out.println(hashMap.containsValue(2));//trả về boolean nếu có 2 sẽ trả về 2 lần

        // size(): Trả về số lượng cặp khóa-giá trị trong HashMap
//        System.out.println(hashMap.size());

        // keySet(): Trả về một tập hợp chứa tất cả các khóa trong HashMap
        System.out.println(hashMap.keySet());//[Java, C++, Python]

        // values(): Trả về một tập hợp chứa tất cả các giá trị trong HashMap
        System.out.println(hashMap.values());//[1, 3, 2]

        // entrySet(): Trả về một tập hợp chứa tất cả các cặp khóa-giá trị trong HashMap
        System.out.println(hashMap.entrySet());//[Java=1, C++=3, Python=2]

        // clear(): Xóa tất cả các phần tử khỏi HashMap
        hashMap.clear();
        System.out.println(hashMap);//
    }

}
