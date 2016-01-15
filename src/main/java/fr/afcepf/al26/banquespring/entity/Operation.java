package fr.afcepf.al26.banquespring.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "operation")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE_OPERATION")
public class Operation {

    @Id
    @Column(name = "numero_operation")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer numero;
    @Column(name = "montant_operation",nullable = false)
    private Double montant;
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "date_operation", nullable = false)
    private Date dateOperation;
    @ManyToOne
    @JoinColumn(name = "id_compte")
    private Compte compte;


    public Operation() {
    }

    public Operation(Double montant, Date dateOperation, Compte compte) {
        this.montant = montant;
        this.dateOperation = dateOperation;
        this.compte = compte;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Date getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(Date dateOperation) {
        this.dateOperation = dateOperation;
    }

}
