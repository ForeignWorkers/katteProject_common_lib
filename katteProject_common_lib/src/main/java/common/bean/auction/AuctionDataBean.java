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
        private int product_size_id;
}




