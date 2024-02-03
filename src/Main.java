//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //declare variables and setting values

        int intOperandA = 2;

        int intOperandB = 2;

        int intSum;

        int intProduct;

        int intDifference;

        int intQuotient;

        int intModulo;

        double doubleOperandA = 2.5;

        double doubleOperandB = 2.5;

        double doubleSum;

        double doubleProduct;

        double doubleDifference;

        double doubleQuotient;

        // Assigning every variable that is not intOperandA, intOperandB, doubleOperandA and doubleOperandB a value

        intSum = intOperandA + intOperandB;

        intProduct = intOperandA * intOperandB;

        intDifference = intOperandA - intOperandB;

        intQuotient = intOperandB / intOperandA;

        intModulo = intOperandA % intOperandB;

        doubleSum = doubleOperandA + doubleOperandB;

        doubleProduct = doubleOperandA * doubleOperandB;

        doubleDifference = doubleOperandA - doubleOperandB;

        doubleQuotient = doubleOperandA / doubleOperandB;

        // Outputting the assigned values to each variable in a clear sentence

        System.out.println("The sum of " + intOperandA + " and " + intOperandB + " is " + intSum); // Outputting intSum

        System.out.println("The product of " + intOperandA + " and " + intOperandB + " is " + intProduct); // Outputting intProduct

        System.out.println("The difference of " + intOperandA + " and " + intOperandB + " is " + intDifference); // Outputting intDifference

        System.out.println("The quotient of " + intOperandA + " and " + intOperandB + " is " + intQuotient); // Outputting intQuotient

        System.out.println("The modulo of " + intOperandA + " and " + intOperandB + " is " + intModulo); // Outputting intModulo

        System.out.println("The sum of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum); // Outputting doubleSum

        System.out.println("The product of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct); // Outputting doubleProduct

        System.out.println("The difference of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference); // Outputting doubleDifference

        System.out.println("The quotient of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient); // Outputting doubleQuotient
    }
}