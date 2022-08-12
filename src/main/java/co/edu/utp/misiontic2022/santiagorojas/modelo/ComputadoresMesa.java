package co.edu.utp.misiontic2022.santiagorojas.modelo;

public class ComputadoresMesa extends Computadores {
    private final static Integer ALMACENAMINETO_BASE=50;
    private Integer almacenamiento;
    
    
    public ComputadoresMesa(){
        this.peso=PESO_BASE;
        this.precioBase=PRECIO_BASE;
        this.consumoW=CONSUMO_W;
        this.almacenamiento=ALMACENAMINETO_BASE;
    }



    public ComputadoresMesa(Double precioBase, Integer peso) {
        super(precioBase, peso);
        this.almacenamiento=ALMACENAMINETO_BASE;
        
    }
    
    
    public ComputadoresMesa(Double precioBase, Integer peso, char consumoW, Integer almacenamiento) {
        super(precioBase, peso, consumoW);
        this.almacenamiento=almacenamiento;
    
    }
    
    public Double calcularPrecio(){
        Double adicion=super.calcularPrecio();
        if(almacenamiento>100){
            adicion=adicion+50.0;
        }
        return adicion;
    }

    public Integer getCarga(){
        return almacenamiento;
    }
}
