package common.bean.product;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class ProductCheckResultBean {
    private int id;                  // auto_id (PK)
    private int per_sale_id;          // 연결된 per_sale.id
    private int request_user_id;      // 검수 요청자 (user.info.id)
    private int check_user_id;        // 검수 담당자 (user.info.id)
    private String check_desc;       // 검수 설명
    private Date check_start_day;  // 검수 시작일
    private Date checkEndDay;    // 검수 종료일

    private String check_step;       // 검수 단계 enum (e.g., watting, in_progress, completed, returned, cancelled)
    private String sale_step;        // 판매 상태 enum (e.g., inspection, inspection_pass, inspection_fail, on_sale, expired, sold_out)

    public enum CheckStep {
        WAITING,
        IN_PROGRESS,
        COMPLETED,
        RETURNED,
        CANCELLED
    }
}