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
import lessons.ConsoleCalculator.SyntaxAnalyzer.Command;
import lessons.ConsoleCalculator.SyntaxAnalyzer.Symbol;
import java.util.Scanner;

public class LexicalAnalyzer {
    private static Scanner scan = new Scanner(System.in);

    public static Symbol GetFromConsoleInputString() {
        Command currCmd;
        Action currAct = Action.ADD;
        float currValue = 0.0f;

        String inpStr =  scan.nextLine();

        if( inpStr!=null ) {
            switch (inpStr) {
                case "restart":
                    currCmd = Command.RESTART;
                    break;
                case "help":
                    currCmd = Command.HELP;
                    break;
                case "quit":
                    currCmd = Command.QUIT;
                    break;
                case "+":
                    currCmd = Command.ACTION;
                    currAct = Action.ADD;
                    break;
                case "-":
                    currCmd = Command.ACTION;
                    currAct = Action.SUB;
                    break;
                case "*":
                    currCmd = Command.ACTION;
                    currAct = Action.MUL;
                    break;
                case "/":
                    currCmd = Command.ACTION;
                    currAct = Action.DIV;
                    break;
                default:
                    try {
                        currValue = Float.parseFloat(inpStr);
                        currCmd = Command.VALUE;
                    }
                    catch (Exception e) {
                        currCmd = Command.ERROR;
                    }
            }
        } else {
            currCmd = Command.ERROR;
        }

        return new Symbol( currCmd, currValue, currAct );
    }
}
