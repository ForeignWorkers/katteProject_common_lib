package common.bean.cs;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class CsInquireCustomerBean {
    private int inquireId;
    private int userId;
    private InquireCategory inquireCategory;
    private String inquireTitle;
    private String inquireContent;
    private LocalDateTime inquireAt;
    private InquireStatus inquireStatus;
    private boolean isDeleted;



    public enum InquireCategory{
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


    public enum InquireStatus{
        PENDING
        , ONGOING
        , COMPLETE;
    };

}
