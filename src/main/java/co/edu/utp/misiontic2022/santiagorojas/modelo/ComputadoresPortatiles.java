package co.edu.utp.misiontic2022.santiagorojas.modelo;

public class ComputadoresPortatiles extends Computadores{
   
    private  final static Integer PULGADAS_BASE = 20;
    private Integer pulgadas;
    private boolean camaraITG;

    public ComputadoresPortatiles(){
        super(PRECIO_BASE, PESO_BASE, CONSUMO_W);
        this.pulgadas=PULGADAS_BASE;
        camaraITG=false;

    }

    public ComputadoresPortatiles(Double precioBase, Integer peso) {
        super(precioBase, peso);
       
        this.pulgadas=PULGADAS_BASE;
        camaraITG=false;
        
    }


    public ComputadoresPortatiles(Double precioBase, Integer peso, char consumoW, Integer pulgadas,boolean camaraITG) {
        super(precioBase, peso,consumoW);
        this.pulgadas=pulgadas;
        this.camaraITG=camaraITG;

    }
    public Double calcularPrecio(){
        Double adicion=super.calcularPrecio();
        if (pulgadas>40){
            adicion=adicion+precioBase*0.3;
        }
        if (camaraITG==true){
            adicion=adicion+50.0;
        }
        return adicion;
    }
}
