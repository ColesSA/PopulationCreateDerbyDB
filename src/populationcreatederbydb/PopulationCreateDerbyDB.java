package populationcreatederbydb;

import java.sql.*;

public class PopulationCreateDerbyDB {

    public static void main(String[] args) {
        String dbProtocol = "jdbc:derby:";
        String dbDirectory = "e:/Bus Prgrm concpt/Projects/PopulationCreateDerbyDB/";
        String dbName = "PopulationDB2";
        String dbExtra = ";create=true";
        String userName = "Admin";
        String password = "MuCis";
        String connectionCreateURL = dbProtocol + dbDirectory + dbName + dbExtra;
        String shutDownURL = dbProtocol + ";shutdown = true";
        String createStatement = "CREATE TABLE Population "
                + "(TownNumber INTEGER PRIMARY KEY, "
                + "TownName VARCHAR(20), "
                + "CountyNumber INTEGER, "
                + "RegionNumber INTEGER, "
                + "Population INTEGER)";
        try {
            Connection connection1 = DriverManager.getConnection(connectionCreateURL, userName, password);
            Statement statement1 = connection1.createStatement();
            statement1.execute(createStatement);
            DriverManager.getConnection(shutDownURL);
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }

}
