package edu.escuelaing.arep.model;

import java.util.LinkedList;

public class CustomList<T extends  Comparable <? super T>> {

    private LinkedList<T> values;

    public CustomList() {
        this.values = new LinkedList<>();
    }

    public LinkedList<T> getValues() {
        return values;
    }

    public void setValues(LinkedList<T> values) {
        this.values = values;
    }

    public void sort(){
        int n = this.values.size();
        while (n>0){
            int lastModified=0;
            for (int i = 1; i < n; i++) {
                if(values.get(i-1).compareTo(values.get(i))>0){
                    T temp=values.get(i-1);
                    values.set(i-1,values.get(i));
                    values.set(i,temp);
                    lastModified=i;
                }
            }
            n=lastModified;
        }
    }



}
