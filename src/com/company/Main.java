package com.company;

public class Main {
    /*  Дедлайн 3 дня
       a) Доделать все пункты практического задания из презентации.
       b) Создать 2х уровневую иерархию из 4х классов
       (1й - родитель --> 2й, 3й, 4й - дочерние, с отличающимися полями).
       c) Создать Интерфейс Printable с методом void print();
       d) Реализовать интерфейс Printable классами 2й, 3й и 4й,
       переопределить метод интерфейса так чтобы он распечатывал всю информацию о свойствах объекта.
       e) В классе Main создать возвращаемый метод createObject(String className),
       который умеет создавать объекты класса 2й, 3й и 4й и после создания и
       задания свойств объекту метод возвращает ссылку на объект (пульт).
       Можно использовать switch для того чтоб определить какого типа нужно
       создать экземпляр объекта. Например если в параметре передается “2й” метод
       должен создать объект именно этого типа.
       f) В главном классе Main создать 3 различных объекта классов
       2й, 3й и 4й с помощью метода createOcject, и распечатать по ним информацию методом print();*/
        public static void main(String[] args) {
            createObject("Van").print();
            createObject("Bicycle").print();
            createObject("Car").print();
        }

    private static Printable createObject(String className) {
            Printable printable = null;
            switch (className){
                case "Van":
                    printable = new Van(3.5, 2015);
                    break;
                case "Car":
                    printable=new Car(4.5, "coupe");
                    break;
                case "Bicycle":
                    printable=new Bicycle(0.0, 27);
                    break;
            };
            return printable;
        }
    }
