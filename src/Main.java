public class Main {

    public static void main(String[] args) {

        double[] x= {-4,4,0,0.5};
        Polynom polynom = new Polynom(x);

        NewtonAlgorithm newton = new NewtonAlgorithm();

        double value = polynom.calculateValue(-1);
        double derivative = polynom.calculateDerivative(-1);
        System.out.println(polynom);
        System.out.println(value);
        System.out.println(derivative);
        double n = newton.findRoot(polynom,-1,5);
        System.out.println(n);


    
    }
}