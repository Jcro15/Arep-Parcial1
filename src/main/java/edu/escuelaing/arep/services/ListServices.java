package edu.escuelaing.arep.services;

import edu.escuelaing.arep.model.CustomList;

import java.util.LinkedList;
import java.util.List;

public interface ListServices {

    LinkedList<Integer> sort(LinkedList<Integer> list);

    int sum (LinkedList<Integer> list);

    double mean (LinkedList<Integer> list);



}
