package edu.escuelaing.arep.services;

import edu.escuelaing.arep.model.CustomList;

import java.util.LinkedList;

/**
 * Implementación de los servicios de la clase que utiliza una CustomList para ordenar
 * los elementos
 */
public class ListServicesImpl implements ListServices{

    /**
     * Utiliza un objeto de CustomList para ordenar la lista
     * @param list la lista a ordenar
     * @return la lista ordenada
     */
    @Override
    public LinkedList<Integer> sort(LinkedList<Integer> list) {
        CustomList<Integer> customList=new CustomList<Integer>();
        customList.setValues(list);
        customList.sort();
        return customList.getValues();
    }

    @Override
    public int sum(LinkedList<Integer> list) {
        int sum =0;
        for (int i : list) {
            sum+=i;
        }
        return sum;
    }

    @Override
    public double mean(LinkedList<Integer> list) {
        return (double)sum(list)/list.size();
    }
}
