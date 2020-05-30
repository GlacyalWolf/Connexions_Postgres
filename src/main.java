import org.omg.CORBA.DATA_CONVERSION;

import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Database d = new Database();
        //d.addUser();
        Connection c = d.startDAtabse();
        d.addUser("jerusalen","1999-12-12");
        d.getlistaEmpleados();

        d.borrarEmpleado(1);
        d.modificarNombre(4,"ildefons");
        d.getlistaEmpleados();

        c.close();
    }
}
