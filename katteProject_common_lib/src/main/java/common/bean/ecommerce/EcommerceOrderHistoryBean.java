package common.bean.ecommerce;

import lombok.Data;

import java.util.Date;

@Data
public class EcommerceOrderHistoryBean {
    private int order_id; // 주문 ID
    private int product_id; // 상품 ID
    private int origin_price; // 상품 금액
    private Date ordered_at; // 주문 일시
    private boolean is_buy_complete; // 구매 확정 여부
    private Date buy_complete_at; // 구매 확정 일시
}