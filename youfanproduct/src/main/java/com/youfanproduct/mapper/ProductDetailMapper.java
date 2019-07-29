package com.youfanproduct.mapper;



import com.youfan.domain.ProductDetail;

import java.util.List;

/**
 * Created by Administrator on 2018/6/18 0018.
 */
public interface ProductDetailMapper {
    public int insertProductDetail(ProductDetail productDetail);

    public ProductDetail findproductdetailbyproductid(int proudctid);
}
