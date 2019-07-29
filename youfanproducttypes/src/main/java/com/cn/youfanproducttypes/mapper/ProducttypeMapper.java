package com.cn.youfanproducttypes.mapper;

import com.youfan.domain.ProductType;

import java.util.List;

/**
 * Created by sher on 2019/7/20.
 */
public interface ProducttypeMapper {

    public void insertProducttype(ProductType productType);
    public ProductType findProductytpeByid(int id);
    public List<ProductType> listallProductytpe();
    public void updateproductTypebyid(ProductType productType);
}
