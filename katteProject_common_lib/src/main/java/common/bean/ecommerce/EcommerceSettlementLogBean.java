package common.bean.ecommerce;

import lombok.Data;

import java.util.Date;

@Data
public class EcommerceSettlementLogBean {
    private int id;                //PK
    private int auction_id;       //정산 대상 경매 ID
    private int seller_id;        //판매자 ID
    private int final_price;      //낙찰가
    private int reward_amount;    //판매자에게 지급된 금액 (낙찰가 - 수수료)
    private float fee_rate;       //수수료율(기본 0.1)
    private Date settle_time;     //정산 완료 시간
}
