package common.bean.content;

import lombok.Data;

@Data
public class ContentShortBean {
    private int id;
    private int product_id;
    private int author_id;
    private int live_content_id;
    private String title;
    private String description;
    private int total_view;
    private int current_view_count;
    private int shortform_like_count;
    private String content_url;
}