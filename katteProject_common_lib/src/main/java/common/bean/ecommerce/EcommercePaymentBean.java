package common.bean.ecommerce;

import lombok.Data;

import java.util.Date;

@Data
public class EcommercePaymentBean {
    private int payment_id; // 결제 ID
    private int order_id; // 주문 ID
    private int user_id; // 사용자 ID
    private int amount; // 결제 금액
    private PaymentStatus status; // 결제 상태
    private Date paid_at; // 결제 일시

    public enum PaymentStatus {
        PENDING,
        PAID,
        FAIL
    }
}