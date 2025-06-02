package common.bean.cs;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CsReplyBean {

    private int reply_id;
    private int inquire_id;
    private LocalDateTime reply_at;
    private String reply_title;
    private String reply_content;

}
