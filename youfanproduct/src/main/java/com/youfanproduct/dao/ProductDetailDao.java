package com.youfanproduct.dao;


import com.youfan.domain.ProductDetail;
import com.youfanproduct.mapper.ProductDetailMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by youfan on 2018/6/8 0008.
 */
@Component
public class ProductDetailDao {
    @Autowired
    ProductDetailMapper productDetailMapper;

    public int insertProduct(ProductDetail productDetail){
        return productDetailMapper.insertProductDetail(productDetail);
    }
    public ProductDetail findproductdetailbyproductid(int proudctid){
        return productDetailMapper.findproductdetailbyproductid(proudctid);
    }


}
