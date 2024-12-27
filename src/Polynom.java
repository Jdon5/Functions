public class Polynom implements Function{

    double[] factors; 

    public Polynom(double[] factors){
        this.factors = factors;
    }

    // Berechnung des Funktionswerts von p(x) an der Stelle x
    @Override 
    public double calculateValue(double x) {
        double value =0;
        for(int i=0; i<factors.length; i++){
            value += factors[i]*Math.pow(x, i);
        }
        return value;
    }
    
    // Berechnung des Funktionswerts von p'(x) an der Stelle x
    @Override
    public double calculateDerivative(double x) {
        double derivative =0;
        for(int i=0; i<factors.length; i++){
            derivative += i*factors[i]*Math.pow(x, i-1);
        }
        return derivative;
    }

    @Override
    public String toString() { 
        String polynom = "";
        for(int i=0; i<factors.length; i++) {
            polynom += "+"+factors[i]+"*x^"+i;
        }
        String derivative ="";
        for(int i=0; i<factors.length; i++) {
            derivative += "+"+i+"*"+factors[i]+"*x^("+i+"-1)";
        }
        return "p(x) = "+polynom+"\np'(x)= "+derivative;
    }

    public static void main(String[] args) {

        double[] factors = {6,-5,1};
        Polynom polynom = new Polynom(factors);

        double value = polynom.calculateValue(2);
        double derivative = polynom.calculateDerivative(2);

        System.out.println(polynom);
        System.out.println(value);
        System.out.println(derivative);

    }
}
