public class Main {
    public static void main(String[] args) {

        Repartidor repartidor=new Repartidor("asil",21,1500,"zona3");
        Comercial comercial=new Comercial("Nelson",31,1500,250);

        System.out.println(comercial.MostrarDatos());
        System.out.println("");
        System.out.println(repartidor.MostrarDatos());
        System.out.println("El comerciante tiene un plus: "+comercial.Plus()+"\n" +
                "y un sueldo total de:"+(comercial.comision+ comercial.Plus()+comercial.getSalario()));
        System.out.println("El repartidor tiene un plus de: "+repartidor.Plus()+"\n" +
                "y un sueldo total de: "+(repartidor.Plus()+repartidor.getSalario()));
    }
}
