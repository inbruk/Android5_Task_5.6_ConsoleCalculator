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
import lessons.ConsoleCalculator.Calculator.Calculator;

import lessons.ConsoleCalculator.Calculator.*;

public class SyntaxAnalyzerStateMachine {

    private static State state = State.HELP;
    public static State getState() {
        return state;
    }

    private static Calculator calc = new Calculator();

    public static void Process(Symbol sym) {
        Command symbolCommand = sym.getCommand();

        switch(state) {
            case OP1:
                switch(symbolCommand) {
                    case VALUE:
                        float value = sym.getValue();
                        calc.SetOperand1( value );
                        state = State.ACTION;
                        break;
                    case HELP:
                        state = State.HELP;
                        break;
                    case QUIT:
                        state = State.QUIT;
                        break;
                    default:
                        state = State.ERROR;
                        break;
                }
                break;
            case ACTION:
                switch(symbolCommand) {
                    case ACTION:
                        Action act = sym.getAction();
                        calc.SetAction(act);
                        state = State.OP2_CALC;
                        break;
                    case RESTART:
                        state = State.OP1;
                        break;
                    case HELP:
                        state = State.HELP;
                        break;
                    case QUIT:
                        state = State.QUIT;
                        break;
                    default:
                        state = State.ERROR;
                        break;
                }
                break;
            case OP2_CALC:
                switch(symbolCommand) {
                    case VALUE:
                        float value = sym.getValue();
                        calc.SetOperand2CalculateAndPrint( value );
                        state = State.ACTION;
                        break;
                    case RESTART:
                        state = State.OP1;
                        break;
                    case HELP:
                        state = State.HELP;
                        break;
                    case QUIT:
                        state = State.QUIT;
                        break;
                    default:
                        state = State.ERROR;
                        break;
                }
                break;
            case HELP:
                state = State.OP1;
                break;
            default: // ERROR, QUIT
                break;
        }
    }
}
