package hashes;

import java.util.Objects;

/**
 *
 * @author jvazquezolivares
 */
public class MetodoEquals {
/*
 * Reflexivo: En el caso de una referencia "a", a.equals(a) debe retornar true.
 * Simétrico: Dada una referencia a y b, si a.equals(b) retorna true, entonces b.equals(a) debe retornar true.
 * Transitivo: Dadas las referencias a, b y c, si a.equals(b) devuelve true, y b.equals(c) devuelve true, entonces a.equals(c) debe devolver true.
 * Consistente: Dadas las referencias a y b, múltiples invocaciones de a.equals(b) deben retornar siempre true o bien siempre false.
 */
    
    public static void main(String[] args) {
        Student student1 = new Student(1, "Javier", "12345");
        Student student2 = new Student(1, "Javier", "12345");
        Student student3 = new Student(1, "Javier", "12345");
        
        System.out.println("Son iguales estos estudiantes? " + student1.equals(student2));
        System.out.println("Son iguales estos estudiantes? " + student2.equals(student3));
        System.out.println("Son iguales estos estudiantes? " + student1.equals(student3));
    }
    
    static class Student {
        private int id;
        private String name;
        private String telefono;

        public Student(int id, String name, String telefono) {
            this.id = id;
            this.name = name;
            this.telefono = telefono;
        }

        @Override
        public int hashCode() {
            int hash = 7;
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null) {
                return false;
            }
            if (getClass() != obj.getClass()) {
                return false;
            }
            final Student other = (Student) obj;
            if (this.id != other.id) {
                return false;
            }
            if (!Objects.equals(this.name, other.name)) {
                return false;
            }
            if (!Objects.equals(this.telefono, other.telefono)) {
                return false;
            }
            return true;
        }
        
        

        public String getTelefono() {
            return telefono;
        }

        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        
        
    }
    
}
