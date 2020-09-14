package curso.colecciones.comparadores;

import java.util.Objects;

/**
 *
 * @author jvazquezolivares
 */
public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 13 * hash + this.id;
        hash = 13 * hash + Objects.hashCode(this.name);
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
        return true;
    }

    @Override
    public int compareTo(Student student) {
        if (this.age == student.getAge()) {
            return 0;
        } else if (this.age > student.getAge())
        {
            return 1;
            // return -1; para orden inverso
        }else {
            return -1;
            // return 1; para orden inverso
        }
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", age=" + age + '}';
    }
    
    
}
