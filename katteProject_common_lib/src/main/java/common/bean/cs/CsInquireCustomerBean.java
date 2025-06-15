package common.bean.cs;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class CsInquireCustomerBean {
    private int inquire_id;
    private int user_id;
    private Inquire_Category inquire_category;
    private String inquire_title;
    private String inquire_content;
    private LocalDateTime inquire_at;
    private Inquire_Status inquire_status;



    public enum Inquire_Category{
        ACCOUNT
        , ORDER
        , DELIVERY
        , CANCEL_REFUND
        , AUCTION
        , PRODUCT
        , SETTLEMENT
        , TECHNICAL
        , INAPPROPRIATE
        , ETC
    };


    public enum Inquire_Status{
        PENDING
        , ONGOING
        , COMPLETE
    };

}