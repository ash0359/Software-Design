public class Assign1Driver 
{
    public static void main(String[] args)
    {
        Context addContext = new Context(new OperationAdd());
        Context multiplyContext = new Context(new OperationMultiply());
        Context divideContext = new Context(new OperationDivide());
        Context substractContext = new Context(new OperationSubstract());

        //without brackets
        int num1 = multiplyContext.executeStrategy(3, 2);
        int num2 = divideContext.executeStrategy(1, 3);
        num1 = substractContext.executeStrategy(num1, num2);
        num2 = addContext.executeStrategy(num1, 10);

        System.out.println(num2);

        //with brackets
        num1 = addContext.executeStrategy(10,2);
        num2 = substractContext.executeStrategy(3, 1);
        num1 = multiplyContext.executeStrategy(num1, num2);
        num2 = divideContext.executeStrategy(num1,3);

        System.out.println(num2);
    }    
}
