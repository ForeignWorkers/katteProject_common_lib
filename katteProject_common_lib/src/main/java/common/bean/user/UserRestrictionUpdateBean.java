package common.bean.user;

import lombok.Data;

@Data
public class UserRestrictionUpdateBean {
    private int stop_days; //수정할 제한 기간(일수)
}
