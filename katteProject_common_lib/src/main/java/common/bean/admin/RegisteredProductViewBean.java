package common.bean.admin;

import lombok.Data;

import java.util.Date;

@Data
public class RegisteredProductViewBean {
    private int per_sale_id;                // 상품 주문 번호
    private String product_name;            // 상품명
    private String shortform_title;         // 숏폼 타이틀
    private String seller_email;            // 판매자 이메일
    private Date check_start_day;           // 등록일
    private SaleStep sale_step;             // 판매 상태

    private int start_price;                // 시작가 (등록가격)
    private Integer instant_price;          // 즉시구매가 (nullable)
    private Integer current_price;          // 현재 경매가 (nullable, 경매 진행 중일 때만 표시)
    private Date auction_end_time;          // 경매 종료일 (nullable, ON_SALE일 때만 표시)       // 판매 상태
    private int auction_data_id;            // 옥션 idprivate int auction_data_id;            // 옥션 id

    public enum SaleStep {
        INSPECTION, // 검수 진행 중(등록~검수중)
        INSPECTION_FAIL, // 검수 실패(검수 끝났을때 실패 - returned) -> 검수 실패 시 해당 판매 등록 정보는 실패 기점으로 3일 후에 판매 등록 데이터 제거 됨
        ON_SALE, // 판매중(검수 끝났을때 성공 - completed)
        EXPIRED, // 등록 기간 만료(한명도 입찰 또는 구매하지 않고 auction_end_time 종료 시 해당 상태가 된 후 3일 후에 판매 등록 데이터 제거 됨)
        SOLD_OUT // 판매 완료 -> 해당 상태일 경우 판매 완료 목록으로 이동(판매 완료 내역 목록 분류 상품명/낙찰가(판매 완료 시점 가격 확인하면 될듯)/구매자/낙찰일(이것도 딱히 컬럼은 없는듯 어떻게 끌어올지 생각)/정산상태(컬럼이 없음))
    }
}
