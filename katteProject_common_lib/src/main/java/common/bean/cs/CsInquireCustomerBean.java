package common.bean.cs;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class CsInquireCustomerBean {
    private int inquire_id;
    private int user_id;
    private inquire_category inquire_category;
    private String inquire_title;
    private String inquire_content;
    private LocalDateTime inquire_at;
    private inquire_status inquire_status;
    private boolean is_deleted;



    public enum inquire_category{
        ACCOUNT
        , ORDER
        , DELIVERY
        , CANCEL_REFUND
        , AUCTION
        , PRODUCT
        , SETTLEMENT
        , TECHNICAL
        , INAPPROPRIATE
        , ETC;
    };


    public enum inquire_status{
        PENDING
        , ONGOING
        , COMPLETE;
    };

}
