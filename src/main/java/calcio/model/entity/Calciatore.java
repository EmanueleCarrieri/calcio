package calcio.model.entity;

import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * Created by nexse on 12/05/2017.
 */

@Entity
@Table(name = "tb_calciatore")
@Component
public class Calciatore {

    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "cl_nome")
    private String nome;

    @Column(name = "cl_numero")
    private int numero;

    @ManyToOne
    @JoinColumn(name = "id_squadra")
    private Squadra squadra;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Squadra getSquadra() {
        return squadra;
    }

    public void setSquadra(Squadra squadra) {
        this.squadra = squadra;
    }

    @Override
    public String toString() {
        return "Calciatore{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numero=" + numero +
                ", squadra=" + squadra +
                '}';
    }
}