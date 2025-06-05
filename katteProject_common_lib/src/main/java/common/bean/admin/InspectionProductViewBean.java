package common.bean.admin;

import lombok.Data;

import java.util.Date;

@Data
public class InspectionProductViewBean {
    private String product_name;
    private String shortform_title;
    private String seller_email;
    private Date check_start_day;
    private CheckStep check_step;

    public enum CheckStep {
        IN_PROGRESS, //검수중
        COMPLETED, //검수 완료
        RETURNED //상품이 반송처리됨
    }
}
