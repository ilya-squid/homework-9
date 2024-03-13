public class Main {
    public static void main(String[] args) {
// task 1
        System.out.println("Задание 1");

        int[] array = {11_000, 17_000, 12_000, 50_000, 666_666};
        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей");

        // task 2
        System.out.println("Задание 2");

        int[] array1 = {70_000, 41_000, 142_000, 1_000, 66_666};
        int min = array1[0];
        int max = array1[0];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] < min) {
                min = array1[i];
            }
            if (array1[i] > max) {
                max = array1[i];
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + min + " рублей." + " Максимальная сумма трат за неделю составила " + max + " рублей");

        // task 3
        System.out.println("Задание 3");

        int[] array2 = {77_000, 76_000, 111_000, 61_000, 6_666};
        int total2 = 0;
        for (int i = 0; i < array2.length; i++) {
            total2 += array2[i];
        }
        double theAverageAmount = (double) total2 / array2.length;
        System.out.println("Средняя сумма трат за месяц составила " + theAverageAmount + " рублей");

        // task 4
        System.out.println("Задание 4");

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}