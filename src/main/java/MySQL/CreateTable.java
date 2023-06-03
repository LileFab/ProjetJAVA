package MySQL;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    private String SQL_Query = "CREATE TABLE IF NOT EXISTS compte\n" +
            "(\n" +
            "    id INT PRIMARY KEY NOT NULL,\n" +
            "    numero_securite_sociale VARCHAR(50),\n" +
            "    nom VARCHAR(100),\n" +
            "    prenom VARCHAR(100),\n" +
            "    date_naissance DATE,\n" +
            "    numero_telephone VARCHAR(100),\n" +
            "    email VARCHAR(255),\n" +
            "    id_remboursement VARCHAR(255),\n" +
            "    code_soin VARCHAR(255),\n" +
            "    montant_remboursement INT\n" +
            ")";

    public void Execute(Connection conn){
        try{
            Statement st = conn.createStatement();
            st.executeUpdate(this.SQL_Query);
        } catch (SQLException e) {
            System.out.println("An error has occured on Table Creation");
            e.printStackTrace();
        }
    }
}
