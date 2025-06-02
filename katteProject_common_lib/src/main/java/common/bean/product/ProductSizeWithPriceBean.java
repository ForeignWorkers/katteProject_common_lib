package common.bean.product;

import lombok.Data;

@Data
public class ProductSizeWithPriceBean {
    private String auction_size_value; //from product_size테이블
    private Integer price; // from auction_data테이블(MIN(instant_price))
}
