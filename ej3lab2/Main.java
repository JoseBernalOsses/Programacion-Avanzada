
public class Main {
    public static void main(String[] args){
        int prom;
        int tempe1 =35+ (int) (Math.random() * ((40-35)+1));
        int tempe2=35+ (int) (Math.random() * ((40-35)+1));
        Termometro term;
        term = new Termometro(0 , 0);
        term.setTemp1(tempe1);
        term.setTemp2(tempe2);
        prom=(term.getTemp1()+term.getTemp2())/2;
        System.out.println("La primera temperatura que obtuvo Juanito fue "+ term.getTemp1()+", la segunda fue "+ term.getTemp2()+", por lo que la temperatura final sería de "+prom);
        }
    }
