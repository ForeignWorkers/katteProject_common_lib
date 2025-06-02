package common.bean.ecommerce;

import lombok.Data;

import java.util.Date;

@Data
public class EcommerceOrderBean {

    private int order_id;                  // 주문 고유 ID (PK)
    private int user_id;                   // 구매자 ID
    private int product_id;                // 주문한 제품 ID
    private int origin_price;              // 할인 전 가격
    private int final_price;               // 최종 결제 금액
    private int address_key;               // 배송 주소 ID
    private int used_katte_id;             // 사용한 캇테머니 로그 ID
    private int used_point_id;             // 사용한 포인트 로그 ID
    private int used_coupon_id;            // 사용한 쿠폰 내역 ID
    private String order_status;           // 주문 상태 (ENUM: payment_complete, shipping, delivered)
    private Date ordered_at;               // 주문 시간
    private int terms_id;                  // 구매 약관 ID

}
