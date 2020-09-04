package hashes;

import java.util.Objects;

/**
 *
 * @author jvazquezolivares
 */
public class User {
    private int id;
    private String email;
    private String name;
    private String lasName;
    private String telefono;

    public User(int id, String name, String email, String telefono) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.telefono = telefono;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.email);
        hash = 89 * hash + Objects.hashCode(this.name);
        hash = 89 * hash + Objects.hashCode(this.lasName);
        hash = 89 * hash + Objects.hashCode(this.telefono);
        System.out.println("hascode: " + hash);
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
        final User other = (User) obj;
        return true;
    }
      
    
}
