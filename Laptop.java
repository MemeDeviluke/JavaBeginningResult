package HW2;

import java.util.Objects;

public class Laptop {

    private String brand;
    private int ram;
    private int hdspace;
    private String OS;
    private String color;

    public Laptop(String brand, int ram, int hdspace, String OS, String color) {
        this.brand = brand;
        this.ram = ram;
        this.hdspace = hdspace;
        this.OS = OS;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getHdspace() {
        return hdspace;
    }

    public void setHdspace(int hdspace) {
        this.hdspace = hdspace;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", hdspace=" + hdspace +
                ", OS='" + OS + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj == null || getClass() != obj.getClass()){
            return false;
        }
        Laptop laptop = (Laptop) obj;
        return brand.equals(laptop.brand) && ram == laptop.ram && hdspace == laptop.hdspace && OS.equals(laptop.OS) && color.equals(laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, ram, hdspace, OS, color);
    }
}
