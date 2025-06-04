package common.bean.ecommerce;
import lombok.Data;

@Data

public class EcommercePaymentDeductRequestBean {
    private int user_id;    // 차감 대상 유저 ID
    private int amount;     // 차감할 금액
}
