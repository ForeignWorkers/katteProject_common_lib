package common.bean.user;

import lombok.Data;
import java.util.Date;

@Data
public class UserBanBean {
    private int id;//pk
    private int user_id;//정지된 유저의 ID
    private Date ban_start;//정지 시작일
}
