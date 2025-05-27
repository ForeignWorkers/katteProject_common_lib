package common.bean;
import lombok.Data;

import java.util.Date;

@Data
public class UserBean {
    private int user_id;
    private String email_id;
    private String password;
    private String first_name;
    private String second_name;
    private String nickname;
    private String phone_number;
    private Date birth_date;
    private String introduce_desc;
    private String profile_url;
    private Date sign_up_time;
    private Boolean is_admin;
}
