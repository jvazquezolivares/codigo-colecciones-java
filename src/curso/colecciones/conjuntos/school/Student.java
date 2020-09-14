package curso.colecciones.conjuntos.school;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author jvazquezolivares
 */
public class Student {
    private String name;
    private List<String> teams;

    public Student(String name, List<String> teams) {
        this.name = name;
        this.teams = teams;
    }

    public List<String> getTeams() {
        return teams;
    }

    public void setTeams(List<String> teams) {
        this.teams = teams;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.name);
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
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
}
