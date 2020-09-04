package edu.escuelaing.arep.services;

import edu.escuelaing.arep.model.CustomList;

import java.util.LinkedList;
import java.util.List;

/**
 * especifica las funcionalidades de la lista usadas por la api
 */
public interface ListServices {

    /**
     * se encarga de ordenar una lista de enteros
     * @param list la lista a ordenar
     * @return la lista ordenada
     */
    LinkedList<Integer> sort(LinkedList<Integer> list);

    /**
     * suma los valores de una lista de enteros
     * @param list la lista de enteros
     * @return la suma de los enteros en la lista
     */
    int sum (LinkedList<Integer> list);

    /**
     * calcula la media de una lista de enteros
     * @param list la lista de enteros
     * @return la media de los enteros en la lista
     */
    double mean (LinkedList<Integer> list);



}
