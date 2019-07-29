package com.cn.youfanproducttypes.service;

import com.cn.youfanproducttypes.dao.ProducttypeDao;
import com.youfan.domain.ProductType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sher on 2019/7/20.
 */
@Service
public class ProductTypeService {
    @Autowired
    ProducttypeDao producttypeDao;

    public void insertProducttype(ProductType productType){
        producttypeDao.insertProducttype(productType);
    }
    public ProductType findProductytpeByid(int id){
        return producttypeDao.findProductytpeByid(id);
    }
    public List<ProductType> listallProductytpe(){
        return producttypeDao.listallProductytpe();
    }
    public void updateproductTypebyid(ProductType productType){
        producttypeDao.updateproductTypebyid(productType);
    }
}
