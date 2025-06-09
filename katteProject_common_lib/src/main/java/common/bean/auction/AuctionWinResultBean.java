package common.bean.auction;

import lombok.Data;

@Data
public class AuctionWinResultBean {
    private int auction_data_id; // 낙찰 대상 경매 ID
    private int winner_user_id; // 최고 입찰자 ID
    private int result_price;
}
