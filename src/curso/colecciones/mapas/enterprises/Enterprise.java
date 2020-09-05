package curso.colecciones.mapas.enterprises;

import java.util.Objects;

/**
 *
 * @author jvazquezolivares
 */
public class Enterprise {
    private int id;
    private String name;
    private String sector;

    public Enterprise(String name) {
        this.name = name;
    }

    public Enterprise(int id, String name, String sector) {
        this.id = id;
        this.name = name;
        this.sector = sector;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
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
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.name);
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
        final Enterprise other = (Enterprise) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Enterprise{" + "id=" + id + ", name=" + name + ", sector=" + sector + '}';
    }
    
    
}
