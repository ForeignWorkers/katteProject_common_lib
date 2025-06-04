package common.bean.admin;

import lombok.Data;

import java.util.Date;

@Data
public class UserAdminViewBean {
    private int user_id;
    private String nickname;
    private String email_id;
    private Date registration_date;
    private int style_count; //스타일 개수
    private int comment_count; //댓글 개수
    private String restriction_status; //댓글 작성 제한 n일, 판매 제한 n일
    private String ban_status; //계정 정지 or 정상
}
