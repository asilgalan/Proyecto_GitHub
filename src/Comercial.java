public  class Comercial  extends  Empresa{

    double comision;

    public Comercial(String nombre,int edad,double salario, double comision){
        super(nombre,edad,salario);
        this.comision=comision;

    }

    public double getComision() {

        return comision;
    }

    public void setComision(double comision) {

        this.comision = comision;
    }
    double salarioplus;
    @Override
    public double Plus() {
        if (getEdad() > 30 && getComision() > 200) {
            salarioplus=+Plus;
        }

        return salarioplus;
    }
    @Override
    public String MostrarDatos() {

        return super.MostrarDatos()+"\nComision:"+getComision();
    }
}
