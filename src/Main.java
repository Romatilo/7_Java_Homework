import tasks.*;
import java.io.IOException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        // Задача 5. Сортировка пузырьком
        int [] arrayNumbers = {3, 6, 4, 0, -5, 56, 13, 2, 17};
        System.out.println(Arrays.toString(BubbleSort.getBubbleSort(arrayNumbers)));

        // Задача 6 Распарсинг JSON-файла
        String json = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        System.out.println(JsonToFormattedString.jsonToString(json));
    }
}
