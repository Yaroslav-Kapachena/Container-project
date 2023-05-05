package com.example.Container;

import java.util.ArrayList;

public class Container<T> {
    private ArrayList<T> containers = new ArrayList<>();
    public Container(){
    }

    public Container(ArrayList<T> containers) {
        this.containers = containers;
    }

    public ArrayList<T> getContainers() {
        return containers;
    }

    public void setContainers(ArrayList<T> containers) {
        this.containers = containers;
    }
    public void containerAdd(T element){
        containers.add(element);
    }
    public T get(int index){
        return containers.get(index);
    }
    public int size(){
        return containers.size();
    }
    public void clear(){
        containers.clear();
    }
    public  void printInf(Container containers){
        for(T number:getContainers()){
            System.out.println("Контейнер содержит: "+number);
        }
    }
}

