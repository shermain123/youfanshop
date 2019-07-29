package com.youfanproduct.control;


import com.youfan.domain.ProductDetail;
import com.youfanproduct.service.ProductDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/6/18 0018.
 */
@RestController
public class ProductdetailoutControl {
    @Autowired
    ProductDetailService productDetailService;

    @RequestMapping(value = "/insertProductoutDetail",method = RequestMethod.POST)
    public void insertProduct(@RequestBody ProductDetail productDetail){
        productDetailService.insertProduct(productDetail);
    }

    @RequestMapping(value = "/findproductdetailbyproductid",method = RequestMethod.POST)
    public ProductDetail findproductdetailbyproductid(@RequestParam int proudctid){
       return productDetailService.findproductdetailbyproductid(proudctid);
    }

}
