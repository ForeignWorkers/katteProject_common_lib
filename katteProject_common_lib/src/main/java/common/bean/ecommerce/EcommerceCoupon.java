package common.bean.ecommerce;

import lombok.Data;

@Data
public class EcommerceCoupon {
    private int id;
    private String name;
    private String caution_desc;
    private String desc;
    private int sale_amount;
    private int coupon_expire_term;
}
