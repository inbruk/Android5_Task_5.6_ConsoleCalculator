/*
 Учебное задание.
 Курс: разработчик Android. Раздел: Java Core,
 Задание: 5.6.* Практика — пишем калькулятор
 Исполнитель: inbruk (Шилов Дмитрий)
 Дата: 08.09.2020
 Группа: Android-5
*/
package lessons.ConsoleCalculator.SyntaxAnalyzer;

import lessons.ConsoleCalculator.Calculator.Action;

public class Symbol {

    private Command command;
    public Command getCommand() { return command; }

    private float value;
    public  float getValue() { return value; }

    private Action action;
    public Action getAction() { return action; }

    public Symbol(Command cmd, float val, Action act ){
        command = cmd;
        value = val;
        action = act;
    }
}
