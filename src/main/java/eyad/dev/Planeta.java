package eyad.dev;

public class Planeta {
    
    
     String nombre=null;
     int cantSatelites = 0;
     double masakgE24= 0;
     double volumenkm3 =0;
     int diametrokm =0;
     int distanciamediaSol= 0;
     enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO}
     tipoPlaneta tipo;
     boolean observable =false;

     int periodoOrbital=0;
     int rotacion=0;


   


public Planeta(String nombre, int cantSatelites, double masakgE24, double volumenkm3, int diametrokm, int distanciamediaSol,
            tipoPlaneta tipo, boolean observable, int periodoOrbital, int rotacion) {
        this.nombre = nombre;
        this.cantSatelites = cantSatelites;
        this.masakgE24 = masakgE24;
        this.volumenkm3 = volumenkm3;
        this.diametrokm = diametrokm;
        this.distanciamediaSol = distanciamediaSol;
        this.tipo = tipo;
        this.observable = observable;
        this.periodoOrbital = periodoOrbital;
        this.rotacion = rotacion;
    }


void imprimir() {
System.out.println("Nombre del planeta = " + nombre);
System.out.println("Cantidad de satélites = " + cantSatelites);
System.out.println("Masa del planeta = " + masakgE24);
System.out.println("Volumenkm3 del planeta = " + volumenkm3);
System.out.println("Diámetro del planeta = " + diametrokm);
System.out.println("Distancia al sol = " + distanciamediaSol);
System.out.println("Tipo de planeta = " + tipo);
System.out.println("Es observable = " + observable);
System.out.println("Periodo orbital en años = " + observable);
System.out.println("Rotacion en dias = " + observable);
}


double calcularDensidad(){
    return masakgE24/volumenkm3;
}

boolean esExterior(){
    float distance = (float)(149597870 * 3.4);

    if(distanciamediaSol > distance){
        return true;
    }else{
        return false;
    }
}

public static void main(String args[]) {

    
        Planeta planeta1 = new Planeta("planeta1",1,5.97E24,1.00000
        ,12742,149597870,tipoPlaneta.TERRESTRE,true,365,24);
        planeta1.imprimir();
        Planeta planeta2 = new Planeta("planeta2",1,6.0036E24,2.00000
        ,20000,200000000,tipoPlaneta.GASEOSO,false,400,40);
        planeta2.imprimir();

        System.out.println("La densidad del planeta1 es "+planeta1.calcularDensidad());
        System.out.println("La densidad del planeta2 es "+planeta2.calcularDensidad());
        System.out.println("¿el planeta1 es considerado exterior? "+planeta1.esExterior());
        System.out.println("¿el planeta2 es considerado exterior? "+planeta2.esExterior());

}

}
    

