package com.youfanproduct.service;


import com.youfan.domain.Product;
import com.youfanproduct.dao.ProductDao;
import com.youfanproduct.utils.SolrUtil;
import com.youfanproduct.vo.ProductVo;
import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrServerException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.*;

/**
 * Created by Administrator on 2018/6/18 0018.
 */
@Service
public class ProductService {
    @Autowired
    ProductDao productDao;

    @Autowired
    private SolrClient client;

    public void insertProduct(Product product){
        try {
            int id = productDao.insertProduct(product);
            Map<String, Object> mapValue = new HashMap<String,Object>();
            mapValue.put("id",product.getId());
            mapValue.put("producttitle",product.getProducttitle());
            SolrUtil.addIndex2(client,mapValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void auditProduct(int id,int auditstate){
        Product product = new Product();
        product.setId(id);
        product.setAuditstate(auditstate);
        product.setAudittime(new Date());
        productDao.auditProduct(product);
    }


    public Product findproductbyid(int id){
        return productDao.findproductbyid(id);
    }


    public void upateProduct(Product product){
        productDao.upateProduct(product);
    }
    public void deleteProductbyid(int id){
        productDao.deleteProductbyid(id);
    }
    public List<Product> queryProductbyvo(ProductVo productVo){
        return productDao.queryProductbyvo(productVo);
    }

    public void upateProductbyproductstatus(int id,int proudctstatus){
        Product product = new Product();
        product.setId(id);
        product.setProudctstatus(proudctstatus);
        productDao.upateProductbyproductstatus(product);
    }

    public List<Product> queryProductbyids(String keyword){
        List<String> ids = null;
        try {
            ids = SolrUtil.searchqyinfofromsolr(client,keyword);
        } catch (SolrServerException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(ids == null||ids.size()==0){
            ids = null;
        }
        return productDao.queryProductbyids(ids);
    }
}
