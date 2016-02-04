package com.bruyako.model;

import java.io.Serializable;

/**
 * Created by brunyatko on 03.02.16.
 */
public class GoodsDto implements Serializable {

    private int good_id;
    private String name;
    private int price;

    public int getGood_id() {
        return good_id;
    }

    public void setGood_id(int good_id) {
        this.good_id = good_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GoodsDto)) return false;

        GoodsDto goodsDto = (GoodsDto) o;

        if (price != goodsDto.price) return false;
        if (name != null ? !name.equals(goodsDto.name) : goodsDto.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
