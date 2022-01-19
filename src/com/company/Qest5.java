package com.company;

import java.util.*;

public class Qest5 {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(random.nextInt(100));

        }
        System.out.println(list);
        for (int i = 0; i < 10; i++) {
            try {
                if (list.get(i) % 3 == 0) {
                    throw new MyEx(list.get(i)+" Делится на 3 без остатка");
                }
            } catch (MyEx myEx) {
                myEx.printStackTrace();
            } //finally {
            //System.out.println("Деление на 3");
            list.set(i, list.get(i) / 3);

        }//

        System.out.println(list);


            // вопр7
            Map<String, Double> hashMap = new HashMap<>();

            hashMap.put("Муж", 45.5);
            hashMap.put("Сын1", 14.5);
            hashMap.put("Сын2", 9.6);
            hashMap.put("Я", 41.2);

            Set<Map.Entry<String, Double>> set = hashMap.entrySet();
            for (Map.Entry<String, Double> me : set) {
                System.out.print(me.getKey() + ": ");
                System.out.println(me.getValue());
            }
            Double value = hashMap.get("Муж");
            hashMap.put("Муж", value + 0.4);
            System.out.println("Мужу стало " + hashMap.get("Муж"));




    }
}
