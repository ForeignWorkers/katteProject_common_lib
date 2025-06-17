package common.bean.product;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class ProductKatteRecommendBean {
    private int product_id;
    private String product_name;
    private String brand_name;
    private String shortform_content_url;
    private int like_count; 
}
