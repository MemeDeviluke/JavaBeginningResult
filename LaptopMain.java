package HW2;

import java.util.*;

public class LaptopMain {

    private static Map<Integer, ArrayList<String>> categories = new HashMap<>();

    public static void main(String[] args) {
        Laptop laptop1 = new Laptop("Samsung", 8, 256, "Windows", "black");
        Laptop laptop2 = new Laptop("Samsung", 16, 512, "Windows", "gray");
        Laptop laptop3 = new Laptop("Acer", 16, 512, "Windows", "white");
        Laptop laptop4 = new Laptop("Acer", 32, 1024, "Windows", "black");
        Laptop laptop5 = new Laptop("Macbook", 32, 512, "macOS", "white");
        Laptop laptop6 = new Laptop("Macbook", 32, 1024, "macOS", "green");
        Laptop laptop7 = new Laptop("Macbook", 32, 1024, "macOS", "green");

        Set<Laptop> laptops = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5, laptop6, laptop7));


        ArrayList<String> brands = new ArrayList<>();
        brands.add("Acer");
        brands.add("Samsung");
        brands.add("Macbook");

        ArrayList<String> rams = new ArrayList<>();
        rams.add("8");
        rams.add("16");
        rams.add("32");

        ArrayList<String> hdspaces = new ArrayList<>();
        hdspaces.add("256");
        hdspaces.add("512");
        hdspaces.add("1024");

        ArrayList<String> OS = new ArrayList<>();
        OS.add("Windows");
        OS.add("macOS");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("black");
        colors.add("white");
        colors.add("gray");


        categories.put(1, brands);
        categories.put(2, rams);
        categories.put(3, hdspaces);
        categories.put(4, OS);
        categories.put(5, colors);


        while (true) {
            Scanner scanner = new Scanner(System.in, "ibm866");
            System.out.println("1 <- Брэнды, 2 <- ОЗУ, 3 <- Объем Жд, 4 <- ОС, 5 <- Цвет");
            System.out.println("Введите категорию для сравнения или для выхода нажмите 0: ");
            int input = scanner.nextInt();
            int count = 0;
            Scanner scanner2 = new Scanner(System.in, "ibm866");
            if(input == 1) {
                System.out.println(categories.get(1));
                System.out.println("Выберите из доступных опций: ");
                String input2 = scanner2.nextLine();
                for (String chooses : categories.get(1)) {
                    if (input2.equals(chooses)) {
                        getLaptops(laptops, input2, input);
                        count++;
                    }
                }
                if (count == 0) {
                    System.out.println("Запрос неверен!");
                }

            }
                if(input == 2) {
                    System.out.println(categories.get(2));
                    System.out.println("Выберите минимальное из доступных опций: ");
                    String input3 = scanner2.nextLine();
                    for (String chooses : categories.get(2)) {
                        if (input3.equals(chooses)) {
                            getLaptops(laptops, input3, input);
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Запрос неверен!");
                    }

                }
                if(input == 3) {
                    System.out.println(categories.get(3));
                    System.out.println("Выберите минимальное из доступных опций: ");
                    String input4 = scanner2.nextLine();
                    for (String chooses : categories.get(3)) {
                        if (input4.equals(chooses)) {
                            getLaptops(laptops, input4, input);
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Запрос неверен!");
                    }

                }
                if(input == 4) {
                    System.out.println(categories.get(4));
                    System.out.println("Выберите из доступных опций: ");
                    String input5 = scanner2.nextLine();
                    for (String chooses : categories.get(4)) {
                        if (input5.equals(chooses)) {
                            getLaptops(laptops, input5, input);
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Запрос неверен!");
                    }

                }
                if(input == 5) {
                    System.out.println(categories.get(5));
                    System.out.println("Выберите из доступных опций: ");
                    String input6 = scanner2.nextLine();
                    for (String chooses : categories.get(5)) {
                        if (input6.equals(chooses)) {
                            getLaptops(laptops, input6, input);
                            count++;
                        }
                    }
                    if (count == 0) {
                        System.out.println("Запрос неверен!");
                    }

                }
                if(input == 0) {
                    scanner.close();
                    scanner2.close();
                    break;
                }
        }
    }

    public static void getLaptops(Set<Laptop> laps, String str, int choose){
        if(choose == 1){
            for(Laptop laptop : laps){
                if(str.equals(laptop.getBrand())){
                    System.out.println(laptop);
                }
            }
        }
        else if(isInteger(str) && choose == 2){
            for(Laptop laptop : laps){
                if(Integer.parseInt(str) <= laptop.getRam()){
                    System.out.println(laptop);
                }
            }
        }
        else if(isInteger(str) && choose == 3){
            for(Laptop laptop : laps){
                if(Integer.parseInt(str) <= laptop.getHdspace()){
                    System.out.println(laptop);
                }
            }
        }
        else if(choose == 4){
            for(Laptop laptop : laps){
                if(str.equals(laptop.getOS())){
                    System.out.println(laptop);
                }
            }
        }
        else if(choose == 5){
            for(Laptop laptop : laps){
                if(str.equals(laptop.getColor())){
                    System.out.println(laptop);
                }
            }
        }
        else {
            System.out.println("Нужный ноутбук не найден!");
        }

    }

    private static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }
}
