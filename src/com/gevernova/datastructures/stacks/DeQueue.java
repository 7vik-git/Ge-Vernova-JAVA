package com.gevernova.datastructures.stacks;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class DeQueue {
    Deque<Integer> deque = new ArrayDeque<>();

    public static void main(String[] args) {
        HashMap<Character, Integer> hmap = new HashMap<>();
        hmap.put('a',hmap.getOrDefault('a', 0)+1);
        hmap.put('b',hmap.getOrDefault('b', 0)+1);
        hmap.put('c',hmap.getOrDefault('c', 0)+1);
        hmap.put('a',hmap.getOrDefault('a', 0)+1);
        hmap.put('x',hmap.getOrDefault('x', 0)+1);
        for(Character key:hmap.keySet()){
            System.out.print(key + " -> ");
            System.out.println(hmap.get(key));
        }
    }

}
