package MySQL;

import java.util.Date;

public class Account {
    private int Id;
    private String Numero_Securite_Sociale;
    private String Nom;
    private String prenom;
    private Date Date_Naissance;
    private String Numero_Telephone;
    private String E_Mail;
    private String ID_Remboursement;
    private String Code_Soin;
    private String Montant_Remboursement;

    public Account() {}

    public Account(int id,
                   String numero_Securite_Sociale,
                   String nom, String prenom,
                   Date date_Naissance,
                   String numero_Telephone,
                   String e_Mail,
                   String ID_Remboursement,
                   String code_Soin,
                   String montant_Remboursement) {
        this.Id = id;
        this.Numero_Securite_Sociale = numero_Securite_Sociale;
        this.Nom = nom;
        this.prenom = prenom;
        this.Date_Naissance = date_Naissance;
        this.Numero_Telephone = numero_Telephone;
        this.E_Mail = e_Mail;
        this.ID_Remboursement = ID_Remboursement;
        this.Code_Soin = code_Soin;
        this.Montant_Remboursement = montant_Remboursement;
    }

    public int getId() {
        return this.Id;
    }

    public String getNumero_Securite_Sociale() {
        return this.Numero_Securite_Sociale;
    }

    public String getNom() {
        return this.Nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public Date getDate_Naissance() {
        return this.Date_Naissance;
    }

    public String getNumero_Telephone() {
        return this.Numero_Telephone;
    }

    public String getE_Mail() {
        return this.E_Mail;
    }

    public String getID_Remboursement() {
        return this.ID_Remboursement;
    }

    public String getCode_Soin() {
        return this.Code_Soin;
    }

    public String getMontant_Remboursement() {
        return this.Montant_Remboursement;
    }
}
