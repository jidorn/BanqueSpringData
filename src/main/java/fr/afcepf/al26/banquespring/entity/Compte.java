package fr.afcepf.al26.banquespring.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Stagiaire on 15/01/2016.
 */
@Entity
@Table(name = "compte")
public class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_compte")
    private Integer numero;
    @Column(name = "type_compte",length = 50, nullable = false)
    private String typeCompte;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_creation")
    private Date dateCreation;

    @ManyToOne
    @JoinColumn(name = "id_client",nullable = false)
    private Client client;

    public Compte(Integer numero, String typeCompte, Date dateCreation, Client client) {
        this.numero = numero;
        this.typeCompte = typeCompte;
        this.dateCreation = dateCreation;
        this.client = client;
    }

    public Compte() {
    }


    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
