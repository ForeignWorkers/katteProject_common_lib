package common.bean.product;

import lombok.Data;

@Data
public class ProductSizeBean {

    private int id;            // auto_increment PK
    private int product_id;     // 해당 상품 ID
    private String size_value;  // 사이즈 값

}