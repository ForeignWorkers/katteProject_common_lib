package common.bean.auction;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import java.time.LocalDateTime;

@Data
public class AuctionBean {
        @Schema(description = "경매 데이터 고유 ID", example = "1", accessMode = Schema.AccessMode.READ_ONLY)
        private int id;

        @Schema(description = "상품 ID (product_per_sale의 product_id)", example = "1010101", required = true)
        private int product_id;

        @Schema(description = "경매 시작 시간 (서버에서 자동 설정)", example = "2025-05-29T12:00:00", accessMode = Schema.AccessMode.READ_ONLY)
        private LocalDateTime auction_start_time;

        @Schema(description = "판매 기간 (일 단위, 3/5/7 중 선택)", example = "5", required = true)
        private String sale_period;

        @Schema(description = "경매 종료 시간 (서버에서 salePeriod 기준 자동 설정)", example = "2025-06-03T12:00:00", accessMode = Schema.AccessMode.READ_ONLY)
        private LocalDateTime auction_end_time;

        @Schema(description = "최소 입찰 단위 (서버에서 currentPrice 기준 자동 설정)", example = "10000", accessMode = Schema.AccessMode.READ_ONLY)
        private int auction_insert_term;

        @Schema(description = "경매 시작 가격", example = "150000", required = true)
        private int start_price;

        @Schema(description = "현재 가격 (초기값은 시작 가격과 동일)", example = "150000", accessMode = Schema.AccessMode.READ_ONLY)
        private int current_price;

        @Schema(description = "즉시 구매가 (isInstantSale이 true일 경우 필수)", example = "200000", required = false)
        private Integer instant_price;

        @Schema(description = "즉시 구매 여부", example = "true", required = true)
        private Boolean is_instant_sale;
}




