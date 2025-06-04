package common.bean.ecommerce;

import lombok.Data;

@Data
public class EcommercePaymentExecuteResponseBean {
    private int payment_id; // 결제 ID
    private Status status; // 결제 결과 상태

    public enum Status {
        paid,
        fail
    }
}