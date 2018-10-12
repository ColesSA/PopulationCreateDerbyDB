package populationcreatederbydb;

import java.sql.*;

public class PopulationCreateDerbyDB {

    public static void main(String[] args) {
        // Java Database Connectivity in contrast to ODBC.
        // Database program, but not a management system. (RDBMS)
        String dbProtocol = "jdbc:derby:";
        String dbDirectory = "C:/Users/55colessa31/Documents/GitHub/PopulationCreateDerbyDB/";
        String dbName = "PopulationDB"; // Database Name.
        String dbExtra = ";create=true"; // Create the database schema.
        String userName = "Admin";
        String password = "MuCis";
        String connectionCreateURL = dbProtocol + dbDirectory + dbName + dbExtra;
        String shutDownURL = dbProtocol + ";shutdown = true";
        String createTable = "CREATE TABLE Population "
                + "(TownNumber INTEGER PRIMARY KEY, "
                + "TownName VARCHAR(20), "
                + "CountyNumber INTEGER, "
                + "RegionNumber INTEGER, "
                + "Population INTEGER)";
        
        try {
            Connection connection1 = DriverManager.getConnection(connectionCreateURL, userName, password);
            Statement statement1 = connection1.createStatement();
            statement1.execute(createTable);
            DriverManager.getConnection(shutDownURL);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

}
