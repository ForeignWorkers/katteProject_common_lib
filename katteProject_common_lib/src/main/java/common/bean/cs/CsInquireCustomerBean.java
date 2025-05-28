package common.bean.cs;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CsInquireCustomerBean {
    private int inquireId;
    private int userId;
    private InquireCategory inquirecategory;
    private String inquireTitle;
    private String inquireContent;
    private LocalDateTime inquireAt;
    private InquireStatus inquirestatus;
    private boolean isDeleted;



    public enum InquireCategory{
        ACCOUNT("계정/회원")
        , ORDER("주문/결제")
        , DELIVERY("배송")
        , CANCEL_REFUND("취소/환불")
        , AUCTION("경매/입찰")
        , PRODUCT("상품 정보")
        , SETTLEMENT("정산/수익")
        , TECHNICAL("웹 오류")
        , INAPPROPRIATE("부적절한 콘텐츠 신고")
        , ETC("기타");

        private String inKorean;

        InquireCategory(String inKorean){
            this.inKorean = inKorean;
        }

        public String getInKorean(){
            return inKorean;
        }

    };


    public enum InquireStatus{
        PENDING("접수")
        , ONGOING("처리 중")
        , COMPLETE("답변 완료")
        ;

        private String inKorean;

        InquireStatus(String inKorean){
            this.inKorean = inKorean;
        }

        public String getInKorean(){
            return inKorean;
        }

    };

}
