/*
 Учебное задание.
 Курс: разработчик Android. Раздел: Java Core,
 Задание: 5.6.* Практика — пишем калькулятор
 Исполнитель:
 Дата:
 Группа: Android-5
*/
package lessons.ConsoleCalculator.Calculator;

public class Calculator implements ICalculator {
    private float opera1;
    private Action action;

    public void SetOperand1(float op1) {
        opera1 = op1;
    }
    public void SetAction(Action act) {
        action = act;
    }
    public void SetOperand2CalculateAndPrint(float op2) {
        float result;

        switch(action){
            case ADD:
                result = opera1 + op2;
                System.out.println( Float.toString(opera1) + " + " + Float.toString(op2) + " = " + Float.toString(result) );
                opera1 = result;
                break;
            case SUB:
                result = opera1 - op2;
                System.out.println( Float.toString(opera1) + " - " + Float.toString(op2) + " = " + Float.toString(result) );
                opera1 = result;
                break;
            case MUL:
                result = opera1 * op2;
                System.out.println( Float.toString(opera1) + " * " + Float.toString(op2) + " = " + Float.toString(result) );
                opera1 = result;
                break;
            case DIV:
                result = opera1 / op2;
                System.out.println( Float.toString(opera1) + " / " + Float.toString(op2) + " = " + Float.toString(result) );
                opera1 = result;
                break;
        }
    }
}
