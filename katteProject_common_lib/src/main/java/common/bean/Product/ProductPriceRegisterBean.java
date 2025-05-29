package common.bean.Product;


import lombok.Data;

@Data
public class ProductPriceRegisterBean {
    private int startPrice; // 경매 시작가
    private boolean isInstantSale; //즉시 구매 여부
    private Integer instantPrice; //즉시 구매가 선택사항
    private String salePeriod; //판매기간 일수
}