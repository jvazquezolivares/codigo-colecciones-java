package curso.colecciones.comparadores;

import java.util.Comparator;

/**
 *
 * @author jvazquezolivares
 */
public class AgeComparator implements Comparator<Student>{

    @Override
    public int compare(Student std1, Student std2) {
        if (std1.getAge() == std2.getAge()) {
            return 0;
        }
        else if(std1.getAge() > std2.getAge()){
            return -1;
        }
        else {
            return 1;
        }
    }
    
}
