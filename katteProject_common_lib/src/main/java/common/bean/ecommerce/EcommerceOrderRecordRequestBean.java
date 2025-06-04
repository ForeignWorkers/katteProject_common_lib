package common.bean.ecommerce;

import lombok.Data;

import java.util.Date;

@Data
public class EcommerceOrderRecordRequestBean {
    private int order_id; // 주문 ID
    private int user_id; // 사용자 ID
    private int product_id; // 상품 ID
    private int origin_price; // 상품 원가
    private int final_price; // 최종 결제 금액
    private int address_key; // 배송지 키
    private Integer used_katte_id; // 사용한 예수금 ID
    private Integer used_point_id; // 사용한 포인트 ID
    private Integer used_coupon_id; // 사용한 쿠폰 ID
    private OrderStatus order_status; // 주문 상태
    private int terms_id; // 동의한 약관 ID
    private Date ordered_at; // 주문 일시

    public enum OrderStatus {
        payment_complete,
        shipping,
        delivered
    }
}