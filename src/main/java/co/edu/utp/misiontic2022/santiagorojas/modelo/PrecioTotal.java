package co.edu.utp.misiontic2022.santiagorojas.modelo;

public class PrecioTotal {
    private Double totalComputadores=0.0;
    private Double totalComputadoresPortatiles=0.0;
    private Double totalComputadoresMesa=0.0;
    private Computadores[] listaComputadores;
    
    
    
    public PrecioTotal(Computadores[] listaComputadores) {
        this.listaComputadores = listaComputadores;
    }

    public void mostrarTotales(){
        for (int i = 0; i < listaComputadores.length; i++) {
            if (listaComputadores[i] instanceof Computadores){

                totalComputadores=totalComputadores + listaComputadores[i].calcularPrecio();

            }if (listaComputadores[i] instanceof ComputadoresPortatiles){

                totalComputadoresPortatiles=totalComputadoresPortatiles + listaComputadores[i].calcularPrecio();
                

            } if(listaComputadores[i] instanceof ComputadoresMesa){

                totalComputadoresMesa=totalComputadoresMesa + listaComputadores[i].calcularPrecio();
               
            }
            
        }

    System.out.println("La suma del precio de los computadores es de " + totalComputadores);
    System.out.println("La suma del precio de los computadores de mesa es de "+totalComputadoresMesa);
    System.out.print("La suma del precio de los computadores portátiles es de " + totalComputadoresPortatiles);

    }   
}
