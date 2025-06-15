package common.bean.cs;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CsFaqBean {

    private int faq_id;
    private Faq_Category faq_category;
    private String faq_title;
    private String faq_content;
    private LocalDateTime created_at;



    public enum Faq_Category{
        TERM,
        GENERAL,
        BUY,
        SELL
    }

}