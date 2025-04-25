package com.gevernova.workshop.three;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class GroupAnagram {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<ArrayList<String> > aList = new ArrayList<ArrayList<String> >();
        list.add("eat");
        list.add("tea");
        list.add("tan");
        list.add("ate");
        list.add("nat");
        list.add("bat");
        HashMap<String, ArrayList<String> >hmap = new HashMap<>();
        for(int i=0;i<list.size();i++){
            String str = list.get(i);
            char[] words = list.get(i).toCharArray();
            Arrays.sort(words);
            String s = Arrays.toString(words);
            if(!hmap.containsKey(s)){
                hmap.put(s, new ArrayList<>());
            }
            hmap.get(s).add(str);
        }
        Integer[] arr = new Integer[2];
        arr[1]=584;
        arr[0]=72;
        System.out.println(arr[0]);
        System.out.println(hmap.size());
        for (String key : hmap.keySet()) {
            aList.add(hmap.get(key));
        }
    }
}
