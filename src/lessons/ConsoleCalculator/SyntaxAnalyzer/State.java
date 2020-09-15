/*
 Учебное задание.
 Курс: разработчик Android. Раздел: Java Core,
 Задание: 5.6.* Практика — пишем калькулятор
 Исполнитель: inbruk (Шилов Дмитрий)
 Дата: 08.09.2020
 Группа: Android-5
*/
package lessons.ConsoleCalculator.SyntaxAnalyzer;

public enum State {
    OP1,
    ACTION,
    OP2_CALC,
    HELP,
    ERROR,
    QUIT
}
