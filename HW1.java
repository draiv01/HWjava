// package HWjava;

// import java.util.Scanner;
// import java.util.Scanner;
// import java.io.FileWriter;
// import java.io.IOException;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

// public class HW1 {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         System.out.print("Введите число n: ");
//         int n = scan.nextInt();

//         int sumN = 0;
//         int prN = 1;

//         for (int i = 1; i <= n; i++) {
//             sumN = sumN + i;
//             prN = prN * i;
//         }

//         System.out.println("сумма чисел от 1 до n: " + sumN);
//         System.out.println("произведение чисел от 1 до n: " + prN);

//     }
// }

// Вывести все простые числа от 1 до 1000

// public class HW1 {

//     public static void main(String[] args) {
//         Scanner scan = new Scanner(System.in);

//         System.out.println("Enter number");
//         int number;
//         for (int i = 2; i < 1000; ++i) {
//             int count = 0;
//             for (int j = 2; j <= i && count < 2; ++j) {
//                 if (i % j == 0) {
//                     ++count;
//                 }
//             }
//             if (count < 2)
//                 System.out.println(i);
//         }
//     }
// }





// Реализовать простой калькулятор






// public class HW1 {
//     static Scanner scanner = new Scanner(System.in);

//     public static void main(String[] args) {
//         int num1 = getInt();
//         int num2 = getInt();
//         char operation = getOperation();
//         int result = calc(num1,num2,operation);
//         System.out.println("Результат операции: "+result);
//     }

//     public static int getInt(){
//         System.out.println("Введите число:");
//         int num;
//         if(scanner.hasNextInt()){
//             num = scanner.nextInt();
//         } else {
//             System.out.println("ошибка");
//             scanner.next();//рекурсия
//             num = getInt();
//         }
//         return num;
//     }

//     public static char getOperation(){
//         System.out.println("Введите операцию:");
//         char operation;
//         if(scanner.hasNext()){
//             operation = scanner.next().charAt(0);
//         } else {
//             System.out.println("ошибка");
//             scanner.next();//рекурсия
//             operation = getOperation();
//         }
//         return operation;
//     }

//     public static int calc(int num1, int num2, char operation){
//         int result;
//         switch (operation){
//             case '+':
//                 result = num1+num2;
//                 break;
//             case '-':
//                 result = num1-num2;
//                 break;
//             case '*':
//                 result = num1*num2;
//                 break;
//             case '/':
//                 result = num1/num2;
//                 break;
//             default:
//                 System.out.println("ошибка");
//                 result = calc(num1, num2, getOperation());//рекурсия
//         }
//         return result;
//     }
// }