package calcio.model.entity;

import javax.persistence.*;

/**
 * Created by nexse on 12/05/2017.
 */
@Entity
@Table(name = "tb_squadra")
public class Squadra {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "cl_name")
    private String name;

    @Column(name = "cl_citta")
    private String citta;

    public Squadra(String name, String citta) {
        this.name = name;
        this.citta = citta;
    }

    public Squadra () {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    @Override
    public String toString() {
        return "Squadra{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", citta='" + citta + '\'' +
                '}';
    }
}
