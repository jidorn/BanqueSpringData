package fr.afcepf.al26.banquespring.entity;

import javax.persistence.*;

/**
 * Created by Stagiaire on 15/01/2016.
 */
@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.JOINED)
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_utilisateur")
    private Integer id;
    @Column(name = "nom",length = 50)
    private String nom;
    @Column(name = "prenom",length = 50)
    private String prenom;
    @Column(name = "mail",length = 50)
    private String mail;
    @Column(name = "mdp",length = 50)
    private String mdp;

    public Utilisateur() {
    }

    public Utilisateur(Integer id, String nom, String prenom, String mail, String mdp) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.mail = mail;
        this.mdp = mdp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
