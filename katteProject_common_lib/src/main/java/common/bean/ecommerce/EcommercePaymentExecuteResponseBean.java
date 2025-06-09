package common.bean.ecommerce;

import lombok.Data;

@Data
public class EcommercePaymentExecuteResponseBean {
    private int payment_id; // 결제 ID
    private Integer auction_id; // 경매 기반 주문일 경우 경매 ID
    private Status status; // 결제 결과 상태

    public enum Status {
        PAID,
        FAIL
    }

}