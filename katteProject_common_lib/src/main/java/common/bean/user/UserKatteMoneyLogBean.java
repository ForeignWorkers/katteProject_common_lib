package common.bean.user;

import lombok.Data;

import java.util.Date;

@Data
public class UserKatteMoneyLogBean {
    private int id;
    private int user_id;
    private int change_mount;
    private reason reason;
    private Date created_at;

    public enum reason {
        CHARGE, USED, REFUNDED
    }
}
