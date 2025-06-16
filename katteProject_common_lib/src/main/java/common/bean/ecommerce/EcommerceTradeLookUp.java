package common.bean.ecommerce;

import lombok.Data;

import java.util.Date;

@Data
public class EcommerceTradeLookUp {
    private int product_id;
    private int final_price;
    private Date ordered_at;
}
