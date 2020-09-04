package edu.escuelaing.arep.model;

import java.util.LinkedList;

/**
 * Objeto que encapsula una lista de tipo T y permite realizar algunas operaciones
 * sobre esta
 * @param <T> el tipo de la lista debe extender la clase Comparable
 */
public class CustomList<T extends  Comparable <? super T>> {

    private LinkedList<T> values;

    public CustomList() {
        this.values = new LinkedList<>();
    }

    /**
     * retorna la lista que se esta encapsulando
     * @return la lista encapsulada
     */
    public LinkedList<T> getValues() {
        return values;
    }

    /**
     * establece la lista que encapsula el objeto
     * @param values la lista que usara el objeto
     */
    public void setValues(LinkedList<T> values) {
        this.values = values;
    }

    /**
     * Ordena los elementos de la lista utilizando el algoritmo bubble sort
     */
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
