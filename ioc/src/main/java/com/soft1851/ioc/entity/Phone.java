package com.soft1851.ioc.entity;

/**
 * @author jh_wu
 * @ClassName Phone
 * @Description TODO
 * @Date 2020/3/12:11:06
 * @Version 1.0
 **/
public class Phone {
    private String brand;
    private Double price;
    public Phone(String brand, Double price)
    {
        this.brand=brand;
        this.price=price;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Phone() {
    }
    
    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}