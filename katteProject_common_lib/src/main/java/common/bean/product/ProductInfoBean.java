package common.bean.product;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ProductInfoBean {
    private int id;
    private int product_id;
    private Integer product_base_id;
    private String model_code;
    private String category;
    private String detail_category;
    private String product_name;
    private String product_name_kor;
    private String product_desc;
    private String brand_name;
    private LocalDateTime release_date;
    private Integer release_price;
}