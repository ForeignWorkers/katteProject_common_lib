package common.bean.content;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class ContentStyleBean {
    private int id;
    private String style_title;
    private int user_id;
    private String caption;
    private Date create_time;
    private List<String> hashtags;
    private int img_count = 1;
    private int like_count;

}
