import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NameOccurrences {
    public static void main(String[] args) {
        List<String> employees = List.of(
                "Иван Иванов",
                "Светлана Петрова",
                "Кристина Белова",
                "Анна Мусина",
                "Анна Крутова",
                "Иван Юрин",
                "Петр Лыков",
                "Павел Чернов",
                "Петр Чернышов",
                "Мария Федорова",
                "Марина Светлова",
                "Мария Савина",
                "Мария Рыкова",
                "Марина Лугова",
                "Анна Владимирова",
                "Иван Мечников",
                "Петр Петин",
                "Иван Ежов"
        );

        Map<String, Integer> nameOccurrences = new HashMap<>();
        for (String employee : employees) {
            nameOccurrences.put(employee, nameOccurrences.getOrDefault(employee, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedOccurrences = nameOccurrences.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toList());

        for (Map.Entry<String, Integer> entry : sortedOccurrences) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " повторений");
        }
    }
}
