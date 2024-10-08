package local.mika.todolist;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true; // флаг для продолжения работы программы

        while (running) { // цикл будет повторяться, пока running == true

            System.out.print(
                    "1: Создать задачу\n" +
                            "2: Удалить задачу\n" +
                            "3: Отображение всех задач с их статусом \n" +
                            "4: пометить задачу как выполненную\n" +
                            "5: отобразить выполненные задачи \n" +
                            "6: Выйти\n" +
                            "укажите пункт меню: ");

            String input = sc.nextLine();

            switch (input) {
                case "1" -> ToDoList.addTask(sc);
                case "2" -> ToDoList.removeTask(sc);
                case "3" -> ToDoList.displayTasks();
                case "4" -> ToDoList.taskIsCompleted(sc);
                case "5" -> ToDoList.displayCompletedTasks();
                case "6" -> {
                    running = false;
                    System.out.println("Выход из программы.");
                }
                default -> System.out.println("Неверный ввод. Попробуйте снова.");
            }

        }
        sc.close();
    }
}
