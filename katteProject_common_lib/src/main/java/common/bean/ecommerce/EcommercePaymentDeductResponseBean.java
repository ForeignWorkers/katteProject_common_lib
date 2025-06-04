package common.bean.ecommerce;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EcommercePaymentDeductResponseBean {
    private int user_id; // 사용자 ID
    private int before_balance; // 차감 전 잔액
    private int after_balance; // 차감 후 잔액
    private Status status; // 처리 상태
    private String error_message; // 오류 메시지

    public enum Status {
        SUCCESS,
        FAIL
    }
}