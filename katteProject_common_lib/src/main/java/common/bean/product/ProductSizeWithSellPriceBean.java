package common.bean.product;

import lombok.Data;

@Data
public class ProductSizeWithSellPriceBean {
    private String auction_size_value;  // 예: "260", "270"
    private Integer price;              // 해당 사이즈의 최저 판매가
}