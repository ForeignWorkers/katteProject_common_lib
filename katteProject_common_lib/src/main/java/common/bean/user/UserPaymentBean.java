package common.bean.user;

import lombok.Data;

@Data
public class UserPaymentBean {
    private int user_id;
    private int point;
    private int katte_money;
    private int locked_deposit_katte_money;

}
