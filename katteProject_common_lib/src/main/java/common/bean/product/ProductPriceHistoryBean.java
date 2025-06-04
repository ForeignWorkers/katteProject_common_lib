package common.bean.product;

import lombok.Data;

@Data

public class ProductPriceHistoryBean {
    private String date;     // 예: "2025-06-01"
    private int price;       // origin_price의 평균값
}
