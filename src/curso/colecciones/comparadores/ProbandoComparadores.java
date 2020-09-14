package curso.colecciones.comparadores;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author jvazquezolivares
 */
public class ProbandoComparadores {
    public static void main(String[] args) {
        //PriorityQueue, TreeMap, TreeSet aplican los principios de comparación.
        
        List<String> nombres = new ArrayList<>();
        nombres.add("Raquel");
        nombres.add("Esteban");
        nombres.add("Arturo");
        nombres.add("Javier");
        nombres.add("Sebastián");
        nombres.add("Adriana");
        nombres.add("Oyuki");
        
        System.out.println(nombres);
        
        Collections.sort(nombres);
        
        System.out.println("\n nombres después de la ordenación:");
        System.out.println(nombres);
        
        System.out.println("\nOrdenamiento inverso de nombres");
        Collections.sort(nombres, Collections.reverseOrder());
        System.out.println(nombres);
        
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(8);
        numeros.add(8);
        numeros.add(1);
        numeros.add(9);
        numeros.add(11);
        
        System.out.println("\n");
        System.out.println(numeros);
        
        Collections.sort(numeros);
        
        System.out.println("\nNúmeros después de la ordenación:");
        System.out.println(numeros);
        
        System.out.println("\nOrdenamiento inverso de números:");
        Collections.sort(numeros, Collections.reverseOrder());
//        System.out.println(numeros);

        ArrayList<Student> students1 = new ArrayList<>();
        students1.add(new Student(1, "Leo", 28));
        students1.add(new Student(2, "Ingrid", 18));
        students1.add(new Student(3, "Pam", 19));
        students1.add(new Student(4, "Loa", 22));
        students1.add(new Student(3, "Octavio", 27));

        Collections.sort(students1, Collections.reverseOrder());

        students1.forEach(System.out::println);
        
        System.out.println("\n");
        ArrayList<Student2> student2 = new ArrayList<>();
        student2.add(new Student2(1, "Leo", 28));
        student2.add(new Student2(2, "Ingrid", 18));
        student2.add(new Student2(3, "Pam", 19));
        student2.add(new Student2(4, "Loa", 22));
        student2.add(new Student2(3, "Octavio", 27));

        Collections.sort(student2);

        student2.forEach(System.out::println);
        
        ArrayList<Student> students2 = new ArrayList<>();
        students2.add(new Student(1, "Leo", 28));
        students2.add(new Student(2, "Ingrid", 18));
        students2.add(new Student(3, "Pam", 19));
        students2.add(new Student(4, "Loa", 22));
        students2.add(new Student(3, "Octavio", 27));

        Collections.sort(students2, new AgeComparator());
        
         Collections.sort(
                students2, 
                (std1, std2) -> {
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
                );
        
        System.out.println("Comparamiento utilizando Comparator: ");

        students2.forEach(System.out::println);
        
        System.out.println("\n");
        
        ArrayList<Student> studentsByName = new ArrayList<>();
        studentsByName.add(new Student(1, "Leo", 28));
        studentsByName.add(new Student(2, "Ingrid", 18));
        studentsByName.add(new Student(3, "Pam", 19));
        studentsByName.add(new Student(4, "Loa", 22));
        studentsByName.add(new Student(3, "Octavio", 27));

        Collections.sort(studentsByName, new NameComparator());
        
        System.out.println("Comparamiento por nombres utilizando Comparator: ");

        studentsByName.forEach(System.out::println);
        
        System.out.println("\n");

        ArrayList<Student> studentsByName2 = new ArrayList<>();
        studentsByName2.add(new Student(1, "Leo", 28));
        studentsByName2.add(new Student(2, "Ingrid", 18));
        studentsByName2.add(new Student(3, "Pam", 19));
        studentsByName2.add(new Student(4, "Loa", 22));
        studentsByName2.add(new Student(3, "Octavio", 27));

        Collections.sort(studentsByName2, (std1, std2) -> std1.getName().compareTo(std2.getName()) );
        
        System.out.println("Comparamiento por nombres utilizando Comparator: ");

        studentsByName2.forEach(System.out::println);
        
        System.out.println("\n");
    }
}
