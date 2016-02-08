package com.bruyako.converter;

import com.bruyako.entity.Goods;
import com.bruyako.model.GoodsDto;

/**
 * Created by brunyatko on 03.02.16.
 */
public class EntityDtoConverter {

    private EntityDtoConverter() {
    }

    public static Goods convert(GoodsDto goodsDto) {

        if (goodsDto == null) {
            return null;
        }
        Goods goods = new Goods();
        goods.setGood_id(goodsDto.getGood_id());
        goods.setName(goodsDto.getName());
        goods.setPrice(goodsDto.getPrice());
        return goods;
    }

    public static GoodsDto convert(Goods goods) {

        if (goods == null) {
            return null;
        }

        GoodsDto goodsDto = new GoodsDto();
        goodsDto.setGood_id(goods.getGood_id());
        goodsDto.setName(goods.getName());
        goodsDto.setPrice(goods.getPrice());

        return goodsDto;
    }
}