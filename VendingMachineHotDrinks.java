package org.example.hwOOP01;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class VendingMachineHotDrinks implements VendingMachine {
    List<HotDrinks> listHotDrinks = new ArrayList<>();
    List<HotDrinks> searchResult = new ArrayList<>();

    @Override
    public void initProduct() {
    }

    public void initProduct(List<HotDrinks> list) {
        this.listHotDrinks = list;
    }

    @Override
    public String getProduct() {
        return null;
    }

    public String getProduct(String name) {
        searchResult.clear();
        for (HotDrinks el : listHotDrinks) {
            if (el.getName().equals(name)) searchResult.add(el);
        }
        return searchResult.toString();
    }

    public String getProduct(BigDecimal price) {
        searchResult.clear();
        for (HotDrinks el : listHotDrinks) {
            if (el.getPrice().compareTo(price) <= 0) searchResult.add(el);
        }
        return searchResult.toString();
    }

    public String getProduct(int temp) {
        searchResult.clear();
        for (HotDrinks el : listHotDrinks) {
            if (el.getTemp() <= temp) searchResult.add(el);
        }
        return searchResult.toString();
    }
}