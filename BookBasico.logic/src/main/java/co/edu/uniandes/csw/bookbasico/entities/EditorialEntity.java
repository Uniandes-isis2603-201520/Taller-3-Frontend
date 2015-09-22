package co.edu.uniandes.csw.bookbasico.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class EditorialEntity implements Serializable {

    /**
     * La anotación @Id indica a JPA que este campo es la llave primaria de la entidad
     * La anotación @GeneratedValue indica a JPA que el campo es generado automáticamente. 
     * La secuencia del valor del id dependerá de "Editorial".
     */
    @Id
    @GeneratedValue(generator = "Editorial")
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}