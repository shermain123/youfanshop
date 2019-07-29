package com.youfan.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Administrator on 2018/6/18 0018.
 * 商品详情信息
 */
@Getter
@Setter
public class ProductDetail {
    private int id;//主键
    private int proudctid;//商品id
    private String productplace;//商品产地
    private String  productdescription;//商品描述
    private String   productbrand;//商品品牌
    private String   productweight;//商品重量
    private String    productspecification;//商品规格说明和包装
    private String     productdetaipicurl;//商品详情图片地址


}
