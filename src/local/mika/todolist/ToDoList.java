package local.mika.todolist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {
    private static final List<Task> tasks = new ArrayList<>();

    public static void addTask(Scanner sc) {

        System.out.println("Введи загаловок задачи");
        String setTitle = sc.nextLine();
        System.out.println("Введи суть задачи");
        String setDescription = sc.nextLine();
        System.out.println("Выполнено? (Да/Нет)");
       String taskIsCompleted = sc.nextLine();
        boolean setCompleted = false;
        if (taskIsCompleted.equals("Да")) {
            setCompleted = true;
        }
        Task task = new Task(setTitle, setDescription, setCompleted);
        tasks.add(task);
    }

    public static void removeTask(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                tasks.remove(task);
                System.out.println("Задача " + task + " удалена!");
            }
        }

    }

    public static void displayTasks() {
        System.out.println("Список задач:");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    public static void taskIsCompleted(String title) {
        for (Task task : tasks) {
            if (task.getTitle().equals(title)) {
                task.setCompleted(true);
                System.out.println("Задача выполнена!");
            }

        }
    }

    public static void displayCompletedTasks() {
        System.out.println("Выполненные задачи:");
        for (Task task : tasks) {
            if (task.isCompleted()) {
                System.out.println(task);
            }

        }
    }
}

