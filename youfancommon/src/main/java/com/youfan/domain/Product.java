package com.youfan.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * Created by Administrator on 2018/6/18 0018.
 * 商品信息
 */
@Getter
@Setter
public class Product {
  private int id;//主键
  private int producttypeid;//商品类别
  private String producttitle;//商品标题
    private int productprice ;//商品价格
    private int mechartid;//商家id
    private Date createtime;//创建时间
    private Date audittime;//审核时间
    private int  auditstate;//审核转态,0,未审核 1 审核通过 2 审核不通过
    private int      stocknum;//库存
    private int  sellnum;//销售数量
    private String   productpicurl;//商品图片地址
    private int proudctstatus;//产品状态，0代表上架，1代表下架


}
