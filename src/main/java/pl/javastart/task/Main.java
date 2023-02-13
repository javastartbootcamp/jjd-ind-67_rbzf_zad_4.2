package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Anna", "Sadkowska");
        Person person2 = new Person("Laszlo", "Varhalmi");
        Task task1 = new Task("sprzatanie", "gruntowne sprzatanie wiosenne", -1, person1);
        Task task2 = new Task("gotowanie", "ma byc smaczne", 1, person2);
        Task task3 = new Task("porzadki w ogrodzie", "przycinanie drzewek", 0, person2);

        System.out.println("Czy zadanie " + task1.getName() + " ma priorytet wysoki? " + task1.highPriority());
        System.out.println("Czy zadanie " + task2.getName() + " ma priorytet wysoki? " + task2.highPriority());
        System.out.println("Czy zadanie " + task3.getName() + " ma priorytet niski? " + task3.lowPriority());

    }
}
