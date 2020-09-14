/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.colecciones.comparadores;

import java.util.Comparator;

/**
 *
 * @author jvazquezolivares
 */
public class NameComparator implements Comparator<Student>{

    @Override
    public int compare(Student std1, Student std2) {
        return std1.getName().compareTo(std2.getName());
    }
    
    
    
}
