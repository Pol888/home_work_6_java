package org.example;

import java.util.*;


public class App 
{
    public static Set <NoteBook> noteBooks;

    public static void main( String[] args ) {
        noteBooks = new HashSet<>(); // коллекция ноутбуков

        Set<NoteBook> search = new HashSet<>(); // для поиска

        noteBooks.add(add_NoteBook(999999, "Aser", "black", 8, 16, 480)); // add <NoteBook>
        noteBooks.add(add_NoteBook(888888, "Lenovo", "gray", 6, 8, 256));
        noteBooks.add(add_NoteBook(777777, "Apple", "gray", 6, 6, 512));
        noteBooks.add(add_NoteBook(666666, "Asus", "black-red", 8, 12, 1024));
        noteBooks.add(add_NoteBook(555555, "Lenovo", "black-red", 4, 4, 128));
        noteBooks.add(add_NoteBook(444444, "Apple", "black", 8, 16, 1024));
        noteBooks.add(add_NoteBook(333333, "Aser", "black-red", 8, 16, 2048));

        Scanner a = new Scanner(System.in); // ввод

        menu(a, (HashSet<NoteBook>) search);

        a.close();
    }



    static HashSet <NoteBook> manufacturer_search(HashSet <NoteBook> a, Scanner sc){    // поиск по производителю
        Set <NoteBook> b = new HashSet<>();

        Set<String> z = new HashSet<>();  // уникальные производители
        for (NoteBook i: a) {
            z.add(i.manufacturer);
        }

        System.out.println("В базе c данными критериями есть производители: ");
        System.out.println(z);

        System.out.println("Введите производителей через пробел");
        ArrayList <String> input = new ArrayList<>(Arrays.asList(sc.nextLine().split(" "))); // ввод

        for (NoteBook x: a) {
            for (String p: input) {
                if (x.manufacturer.equals(p)) {
                    b.add(x);
                }
            }
        }
        return (HashSet<NoteBook>) b;
    }




    static HashSet<NoteBook> colour_search(HashSet <NoteBook> a, Scanner sc){     // поиск по цвету
        Set <NoteBook> b = new HashSet<>();

        Set<String> z = new HashSet<>();  // уникальные цвета
        for (NoteBook i: a) {
            z.add(i.colour);
        }

        System.out.println("В базе c данными критериями есть следующии цвета: ");
        System.out.println(z);


        System.out.println("Введите цвета через пробел");
        ArrayList <String> input = new ArrayList<>(Arrays.asList(sc.nextLine().split(" "))); // ввод

        for (NoteBook x: a) {
            for (String p: input) {
                if (x.colour.equals(p)) {
                    b.add(x);
                }
            }
        }
        return (HashSet<NoteBook>) b;
    }



    static HashSet<NoteBook> cores_search(HashSet <NoteBook> a, Scanner sc){  // поиск по количеству ядер процессора
        Set <NoteBook> b = new HashSet<>();

        Set<Integer> z = new HashSet<>();  // информация о ядрах
        for (NoteBook i: a) {
            z.add(i.processor_cores);
        }

        System.out.println("В базе c данными критериями есть следующии варианты ядер: ");
        System.out.println(z);

        System.out.println("Введите через пробел: ");
        ArrayList <String> input = new ArrayList<>(Arrays.asList(sc.nextLine().split(" "))); // ввод

        for (NoteBook x: a) {
            for (String p: input) {
                if (x.processor_cores == Integer.parseInt(p)) {
                    b.add(x);
                }
            }
        }
        return (HashSet<NoteBook>) b;
    }




    static HashSet<NoteBook> ram_search(HashSet <NoteBook> a, Scanner sc){  // поиск по оперативной памяти
        Set <NoteBook> b = new HashSet<>();

        Set<Integer> z = new HashSet<>();  // информация о RAM
        for (NoteBook i: a) {
            z.add(i.RAM);
        }

        System.out.println("В базе c данными критериями есть следующии варианты оперативной памяти: ");
        System.out.println(z);

        System.out.println("Введите через пробел: ");
        ArrayList <String> input = new ArrayList<>(Arrays.asList(sc.nextLine().split(" "))); // ввод

        for (NoteBook x: a) {
            for (String p: input) {
                if (x.RAM == Integer.parseInt(p)) {
                    b.add(x);
                }
            }
        }
        return (HashSet<NoteBook>) b;
    }



    static HashSet<NoteBook> ssd_search(HashSet <NoteBook> a, Scanner sc){  // поиск по накопителю памяти
        Set <NoteBook> b = new HashSet<>();

        Set<Integer> z = new HashSet<>();  // информация о RAM
        for (NoteBook i: a) {
            z.add(i.SSD);
        }

        System.out.println("В базе c данными критериями есть следующии варианты накопителей памяти: ");
        System.out.println(z);

        System.out.println("Введите через пробел: ");
        ArrayList <String> input = new ArrayList<>(Arrays.asList(sc.nextLine().split(" "))); // ввод

        for (NoteBook x: a) {
            for (String p: input) {
                if (x.SSD == Integer.parseInt(p)) {
                    b.add(x);
                }
            }
        }
        return (HashSet<NoteBook>) b;
    }


    static void menu (Scanner a, HashSet<NoteBook> search){
        ArrayList <Set<NoteBook>> save_srh = new ArrayList<>();
        if (save_srh.size() == 10){
            save_srh.remove(0);
        }


        Boolean flag = false;
        while (!flag) {
            System.out.println("Здравствуй дорогой пользователь !");
            System.out.println("Это приложение вносит в базу данных обьект ноутбука и осуществляет поиск по заданным параметрам.");
            System.out.println("1 - Внести данные");
            System.out.println("2 - Осуществить поиск");
            System.out.println("3 - Выход");
            String ch = a.nextLine();
            if (ch.equals("1")) {
                System.out.println("Введите серийный номер продукта");
                int ser = a.nextInt();

                System.out.println("Введите производителя продукта");
                String p = a.next();

                System.out.println("Введите цвет продукта");
                String col = a.next();

                System.out.println("Введите количество ядер процессора");
                int pc = a.nextInt();

                System.out.println("Введите количество оперативной памяти");
                int ram = a.nextInt();

                System.out.println("Введите количество памяти накопителя");
                int ssd = a.nextInt();

                App.noteBooks.add(add_NoteBook(ser, p, col, pc, ram, ssd));
                System.out.println("Данные добавленны");


            } else if (ch.equals("2")) {
                System.out.println("1 - Вывести результаты прошлых поисков");
                System.out.println("2 - Осуществить новый поиск");
                String srh = a.nextLine();
                if (srh.equals("1")){
                    if (save_srh.size() == 0){
                        System.out.println(String.format("В базе содержится %d записей", save_srh.size()));
                    }else {
                        System.out.println(String.format("В базе содержится %d запи(сей, си)сь", save_srh.size()));
                        System.out.println(String.format("Введите номер записи от 1 до %d где (%d самая последняя)"
                                , save_srh.size(), save_srh.size()));

                        for (NoteBook x : save_srh.get(a.nextInt() - 1)) {
                            System.out.println(String.format("%s // col:%s, cores:%d, RAM:%d, SSD:%d", x.manufacturer, x.colour,
                                    x.processor_cores, x.RAM, x.SSD));
                        }
                    }

                } else if(srh.equals("2")) {

                System.out.println("По каким параметрам выполнить поиск");
                System.out.println("Введите через пробел");

                System.out.println("1 - производитель");
                System.out.println("2 - цвет");
                System.out.println("3 - количество ядер");
                System.out.println("4 - оперативная память");
                System.out.println("5 - накопительная память(SSD)");
                System.out.println("ВВЕДИТЕ ЧЕРЕЗ ПРОБЕЛ");
                String s = a.nextLine();
                ArrayList<String> input = new ArrayList<>(Arrays.asList(s.split(" "))); // ввод варианта поиска

                for (String i : input) {     // реализация поиска
                    if (search.size() == 0) {
                        if (i.equals("1")) {     // когда коллекция search еще пуста
                            search = manufacturer_search((HashSet) App.noteBooks, a);
                        } else if (i.equals("2")) {
                            search = colour_search((HashSet) App.noteBooks, a);
                        } else if (i.equals("3")) {
                            search = cores_search((HashSet) App.noteBooks, a);
                        } else if (i.equals("4")) {
                            search = ram_search((HashSet) App.noteBooks, a);
                        } else if (i.equals("5")) {
                            search = ssd_search((HashSet) App.noteBooks, a);
                        }


                    } else {                   // когда коллекция search уже наполненна (при сложном фильтре поиска)
                        if (i.equals("1")) {
                            search = manufacturer_search((HashSet) search, a);
                        } else if (i.equals("2")) {
                            search = colour_search((HashSet) search, a);
                        } else if (i.equals("3")) {
                            search = cores_search((HashSet) search, a);
                        } else if (i.equals("4")) {
                            search = ram_search((HashSet) search, a);
                        } else if (i.equals("5")) {
                            search = ssd_search((HashSet) search, a);
                        }
                    }
                }
                System.out.println("По вашим запросам найденно"); // печать результата поиска
                for (NoteBook x : search) {
                    System.out.println(String.format("%s // col:%s, cores:%d, RAM:%d, SSD:%d", x.manufacturer, x.colour,
                            x.processor_cores, x.RAM, x.SSD));
                  }
                save_srh.add(search); // автоматическое сохранение 10 последних результатов поиска

                search = new HashSet<>(); // сброс списка поиска
                }
                }else if (ch.equals("3")){ // выход из программы
                    flag = true;
            }
        }
    }




        static NoteBook add_NoteBook(int ser, String man, String col, int cores, int RAM, int SSD){  // добавляет <NoteBook>

        NoteBook NB = new NoteBook();
        NB.serial = ser;
        NB.manufacturer = man;
        NB.colour = col;
        NB.processor_cores = cores;
        NB.RAM = RAM;
        NB.SSD = SSD;
        return NB;
    }
}
