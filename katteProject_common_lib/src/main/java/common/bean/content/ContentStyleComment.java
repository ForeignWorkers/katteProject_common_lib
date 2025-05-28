package common.bean.content;

import lombok.Data;

import java.util.Date;

@Data
public class ContentStyleComment {
    private int id;
    private int style_id;
    private int user_id;
    private int recomment_id;
    private String content;
    private Date create_at;
}
