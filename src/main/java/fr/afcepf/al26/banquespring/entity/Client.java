package fr.afcepf.al26.banquespring.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Created by Stagiaire on 15/01/2016.
 */
@Entity
@Table(name = "client")
@Inheritance(strategy = InheritanceType.JOINED)
public class Client extends Utilisateur {
    public Client() {
    }

    public Client(Integer id, String nom, String prenom, String mail, String mdp) {
        super(id, nom, prenom, mail, mdp);
    }
}
