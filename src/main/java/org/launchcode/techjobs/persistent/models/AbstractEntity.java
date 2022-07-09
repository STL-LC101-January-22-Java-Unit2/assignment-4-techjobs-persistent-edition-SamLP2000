package org.launchcode.techjobs.persistent.models;

import java.util.Objects;
import javax.persistence.GeneratedValue;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;
import javax.persistence.Id;


@MappedSuperclass
public abstract class AbstractEntity {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "Please enter your name.")
    @Size(min = 3, max = 100, message = "The name must be between 3 and 100 characters")
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}