package common.bean.content;

import lombok.Data;

@Data
public class ContentStyleProductJoinBean {
    private int brand_id;
    private String brand_name;
    private String brand_desc;
    private String brand_icon_url;
    private int brand_like_count;
    private LocalDateTime created_at;
}
