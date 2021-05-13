package src.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDefault {
    private final String DB="fNNf8cNND2";
    private final String URL="jdbc:mysql://remotemysql.com:3306/"+DB+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";;
    private final String USER="fNNf8cNND2";
    private final String PASS="4VrlU6xik2";

    public Connection openConnection() {

        Connection connect = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connect=(Connection) DriverManager.getConnection(URL,USER,PASS);

            if(connect!=null){

            }else{

            }

        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("error "+ex.getMessage());
        }

        return connect;
    }

    public void closeConnection(Connection connect){
        try {
            connect.close();
            System.out.println("Conexión Cerrada Exitosamente");
        } catch (SQLException ex) {
            Logger.getLogger(ConexionDefault.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
