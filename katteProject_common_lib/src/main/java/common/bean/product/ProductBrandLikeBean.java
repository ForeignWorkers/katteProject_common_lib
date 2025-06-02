package common.bean.product;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class ProductBrandLikeBean {
    private Integer brand_id;
    private Integer user_id;
    private LocalDateTime created_at;
}
