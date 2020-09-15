/*
 Учебное задание.
 Курс: разработчик Android. Раздел: Java Core,
 Задание: 5.6.* Практика — пишем калькулятор
 Исполнитель: inbruk (Шилов Дмитрий)
 Дата: 08.09.2020
 Группа: Android-5
*/
package lessons.ConsoleCalculator.Calculator;

public interface ICalculator {
    void SetOperand1(float op1);
    void SetAction(Action act);
    void SetOperand2CalculateAndPrint(float op2);
}
