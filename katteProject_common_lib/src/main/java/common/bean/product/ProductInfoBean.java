package common.bean.product;

import lombok.Data;
import java.util.Date;

@Data
public class ProductInfoBean {
    private int id;
    private int product_id;
    private int product_base_id;
    private String model_code;
    private Category category;
    private String product_name;
    private String product_desc;
    private String brand_name;
    private Date release_date;
    private int release_price;

    public enum Category{
        shoes, clothing, bag, accessory, electronics, beauty, lifestyle, collectible, etc
    }
}
