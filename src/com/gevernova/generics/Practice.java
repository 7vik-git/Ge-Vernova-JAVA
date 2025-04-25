package com.gevernova.generics;

class GenericsPractice<T>{
    private T data;
    public void setData(T data){
        this.data=data;
    }
    public T getData(){
        return data;
    }
}

public class Practice {
    public static void main(String[] args) {
        int x = 9;
        GenericsPractice<Integer> gp = new GenericsPractice<>();
        gp.setData(x);
        int y = gp.getData();
        System.out.println(y);
    }
}
