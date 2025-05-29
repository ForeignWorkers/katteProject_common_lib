package common.bean.user;

import lombok.Data;

@Data
public class UserKatteMoneyRefundBean {
    private int id;
    private int user_id;
    private int amount;
    private int account_number;
    private String bank_type;
    private status status;

    public enum status {
        REQUESTED, PROCESSING, COMPLETED
    }
}
