package common.bean.ecommerce;

import lombok.Data;

import java.util.Date;

@Data
public class EcommerceCouponHistory {
    private int id;
    private int coupon_id;
    private int user_id;
    private Date coupon_use_date;
    private Date start_date;
    private Date end_date;
}
