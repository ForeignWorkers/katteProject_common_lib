package common.bean.admin;

import lombok.Data;

import java.util.Date;

@Data
public class SoldoutProductViewBean {
    private int order_id;            // 주문 ID
    private String buyer_email;      // 구매자 이메일
    private String product_name;     // 상품명
    // private String shortform_title; // 생략
    private int origin_price;        // 낙찰가
    private Date ordered_at;         // 주문일
    private int auction_data_id;     // 경매 데이터 ID
}
