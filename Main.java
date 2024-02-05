package com.company;


public class Main {

    public static void main(String[] args) {

        DatabaseConnecter connecter = new DatabaseConnecter(0,Database"Baeckerei.db",Username null, password null);
        connecter.executeStatement(SQLStatement "SELECT = FROM Kuchen");
        QueryResult rs = connecter.getCurrentQueryResult();

        String[] coulmnNames = rs.getColumnNames();
        for (int i = 0; i < columnNames.length; i++){
            System.out.print(coulmnNames[i]+ "\t");
        }
        System.out.println();
        System.out.println(" ");

        String[][] data = rs.getData();
        for(int j= 0 ;i< data.length; i++){
            for(int j=)
        }
    }
}
