public  class  Repartidor extends  Empresa{
    String zona;
    public Repartidor(String nombre,int edad,double salario,String zona){
        super(nombre,edad,salario);
        this.zona=zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
    double salariopl;


    @Override
    public double Plus() {
        if (getEdad()<25 && getZona().toLowerCase()=="zona3"){
            salariopl=+Plus;
        }
        return salariopl;
    }

    @Override
    public String MostrarDatos() {
        return super.MostrarDatos()+"\nZona: "+getZona();
    }
}

