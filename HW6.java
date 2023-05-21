// Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.

// Создать множество ноутбуков.

// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:

// “Введите цифру, соответствующую необходимому критерию:

// 1 - ОЗУ

// 2 - Объём ЖД

// 3 - Операционная система

// 4 - Цвет …

// Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.


import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;



public class HW6 { 
    public static void main(String[] args) {
        
        ArrayList<Nout> nouts = new ArrayList<>();
        nouts.add(new Nout("HP", 15, 8, 512, "черный"));
        nouts.add(new Nout("Lenovo", 15, 16, 512, "белый"));
        nouts.add(new Nout("Dell", 10, 8, 256, "белый"));
        nouts.add(new Nout("Asus", 10, 8, 512, "черный"));
        nouts.add(new Nout("Acer", 15, 16, 1024, "белый"));
        nouts.add(new Nout("MSI", 15, 32, 1024, "черный"));
        nouts.add(new Nout("Apple", 20, 8, 256, "белый"));

        try (
        Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите размер оперативной памяти 8 / 16 /32 (в ГБ ): ");
            int ramSize = scanner.nextInt();
            System.out.print("Введите размер SSD 256 / 512 / 1024 (в ГБ ): ");
            int ssdSize = scanner.nextInt();
            System.out.print("Введите цвет  черный / белый: ");
            scanner.nextLine();
            String color = scanner.nextLine();


            ArrayList<Nout> filterNouts = new ArrayList<>();
            for (Nout nout : nouts) {
                if (nout.getRamSize() == ramSize && nout.getSsdSize() == ssdSize && Objects.equals(nout.getColor(), color)) {
                    filterNouts.add(nout);
                }
            }


            if (filterNouts.size() == 0) {
                System.out.println("Ноутбуки с заданными параметрами не найдены.");
                } else {
            System.out.println("Найдены следующие ноутбуки:");
                for (Nout nout : filterNouts) {
                    System.out.println(nout.getInfo());
                }
            }
        }
    }
}
