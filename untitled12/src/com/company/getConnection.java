package com.company;

import java.sql.*;

public class getConnection {
    private String url = "jdbc:mysql://localhost/pracownicy?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private String username = "root";
    private  String password = "si96o3mj";


    public getConnection(){

    }

    public void zapytanie(String zapytanie){
        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
            try(Statement statement = connection.createStatement()){
                System.out.println("statement created!");

                    statement.executeUpdate(zapytanie);
            }

            finally {
                connection.close();
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

    }

    public void wyswietl(String select){
        System.out.println("Connecting database...");

        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Database connected!");
            try(Statement statement = connection.createStatement()){
                System.out.println("statement created!");
                try(ResultSet rs = statement.executeQuery(select)){

                    ResultSetMetaData rsmd = rs.getMetaData();
                    int columnsNumber = rsmd.getColumnCount();

                    while (rs.next()) {
                        for(int i = 1; i <= columnsNumber; i++)
                            System.out.print(rs.getString(i) + " ");
                        System.out.println();
                    }

                }
                finally {
                    statement.close();
                }
            }

            finally {
                connection.close();
            }
        } catch (SQLException e) {
            throw new IllegalStateException("Cannot connect the database!", e);
        }

    }


}


