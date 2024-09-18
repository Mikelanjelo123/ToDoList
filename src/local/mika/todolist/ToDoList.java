package local.mika.todolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    private static final List<Task> TASKS = new ArrayList<>();

    public static void addTask(Scanner sc) {

        System.out.println("Введи загаловок задачи");
        String setTitle = sc.nextLine();
        System.out.println("Введи суть задачи");
        String setDescription = sc.nextLine();
        System.out.println("Выполнено? (Да/Нет)");
        String taskIsCompleted = sc.nextLine().toLowerCase();
        boolean setCompleted = false;
        if (taskIsCompleted.equals("да")) {
            setCompleted = true;
        }
        Task task = new Task(setTitle, setDescription, setCompleted);
        TASKS.add(task);
    }

    public static void removeTask(Scanner sc) {
        System.out.println("Введите название задачи: ");
        String title = sc.nextLine();
        for (Task task : TASKS) {
            if (task.getTitle().equals(title)) {
                TASKS.remove(task);
                System.out.println("Задача " + task + " удалена!");
                return;
            }
        }
        System.out.println("Такой задачи нет");

    }

    public static void displayTasks() {
        System.out.println("Список задач:");
        if (TASKS.isEmpty()) {
            System.out.println("Задач нет!");
            return;
        }
        for (Task task : TASKS) {
            System.out.println(task);
        }
    }

    public static void taskIsCompleted(Scanner sc) {
        System.out.println("Введите название задачи: ");
        String title = sc.nextLine();
        for (Task task : TASKS) {
            if (task.getTitle().equals(title)) {
                task.setCompleted(true);
                System.out.println("Задача" + task + " выполнена!");
                return;
            }
        }
        System.out.println("Такой задачи нет");
    }

    public static void displayCompletedTasks() {
        if (TASKS.isEmpty()) {
            System.out.println("Выполненных задач нет!");
            return;
        }
        System.out.println("Выполненные задачи: ");

        for (Task task : TASKS) {
            if (task.isCompleted()) {
                System.out.println(task);
            }

        }
    }
}

