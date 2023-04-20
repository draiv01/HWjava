// Дана строка sql-запроса "select * from students where ".
// Сформируйте часть WHERE этого запроса, используя StringBuilder.
// Данные для фильтрации приведены ниже в виде json-строки.
// Если значение null, то параметр не должен попадать в запрос.

// Параметры для фильтрации: {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}

// import java.util.LinkedHashMap;
// import java.util.Map;

// public class HW2 {

//     public class Solution {
//         public static void main(String[] args) {
//             Map<String, String> map = new LinkedHashMap<>();
//             map.put("name", "Ivanov");
//             map.put("country", "Russia");
//             map.put("city", "Moscow");
//             map.put("age", null);
//             System.out.println(getQuery(map));
//         }

//         public static String getQuery(Map<String, String> params) {
//             StringBuilder WHERE = new StringBuilder();
//             for (Map.Entry<String, String> pair : params.entrySet()) {
//                 if (pair.getValue() != null) {
//                     WHERE.append(pair.getKey() + " = " + "'" + pair.getValue() + "'" + " and ");
//                 }
//             }
//             WHERE.delete(WHERE.length() - 4, WHERE.length());
//             return WHERE.toString();
//         }
//     }
// }

// Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.



// import java.util.logging.*;
// import java.io.*;
// import java.util.Arrays;

// public class HW2 {
//     public static void main(String[] args) {
//         Logger logger = Logger.getLogger(HW2.class.getName());
//         logger.setLevel(Level.INFO);
//         ConsoleHandler ch = new ConsoleHandler();
//         logger.addHandler(ch);
//         SimpleFormatter sFormat = new SimpleFormatter();
//         ch.setFormatter(sFormat);
//         logger.log(Level.WARNING, "логирование");
//         logger.info("логирование");
//         int[] mas = { 5, 3, 4, 6, 7 };

//         boolean isSorted = false;
//         int buf;
//         while (!isSorted) {
//             isSorted = true;
//             for (int i = 0; i < mas.length - 1; i++) {
//                 if (mas[i] > mas[i + 1]) {
//                     isSorted = false;

//                     buf = mas[i];
//                     mas[i] = mas[i + 1];
//                     mas[i + 1] = buf;
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(mas));

//     }

//     public static String writeLine(String tmp) {
//         try (FileWriter fw = new FileWriter("file.txt", false)) {
//             fw.write(tmp);
//             String one = "успешно";
//             return one;
//         } catch (IOException ex) {
//             String message1 = "ошибка";
//             String message2 = message1 + ex.getMessage();
//             return message2;
//         }
//     }
// }