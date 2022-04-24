
public class Task04 {
    public static void Method(int a) throws LessThan1Exception,GreaterThan1Exception,Equals0Exception{
        if(a<0){
            throw new LessThan1Exception("The number Is Less Than 0");
        }
        else if (a>1){
            throw new GreaterThan1Exception("The number Is Greater Than 1");
        }
        else if(a==0){
            throw new Equals0Exception("The number Is equal To 0");
        }
    }
    public static  void main(String[]args) throws GreaterThan1Exception, LessThan1Exception, Equals0Exception {
        try {
            // Trying the greater than 1 ex
//        Method(5);
            // Trying the Less than 1 ex
//        Method(-1);
            // trying the Equals to zero
            Method(0);
        }
        catch (GreaterThan1Exception | Equals0Exception |LessThan1Exception e ){
            System.out.println(e);
        }

    }

}
