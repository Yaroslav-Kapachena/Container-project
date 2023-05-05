package com.example.Main;

import com.example.Container.Container;

public class Main {
    public static void main(String[] args) {
        Container<Integer> container1 = new Container();
        //Account<Integer, String> account = new Account<>();
        container1.containerAdd(685);
        container1.size();
        container1.containerAdd(789);
        container1.printInf(container1);

        Container<String> container2 = new Container<>();
        container2.containerAdd("Переменная");
        container2.clear();
        Container<Character> container3= new Container();
        container3.containerAdd('y');
        container3.get(1);
        Container<Boolean> container4 = new Container<>();
        container4.containerAdd(true);
        container4.printInf(container4);
        Container<Integer> container5 = new Container<>();
        container5.containerAdd(567);
        container5.size();
        Container<Double> container6 = new Container<>();
        container6.containerAdd(22.4);
        container6.printInf(container6);
        container6.size();
    }
}
