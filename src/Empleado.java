public class Empleado {
    int ID;
    String nom,nacimiento;

    public Empleado(String nom, String nacimiento) {
        this.nom = nom;
        this.nacimiento = nacimiento;
    }

    public int getID() {
        return ID;
    }

    public String getNom() {
        return nom;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }
}
