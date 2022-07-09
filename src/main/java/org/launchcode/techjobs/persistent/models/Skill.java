package org.launchcode.techjobs.persistent.models;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description is required")
    @Size(min = 3, max = 100, message = "Description must be between 3 and 100 characters")
    private String description;

    @ManyToMany(mappedBy = "skills")
    private List<Job> jobs = new ArrayList<>();

    public Skill(String descrpition) {
        this.description = descrpition;
    }
    public Skill(){
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }
}