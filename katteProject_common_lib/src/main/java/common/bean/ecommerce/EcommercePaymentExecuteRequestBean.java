package common.bean.ecommerce;

import lombok.Data;

@Data

public class EcommercePaymentExecuteRequestBean {
    private int order_id;
    private int user_id;
    private int amount; // 결제 요청 시 클라이언트가 전달하는 실제 청구 금액.
}
