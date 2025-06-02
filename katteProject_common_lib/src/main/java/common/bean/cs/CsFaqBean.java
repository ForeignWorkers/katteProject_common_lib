package common.bean.cs;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CsFaqBean {

    private int faq_id;
    private faq_category faq_category;
    private String faq_title;
    private String faq_content;
    private LocalDateTime created_at;



    public enum faq_category{
        TERM,
        GENERAL,
        BUY,
        SELL
    }

}