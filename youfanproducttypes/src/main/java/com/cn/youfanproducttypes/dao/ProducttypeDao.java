package com.cn.youfanproducttypes.dao;

import com.cn.youfanproducttypes.mapper.ProducttypeMapper;
import com.youfan.domain.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by sher on 2019/7/20.
 */
@Component
public class ProducttypeDao {
    @Autowired
    ProducttypeMapper producttypeMapper;

    public void insertProducttype(ProductType productType){
        producttypeMapper.insertProducttype(productType);
    }
    public ProductType findProductytpeByid(int id){
        return producttypeMapper.findProductytpeByid(id);
    }
    public List<ProductType> listallProductytpe(){
        return producttypeMapper.listallProductytpe();
    }
    public void updateproductTypebyid(ProductType productType){
        producttypeMapper.updateproductTypebyid(productType);
    }
}
