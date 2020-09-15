/*
 Учебное задание.
 Курс: разработчик Android. Раздел: Java Core,
 Задание: 5.6 Практика — пишем калькулятор
 Исполнитель: Gurf ( Устюжинский Геннадий Маркович )
 Дата: 15.09.2020
 Группа: Android-5
*/
package lessons.ConsoleCalculator.Calculator;

public class Calculator implements ICalculator {

    private float firstOperand;
    public void SetOperand1(float a) {
        firstOperand = a;

    }

    private Action operator;
    public void SetAction(Action arifmOperator) {
        operator = arifmOperator;

    }

    public void SetOperand2CalculateAndPrint(float b) {
        float itog = b;
        switch (operator) {

            case ADD:
                itog = firstOperand + itog;
                break;

            case SUB:
                itog = firstOperand - itog;
                break;

            case MUL:
                itog = firstOperand * itog;
                break;

            case DIV:
                itog = firstOperand / itog;
                break;
        }
        System.out.println("Ответ: " + itog);
		firstOperand = itog;
    }
}
