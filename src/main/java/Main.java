import MySQL.CreateTable;
import MySQL.MyConnection;
import ReadFiles.CSVFileReader;
import ReadFiles.FindFiles;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws IOException {
        FindFiles findFiles = new FindFiles();
        CSVFileReader reader = new CSVFileReader();
        File[] files = findFiles.FileFilter();
        reader.checkHeader(files);

        //--------------------- test sql ----------------------
        try
        {
            // Connexion à la BDD
            MyConnection myConnection = new MyConnection("crud_flask", "dev", "dev");
            myConnection.Connection();

            //Création de la table compte si elle n'existe pas
            CreateTable table_compte = new CreateTable();
            table_compte.Execute(myConnection.Conn);

            Statement st = myConnection.Conn.createStatement();
            ResultSet rs = st.executeQuery("select * from countries");
            while(rs.next())
            {
                System.out.println(rs.getString("COUNTRY_ID"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}