package common.bean.ecommerce;

import lombok.Data;

import java.util.Date;

@Data
public class EcommerceCoupon {
    private int id;
    private String name;
    private String caution_desc;
    private String coupon_desc;
    private int sale_amount;
    private int coupon_expire_term;

    //개발에서 사용하기 위함
    private Date end_date;
}
