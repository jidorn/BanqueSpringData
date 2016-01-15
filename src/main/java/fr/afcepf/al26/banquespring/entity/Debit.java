package fr.afcepf.al26.banquespring.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Date;

/**
 * Created by Stagiaire on 15/01/2016.
 */
@Entity
@DiscriminatorValue(value = "DEBIT")
public class Debit extends Operation {
    public Debit() {
    }

    public Debit(Double montant, Date dateOperation, Compte compte) {
        super(montant, dateOperation, compte);
    }
}
