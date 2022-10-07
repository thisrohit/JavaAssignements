package JavaApp.LambdaExpression;

@FunctionalInterface
interface MyLambda {
    void Display();
}

//@FunctionalInterface
interface MyLambdaAdd {
    int addition(int a, int b);
}

@FunctionalInterface
interface MyLambdaMultiply {
    int multiply(int a, int b);
}


public class MainClassLambdaExpression {
    public static void main(String[] args) {
        MyLambda my = new MyLambda() {
            @Override
            public void Display() {
                System.out.println("Hello, I am implementing the interface");
            }
        };
        //        this can be simplified using the lambda expression
        //     one liner implementation
        MyLambda my2 = ()->{System.out.println("Hello Lambda expression implementation");};

        MyLambdaAdd m = (a,b)-> a+b;
        MyLambdaMultiply mp = (a,b)-> a*b;

        int res = m.addition(2,4);
        System.out.println(res);
        res = mp.multiply(10,28);
        System.out.println(res);
    }
}
