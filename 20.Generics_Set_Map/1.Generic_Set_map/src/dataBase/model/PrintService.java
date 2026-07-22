package dataBase.model;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> list = new ArrayList<>();

    public PrintService(List<T> list) {
        this.list = list;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }


    public void add(T value){
        list.add(value);
    }
    public void first(){
        System.out.println("first element: "+ list.get(0));
    }

    public void print(){
        System.out.println("Print arrayList : ");
        for(T lista : list){
            System.out.println(lista);
        }
    }

    public void count(){
            int count = list.size();
        System.out.println("Number in your array : " + count);
    }

    public void last(){
        System.out.println("remove de last array : " +  list.getLast());
       list.remove(list.getLast());
    }

    public void somar() {
        int sum = 0;

        for (Object item : list) {
            if (item instanceof Integer) {
                sum += (Integer) item;
            }
        }

        System.out.println("Todos os numeros somados: " + sum);
    }

}
