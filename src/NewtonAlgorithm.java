public class NewtonAlgorithm {


    //iterativ
    public double findRoot(Function function,double x,int iteration){

        double xNew = x;

        for(int i=0; i<iteration;i++) {
            double derivative = function.calculateDerivative(xNew);
            double value = function.calculateValue(xNew);
            xNew = xNew-(value/derivative);
        }
        return xNew;
    }

}