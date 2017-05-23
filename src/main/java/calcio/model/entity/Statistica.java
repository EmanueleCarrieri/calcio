package calcio.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by nexse on 18/05/2017.
 */

@Entity
@Table(name = "tb_statistica")
public class Statistica {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "cl_partite")
    private int partiteGiocate;

    @Column(name = "cl_reti")
    private int numeroReti;

    @OneToOne
    @JoinColumn(name="id_giocatore")
    private Calciatore calciatore;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPartiteGiocate() {
        return partiteGiocate;
    }

    public void setPartiteGiocate(int partiteGiocate) {
        this.partiteGiocate = partiteGiocate;
    }

    public int getNumeroReti() {
        return numeroReti;
    }

    public void setNumeroReti(int numeroReti) {
        this.numeroReti = numeroReti;
    }

    public Calciatore getCalciatore() {
        return calciatore;
    }

    public void setCalciatore(Calciatore calciatore) {
        this.calciatore = calciatore;
    }

    @Override
    public String toString() {
        return "Statistica{" +
                "id=" + id +
                ", partiteGiocate=" + partiteGiocate +
                ", numeroReti=" + numeroReti +
                ", calciatore=" + calciatore +
                '}';
    }
}
