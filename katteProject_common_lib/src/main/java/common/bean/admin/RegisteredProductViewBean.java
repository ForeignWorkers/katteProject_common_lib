package common.bean.admin;

import lombok.Data;

import java.util.Date;

@Data
public class RegisteredProductViewBean {
    private String product_name;         // 상품명
    private String shortform_title;      // 숏폼 타이틀
    private String seller_email;         // 판매자 이메일
    private Date check_start_day;        // 등록일
    private SaleStep sale_step;            // 판매 상태

    public enum SaleStep {
        inspection, // 검수 진행 중(등록~검수중)
        inspection_fail, // 검수 실패(검수 끝났을때 실패 - returned) -> 검수 실패 시 해당 판매 등록 정보는 실패 기점으로 3일 후에 판매 등록 데이터 제거 됨
        on_sale, // 판매중(검수 끝났을때 성공 - completed)
        expired, // 등록 기간 만료(한명도 입찰 또는 구매하지 않고 auction_end_time 종료 시 해당 상태가 된 후 3일 후에 판매 등록 데이터 제거 됨)
        sold_out // 판매 완료 -> 해당 상태일 경우 판매 완료 목록으로 이동(판매 완료 내역 목록 분류 상품명/낙찰가(판매 완료 시점 가격 확인하면 될듯)/구매자/낙찰일(이것도 딱히 컬럼은 없는듯 어떻게 끌어올지 생각)/정산상태(컬럼이 없음))
    }
}
