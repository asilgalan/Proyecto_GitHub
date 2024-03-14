public  abstract class Empresa {

    protected  static final  int Plus=300;
    protected String nombre;
    protected  int edad;
    protected double salario;

    public Empresa(String nombre, int edad, double salario){
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public String MostrarDatos() {

        return "Nombre:"+getNombre()+"\nEdad:"+getEdad()+"\nSalario:"+getSalario();
    }
    public abstract double Plus();
}

