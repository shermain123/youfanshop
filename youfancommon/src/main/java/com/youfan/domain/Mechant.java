package com.youfan.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by youfan on 2018/6/8 0008.
 */

@Getter
@Setter
public class Mechant {
    private int id;
    private String merchantname;
    private String merchantshopname;
    private String merchantaccount;
    private String mechantpassword;
    private String mechantscope;
    private int auditstatus;//1提交成功，2审核通过，3审核不通过
    private int soldout;//1,正常，2,下架


}
