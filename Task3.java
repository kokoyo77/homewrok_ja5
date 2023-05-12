import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {9, 7, 5, 11, 12, 2, 14, 3, 10, 6};

        System.out.println("Исходный массив: " + Arrays.toString(array));
        heapSort(array);
        System.out.println("Отсортированный массив: " + Arrays.toString(array));
    }

    public static void heapSort(int[] array) {
        int n = array.length;

        // Построение кучи (перегруппировка массива)
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // Извлечение элементов из кучи и упорядочивание массива
        for (int i = n - 1; i > 0; i--) {
            // Перемещаем текущий корень в конец массива
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // Вызываем heapify на уменьшенной куче
            heapify(array, i, 0);
        }
    }

    public static void heapify(int[] array, int n, int i) {
        int largest = i; // Инициализируем наибольший элемент как корень
