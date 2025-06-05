package common.bean.admin;

import lombok.Data;

import java.util.Date;

@Data
public class InspectionProductViewBean {
    private String product_name;
    private String shortform_title;
    private String seller_email;
    private Date check_start_day;
    private String check_step;
}
