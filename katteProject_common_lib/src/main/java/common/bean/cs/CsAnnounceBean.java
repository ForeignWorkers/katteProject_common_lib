package common.bean.cs;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class CsAnnounceBean {
    private int announce_id;
    private announce_category announce_category;
    private String announce_title;
    private String announce_content;
    private LocalDateTime announce_at;

    public static enum announce_category {
        ANNOUNCE
        , EVENT
        , ETC;
    };

}