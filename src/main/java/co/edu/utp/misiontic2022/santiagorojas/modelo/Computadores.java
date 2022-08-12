package co.edu.utp.misiontic2022.santiagorojas.modelo;

public class Computadores {

    protected final static Integer PESO_BASE=5;
    protected final static Double PRECIO_BASE=100.0;
    protected final static char CONSUMO_W='F';

    protected double precioBase;
    protected char consumoW;
    protected Integer peso;


    
    public Computadores() {
        this.precioBase=PRECIO_BASE;
        this.consumoW=CONSUMO_W;
        this.peso=PESO_BASE;
        
    }


    public Computadores(Double precioBase,Integer peso) {
        this.precioBase=precioBase;
        this.peso=peso;
        this.consumoW=CONSUMO_W;
    }
    

    public Computadores(Double precioBase,  Integer peso,Character consumoW) {
        this.precioBase = precioBase;
        this.consumoW = consumoW;
        this.peso = peso;
    }


    public Double calcularPrecio(){
        Double adicion=0.0;
        switch(consumoW){
            case 'A':
                adicion=adicion+100;
                break;
            case 'B':
                adicion=adicion+80;
                break;
            case 'C':
                adicion=adicion+60;
                break;
            case 'D':
                adicion=adicion+50;
                break;
            case 'E':
                adicion=adicion+30;
                break;
            case 'F':
                adicion=adicion+10;
                break;
           
        }

        if (peso>=0 & peso<19) {
            adicion=adicion+10;
            
        } else if(peso>=20 & peso<49) {
            adicion=adicion+50;
            
        }else if(peso>=50 & peso<79) {
            adicion=adicion+80;
            
        }else if(peso>=80 ) {
            adicion=adicion+100;  
        }
        return (precioBase+ adicion);
    }


    public Double getPrecioBase() {
        return precioBase;
    }

    public char getConsumoW() {
        return consumoW;
    }

    public Integer getPeso() {
        return peso;
    }
    
}
