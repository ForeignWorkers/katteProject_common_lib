package common.bean.cs;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CsFaqBean {

    private int faq_id;
    @CsvBindByName(column = "카테고리")
    private faq_category faq_category;
    @CsvBindByName(column = "제목")
    private String faq_title;
    @CsvBindByName(column = "내용")
    private String faq_content;
    private LocalDateTime created_at;



    public enum faq_category{
        TERM,
        GENERAL,
        BUY,
        SELL
    }

}