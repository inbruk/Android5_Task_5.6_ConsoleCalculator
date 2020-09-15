/*
 Учебное задание.
 Курс: разработчик Android. Раздел: Java Core,
 Задание: 5.6.* Практика — пишем калькулятор
 Исполнитель: inbruk (Шилов Дмитрий)
 Дата: 08.09.2020
 Группа: Android-5
*/
package lessons.ConsoleCalculator;

import lessons.ConsoleCalculator.SyntaxAnalyzer.State;

public class TextHelper {
    public static void PrintMessageByState(State state) {
        switch(state) {
            case HELP:
                System.out.println("Учебное задание. Курс разработчик Android. Раздел Java Core, Задание 5.6. Практика — пишем калькулятор");
                System.out.println("Калькулятор консольный работает так: ");
                System.out.println("    вводим операнд 1 (число с плавающей точкой)");
                System.out.println("    вводим действие ( +, -, *, / )");
                System.out.println("    вводим операнд 2 (число с плавающей точкой) ");
                System.out.println("калькулятор выдает ответ и перемещает ответ на место первого операнда.");
                System.out.println("Также поддерживаются следующие команды: ");
                System.out.println("    restart - перейти к получению операнда 1 заново, ");
                System.out.println("    help - вывести эту справку, ");
                System.out.println("    quit - покинуть программу ");
                System.out.println("На каждом этапе выводится комментарий, что можно вводить.");
                System.out.println();
                break;
            case OP1:
                System.out.print(" операнд 1 / help / quit => ");
                break;
            case ACTION:
                System.out.print(" действие / restart / help / quit => ");
                break;
            case OP2_CALC:
                System.out.print(" операнд 2 / restart / help / quit => ");
                break;
            case ERROR:
                System.out.println();
                System.out.println(" Произошла ошибка. Пользователь ввел неверные данные. Перезапустите программу. ");
                System.out.println();
                break;
            case QUIT:
                System.out.println();
                System.out.println(" Работа программы завершена. ");
                System.out.println();
                break;
        }
    }
}
