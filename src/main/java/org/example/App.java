package org.example;

import java.util.*;


public class App 
{


    public static void main( String[] args )
    {

        Set<Object> noteBooks = new HashSet<>(); // коллекция ноутбуков

        Set<Object> search = new HashSet<>(); // для поиска

        noteBooks.add(add_NoteBook(999999, "Aser", "black", 8, 16, 480)); // add <NoteBook>
        noteBooks.add(add_NoteBook(888888, "Lenovo", "gray", 6, 8, 256));
        noteBooks.add(add_NoteBook(777777, "Apple", "gray", 6, 6, 512));
        noteBooks.add(add_NoteBook(666666, "Asus", "black-red", 8, 12, 1024));
        noteBooks.add(add_NoteBook(555555, "Lenovo", "black-red", 4, 4, 128));
        noteBooks.add(add_NoteBook(444444, "Apple", "black", 8, 16, 1024));
        noteBooks.add(add_NoteBook(333333, "Aser", "black-red", 8, 16, 2048));





        System.out.println("Здравствуй дорогой пользователь !");
        System.out.println("Это приложение вносит в базу данных обьект" +
                " ноутбука и осуществляет поиск по заданным параметрам.");

        System.out.println("1 - Внести данные");
        System.out.println("2 - Осуществить поиск");

        System.out.println("По каким параметрам выполнить поиск");
        System.out.println("Введите через пробел");

        System.out.println("1 - производитель");
        System.out.println("2 - цвет");
        System.out.println("3 - количество ядер");
        System.out.println("4 - оперативная память");
        System.out.println("5 - накопительная память(SSD)");

        ArrayList <String> input = new ArrayList<>(Arrays.asList("1 2".split(" ")));

        for (String i: input) {
            if (search.size() == 0) {
                if (i.equals("1")) {
                    search = manufacturer_search((HashSet) noteBooks);
                } else if (i.equals("2")){
                    search = colour_search((HashSet) noteBooks);
                }



            }else {
                if (i.equals("1")){
                search = manufacturer_search((HashSet) search);
              }else if(i.equals("2")){

                search = colour_search((HashSet) search);
                }

            }
        }
    System.out.println(search);
    }


    static HashSet <NoteBook> manufacturer_search(HashSet <NoteBook> a){
        Set <NoteBook> b = new HashSet<>();

        System.out.println("Введите производителей через пробел");
        ArrayList <String> input = new ArrayList<>(Arrays.asList("Aser Lenovo".split(" "))); // ввод

        for (NoteBook x: a) {
            for (String p: input) {
                if (x.manufacturer.equals(p)) {
                    b.add(x);
                }
            }
        }
        return (HashSet<NoteBook>) b;
    }

    static HashSet<NoteBook> colour_search(HashSet <NoteBook> a){
        Set <NoteBook> b = new HashSet<>();

        System.out.println("Введите цвета через пробел");
        ArrayList <String> input = new ArrayList<>(Arrays.asList("black".split(" "))); // ввод

        for (NoteBook x: a) {
            for (String p: input) {
                if (x.colour.equals(p)) {
                    b.add(x);
                }
            }
        }
        return (HashSet<NoteBook>) b;


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
