/*
 Учебное задание.
 Курс: разработчик Android. Раздел: Java Core,
 Задание: 5.6.* Практика — пишем калькулятор
 Исполнитель: inbruk (Шилов Дмитрий)
 Дата: 08.09.2020
 Группа: Android-5
*/
package lessons.ConsoleCalculator;

import lessons.ConsoleCalculator.Calculator.Action;
import lessons.ConsoleCalculator.SyntaxAnalyzer.State;
import lessons.ConsoleCalculator.SyntaxAnalyzer.Symbol;
import lessons.ConsoleCalculator.SyntaxAnalyzer.SyntaxAnalyzerStateMachine;

import lessons.ConsoleCalculator.SyntaxAnalyzer.*;

public class Main {
    public static void main(String[] args) {
	    while ( true ) {
            State currState = SyntaxAnalyzerStateMachine.getState();
            TextHelper.PrintMessageByState(currState);

            if( currState==State.QUIT || currState==State.ERROR  )
                break;

            Symbol currSym;
            if( currState!=State.HELP ) {
                currSym = LexicalAnalyzer.GetFromConsoleInputString();
            } else {
               currSym = new Symbol( Command.HELP,0.0f, Action.ADD);
            }
            SyntaxAnalyzerStateMachine.Process( currSym );

        }
    }
}
