package curso.colecciones.mapas.enterprises;

import java.util.Objects;

/**
 *
 * @author jvazquezolivares
 */
public class Employee {
    private int id;
    private String name;
    private String nss;
    private String enterprise;

    public Employee(int id, String name, String nss, String enterprise) {
        this.id = id;
        this.name = name;
        this.nss = nss;
        this.enterprise = enterprise;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
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

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.nss);
        hash = 97 * hash + Objects.hashCode(this.enterprise);
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
        final Employee other = (Employee) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.nss, other.nss)) {
            return false;
        }
        if (!Objects.equals(this.enterprise, other.enterprise)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", nss=" + nss + ", enterprise=" + enterprise + '}';
    }
    
    
}
