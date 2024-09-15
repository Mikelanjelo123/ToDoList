package local.mika.todolist;




public class Task {
    private String title;
    private String description;
    private boolean isCompleted;

    public Task(String title,  String description, boolean isCompleted) {
        this.title = title;
        this.isCompleted = isCompleted;
        this.description = description;
        System.out.println("Задача с названием: " + title + " описанием: " + description + " и статусом выполнения: " + isCompleted + " успешно создана!");
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", isCompleted=" + isCompleted +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCompleted(boolean completed) {
        isCompleted = completed;
    }
}
