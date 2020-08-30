package curso.colecciones.colaspilas.pacientes;

/**
 *
 * @author jvazquezolivares
 */
public enum Gravity {  
    
    MINOR("Minor", 1),
    MODERATE("Moderate", 2),
    SEVERE("Severe", 3),
    VERY_SEVERE("Very Severe", 4);
    
    private String description;
    private Integer level;
    
    private Gravity(String description, Integer level){
       this.description = description;
       this.level = level;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    
    
}
