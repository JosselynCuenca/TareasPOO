
package Herencia;

public class Departamento extends Casa {
    //Atributos
    private int n_Cuartos;
    
    //Costructor
    public Departamento (double area, double precio, int n_Cuartos){
        super(area,precio);
        this.n_Cuartos = n_Cuartos;
    }
    public void mostrarDatos(){
        System.out.println("El area es: "+getArea());
        System.out.println("El preci es: "+getPrecio());
        System.out.println("El numero de Cuartos es: "+n_Cuartos);
    }
}
