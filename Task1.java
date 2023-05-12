import java.util.ArrayList;
import java.util.HashMap;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> phoneBook = new HashMap<>();

        // Добавление номеров телефонов сотрудников
        addPhoneNumber(phoneBook, "Иван Иванов", "123456789");
        addPhoneNumber(phoneBook, "Светлана Петрова", "987654321");
        addPhoneNumber(phoneBook, "Кристина Белова", "567891234");
        addPhoneNumber(phoneBook, "Анна Мусина", "987123456");
        addPhoneNumber(phoneBook, "Анна Крутова", "456789123");
        addPhoneNumber(phoneBook, "Иван Юрин", "321654987");
        addPhoneNumber(phoneBook, "Петр Лыков", "789123456");
        addPhoneNumber(phoneBook, "Павел Чернов", "654987321");
        addPhoneNumber(phoneBook, "Петр Чернышов", "123789456");
        addPhoneNumber(phoneBook, "Мария Федорова", "987654123");
        addPhoneNumber(phoneBook, "Марина Светлова", "456123789");
        addPhoneNumber(phoneBook, "Мария Савина", "321987654");
        addPhoneNumber(phoneBook, "Мария Рыкова", "654321987");
        addPhoneNumber(phoneBook, "Марина Лугова", "789456123");
        addPhoneNumber(phoneBook, "Анна Владимирова", "123789654");
        addPhoneNumber(phoneBook, "Иван Мечников", "987321654");
        addPhoneNumber(phoneBook, "Петр Петин", "456789123");
        addPhoneNumber(phoneBook, "Иван Ежов", "321456789");

        // Поиск повторяющихся имен с количеством повторений
        HashMap<String, Integer> nameOccurrences = findNameOccurrences(phoneBook);

        // Сортировка по убыванию популярности
        ArrayList<String> sortedNames = sortNamesByPopularity(nameOccurrences);

        // Вывод результатов
        for (String name : sortedNames) {
            System.out.println(name + ": " + nameOccurrences.get(name) + " повторений");
        }
    }

    public static void addPhoneNumber(HashMap<String, ArrayList<String>> phoneBook, String name, String phoneNumber) {
        if (phoneBook.containsKey(name)) {
            ArrayList<String> numbers = phoneBook.get(name);
            numbers.add(phoneNumber);
        } else {
            ArrayList<String> numbers = new ArrayList<>();
            numbers.add(phoneNumber);
            phoneBook.put(name, numbers);
        }
    }

    public static HashMap<String, Integer> findNameOccurrences(HashMap<String, ArrayList<String>> phoneBook) {
        HashMap<String, Integer> nameOccurrences = new HashMap<>();
        for (String name : phoneBook.keySet()) {
            int occurrences = phoneBook.get(name).size();
            nameOccurrences.put(name, occurrences);
        }
        return nameOccurrences;
    }

    public static ArrayList<String> sortNamesByPopularity(HashMap<String, Integer> nameOccurrences) {
        ArrayList<String> sortedNames = new ArrayList<>(nameOccurrences.keySet());
        sortedNames.sort((name1
