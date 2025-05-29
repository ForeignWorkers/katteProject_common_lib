package common.bean.auction;

import lombok.Data;

import java.util.Date;

@Data
public class AuctionBidLog {
    private int id;
    private int user_id;
    private int auction_id;
    private Date bid_take_time;
    private int bid_price;
    private Date bid_limit_time;
}
