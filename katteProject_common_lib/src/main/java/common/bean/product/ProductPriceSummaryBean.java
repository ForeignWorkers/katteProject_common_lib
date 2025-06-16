package common.bean.product;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class ProductPriceSummaryBean {
    private Integer price;               // 최근 거래가
    private Integer previous_price;      // 직전 거래가

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    private Date previous_date;          // 직전 거래일

    private Integer diff_amount;         // 가격 차이
    private Double diff_percent;         // 변동률
    private Integer instant_price;       // 즉시 구매 최저가
}