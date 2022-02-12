public class Calc {

    static void calc(double numA, double numB, char operation){

        double result = 0.0;
        switch (operation) {
            case ('+'): result = numA + numB;
            break;
            case ('-'): result = numA - numB;
            break;
            case ('*'): result = numA * numB;
            break;
            case ('/'): result = numA / numB;
            break;
            default:
            case ('N'):
                System.out.println("Недопустимая операция");
                break;
               }

//       if(operation == '+'){
//            result = numA + numB;
//        } else if(operation == '-'){
//            result = numA - numB;
//        } else if(operation == '*'){
//            result = numA * numB;
//        } else if(operation == '/'){
//            result = numA / numB;
//        }  else {
//           System.out.println("Указан недопустимый тип операции");
//       }

       System.out.println("Значение: " + result);
    }

    public static void main(String[] args) {
     calc(6, 3, '*');
    }

}
