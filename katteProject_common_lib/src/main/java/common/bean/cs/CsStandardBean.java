package common.bean.cs;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CsStandardBean {

    private int standard_id;
    private Standard_Category standard_category;
    private String standard_content;
    private LocalDateTime create_at;



    public enum Standard_Category{
        SHOES,
        CLOTHES,
        BAG,
        ETC
    }

}
