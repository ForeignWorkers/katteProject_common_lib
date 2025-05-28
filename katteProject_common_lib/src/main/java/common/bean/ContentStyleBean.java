package common.bean;

import lombok.Data;

import java.util.Date;

@Data
public class ContentStyleBean {
    private int id;
    private String style_title;
    private int user_id;
    private String caption;
    private Date create_time;
}
