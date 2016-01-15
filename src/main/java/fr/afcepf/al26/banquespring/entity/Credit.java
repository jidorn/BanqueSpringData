package fr.afcepf.al26.banquespring.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by Stagiaire on 15/01/2016.
 */
@Entity
@DiscriminatorValue(value = "CREDIT")
public class Credit extends Operation {
    public Credit() {
    }

    public Credit(Double montant, Date dateOperation, Compte compte) {
        super(montant, dateOperation, compte);
    }
}
