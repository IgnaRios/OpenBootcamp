public class Main {

    //PRIMER PARTE
    static void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {

        sum(5,10,20);

        Coche miCoche = new Coche();

        miCoche.agregarPuertas();

        System.out.println(miCoche.puertas);
    }
}
//SEGUNDA PARTE
class Coche{
    public int puertas = 0;

    public void agregarPuertas (){
        this.puertas++;
    }

}
