package dfa.neverwinters.appliveconfigurator.model.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name = "consumer")
public class ConsumerEntityModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotBlank(message = "{generic.form.error.required}")
    @Column(name = "name")
    private String name;
    @NotBlank(message = "{generic.form.error.required}")
    @Column(name = "username")
    private String username;
    @NotBlank(message = "{generic.form.error.required}")
    @Column(name = "password")
    private String password;

    public ConsumerEntityModel() { }

    public ConsumerEntityModel(String name, String username, String password)
    {
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public long getId() { return id; }

    public void setId(long id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getUsername() { return username; }

    public void setUsername(String username) { this.username = username; }

    public String getPassword() {  return password; }

    public void setPassword(String password) { this.password = password; }

}
