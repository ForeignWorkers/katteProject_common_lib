package common.bean.cs;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CsStandardBean {

    private int standard_id;
    private standard_category standard_category;
    private String standard_content;
    private LocalDateTime create_at;



    public enum standard_category{
        SHOES,
        CLOTHES,
        BAG,
        ETC
    }

}
