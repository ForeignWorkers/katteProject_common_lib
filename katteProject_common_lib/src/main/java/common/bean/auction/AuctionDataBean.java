package common.bean.auction;

import lombok.Data;

import java.util.Date;

@Data
public class AuctionDataBean {
        private int id;
        private int product_id;
        private Date auction_start_time;
        private String sale_period;
        private Date auction_end_time;
        private int auction_insert_term;
        private int start_price;
        private int current_price;
        private Integer instant_price;
        private Boolean is_instant_sale;
        private String auction_size_value;
        private Integer product_size_id;
        private Boolean is_settle_amount; //is_settle_amount bool : 낙찰 이후 판매자 금액 처리 정산 상태 true(정산됨) / false(정산되지 않음 기본값)
}




