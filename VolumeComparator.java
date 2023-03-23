package org.example.hwOOP01;

import java.math.BigDecimal;

public class VolumeComparator extends Product {
    private Double volume;

    public VolumeComparator (String name, BigDecimal price, Double volume) {
        super(name, price);
        this.volume = volume;
    }

    public Double getVolume() {
        return volume;
    }

    @Override
    public String toString() {
        return super.toString() + "объем = " + volume + " ";
    }

    public void setVolume(Double volume) {
        if (volume > 0) this.volume = volume;
        else System.out.println("Введите число больше 0");
    }
}