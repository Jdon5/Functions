public class Main {

    public static void main(String[] args) {

        double[] x= {-4,4,0,0.5}; //Initialierung des Arrays mit den Koeffizienten des Polynoms 
        Polynom polynom = new Polynom(x); 

        NewtonAlgorithm newton = new NewtonAlgorithm();

        double value = polynom.calculateValue(-1); // Berechnung des Funktionswertes an der Stelle x
        double derivative = polynom.calculateDerivative(-1); // Berechnung des Funktionswertes des abgeleitenes Polynoms an der Stelle x
        double newton1 = newton.findRoot(polynom,-1,2); //Berechnung der Nst mit dem Newton Algortihmus iterativ
        double newton2 = newton.findRoot2(polynom, newton1, 2); //Berechnung der Nst mit dem Newton Algortihmus iterativ

        System.out.println(polynom); // Ausgabe des Polynoms
        System.out.println(value); // Ausgabe des Funktionswerts der Funktion
        System.out.println(derivative);  // Ausgabe des Funktionswerts der abgeleitenen Funktion
        System.out.println(newton1);// Ausgabe der NST mit dem iterativen Newton Algortihmus
        System.out.println(newton2); // Ausgabe der NST mit dem rekursiven Newton Algortihmus

        

        


    
    }
}