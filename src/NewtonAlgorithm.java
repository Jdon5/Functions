public class NewtonAlgorithm {


    //iterativ
    public double findRoot(Function function,double x,int iteration){
        for(int i=0; i<iteration;i++) {
            double derivative = function.calculateDerivative(x);
            double value = function.calculateValue(x);
            x = x-(value/derivative);
        }
        return x;
    }

    public double findRoot2(Function function,double x,int iteration){
        double derivative = function.calculateDerivative(x);
            double value = function.calculateValue(x);
        if(iteration<=1){
            x = x-(value/derivative);
            return x;
        } else {
            //Rekursion
            return findRoot2(function, x-(value/derivative), iteration-1);
        }
    }
}