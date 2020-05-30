import java.sql.*;
import java.util.ArrayList;

public class Database {
    public Connection startDAtabse() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/pruebas","postgres","postgres");



    }

    public void addUser(String nombre,String fecha) throws SQLException, ClassNotFoundException {
        Connection c = startDAtabse();
        Statement stmt= c.createStatement();
        String insert= "insert into cliente values(default,'"+nombre+"','"+fecha+"');";
        stmt.executeUpdate(insert);
        c.close();
    }


    public void getlistaEmpleados() throws SQLException, ClassNotFoundException {
        ResultSet rs = null;
        ArrayList<Empleado> le = new ArrayList<>();
        Connection c =startDAtabse();
        Statement stmt= c.createStatement();
        String select="select * from cliente;";
        rs=stmt.executeQuery(select);
        while (rs.next()){
            System.out.print(rs.getInt("id")+"\t");
            System.out.print(rs.getString("nombre")+"\t");
            System.out.println(rs.getDate("edad"));

        }



    }

    public void borrarEmpleado(int id) throws SQLException, ClassNotFoundException {
        Connection c = startDAtabse();
        Statement stmt = c.createStatement();
        String delete="delete from cliente where id="+id+";";
        stmt.executeUpdate(delete);
        c.close();

    }

    public void modificarNombre(int id,String nombre) throws SQLException, ClassNotFoundException {
        Connection c = startDAtabse();
        Statement stmt = c.createStatement();
        String update="update cliente set nombre='"+nombre+"' where id="+id+";";
        stmt.executeUpdate(update);
        c.close();

    }

    public void clean() throws SQLException, ClassNotFoundException {
        Connection c = startDAtabse();
        Statement stmt= c.createStatement();
        String update = "delete * from cliente";
        stmt.executeUpdate(update);
        c.close();


    }





}
