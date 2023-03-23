package org.example.hwOOP01;

// Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и реализовать 
// перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт соответствующий имени, объему и температуре
// В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и воспроизвести логику заложенную в программе
// Все вышеуказанное создать согласно принципам ООП пройдённым на семинаре

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        VendingMachineBottle vmBottle = new VendingMachineBottle();
        List<BottleOfWater> bottleList = new ArrayList<>(Arrays.asList(
                new BottleOfWater(prod.Cola.toString(), new BigDecimal(400), 0.4),
                new BottleOfWater(prod.Sprite.toString(), new BigDecimal(200), 0.5),
                new BottleOfWater(prod.Fanta.toString(), new BigDecimal(180), 0.5),
                new BottleOfWater("Лимонад", new BigDecimal(150), 0.8)));
        vmBottle.initProduct(bottleList);
        System.out.println(vmBottle.getProduct("Cola"));
        System.out.println("безалкогольные горячие напитки");
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Кофе", new BigDecimal(300), 0.4, 80),
                new HotDrinks("Чай", new BigDecimal(150), 0.45, 85),
                new HotDrinks("Руссиано", new BigDecimal(200), 0.6, 70)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Tea"));
        System.out.println("Поиск по цене <=: " + vmHotDrinks.getProduct(new BigDecimal(250)));
        System.out.println("Поиск по температуре <=: " + vmHotDrinks.getProduct(72));
    }
}