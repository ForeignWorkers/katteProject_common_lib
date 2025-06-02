package common.bean.product;

import lombok.Data;

@Data
public class ProductBrandBean {
    private int id;                // auto_increment PK
    private String brand_name;     // 브랜드명 (unique)
    private String brand_desc;     // 브랜드 설명
    private String brand_icon_url;  // 브랜드 아이콘 URL
}