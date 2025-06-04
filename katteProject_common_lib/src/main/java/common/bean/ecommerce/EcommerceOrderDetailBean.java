package common.bean.ecommerce;

import lombok.Data;

@Data
public class EcommerceOrderDetailBean {
    private int order_id; // 주문 ID
    private int user_id; // 주문한 사용자 ID
    private int product_id; // 상품 ID
    private String product_name; // 상품 이름
    private int origin_price; // 할인 전 원가
    private int final_price; // 최종 결제 금액
    private OrderStatus order_status; // 주문 상태
    private String ordered_at; // 주문 일시

    public enum OrderStatus {
        payment_complete,
        shipping,
        delivered
    }
}
