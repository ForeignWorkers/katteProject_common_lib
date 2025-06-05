package common.bean.admin;

import lombok.Data;

import java.util.Date;

@Data
public class RegisteredProductViewBean {
    private String product_name;         // 상품명
    private String shortform_title;      // 숏폼 타이틀
    private String seller_email;         // 판매자 이메일
    private Date check_start_day;        // 등록일
    private String sale_step;            // 판매 상태
}
