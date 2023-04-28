// 1. Пусть дан произвольный список целых чисел, удалить из него четные числа
// (в языке уже есть что-то готовое для этого)

// import java.util.ArrayList;

// public class HW3 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(21);
//         list.add(16);
//         list.add(17);
//         list.add(24);
//         list.add(19);
//         list.add(1);
//         list.add(30);

//         System.out.println("Список: " + list);

//         list.removeIf(n -> n % 2 == 0);

//         System.out.println("Список без четных чисел: " + list);

//     }
// }




// 2. Задан целочисленный список ArrayList. Найти минимальное, максимальное
// и среднее арифметическое из этого списка.

// import java.util.ArrayList;
// import java.util.Collections;

// public class HW3 {
//     public static void main(String[] args) {
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(21);
//         list.add(16);
//         list.add(17);
//         list.add(24);
//         list.add(19);
//         list.add(1);
//         list.add(30);

//         System.out.println("Список: " + list);

//         int min = Collections.min(list);
//         int max = Collections.max(list);
//         double average = list.stream().mapToInt(Integer::intValue).average().orElse(0);

//         System.out.println("Минимальное значение: " + min);
//         System.out.println("Максимальное значение: " + max);
//         System.out.println("Среднее арифметическое значение: " + average);
//     }
// }
