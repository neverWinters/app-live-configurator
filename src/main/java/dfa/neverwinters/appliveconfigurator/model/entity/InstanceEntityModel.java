package dfa.neverwinters.appliveconfigurator.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "instance")
public class InstanceEntityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank(message = "{generic.form.error.required}")
    @Column(name = "name")
    private String name;
    @NotBlank(message = "{generic.form.error.required}")
    @Column(name = "code")
    private String code;

    public InstanceEntityModel(String name, String code)
    {

        this.name = name;
        this.code = code;

    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getCode() { return code; }

    public void setCode(String code) { this.code = code; }

}
