package common.bean.product;
import lombok.Data;

@Data
public class ProductPerSaleBean {
    private int id;             // auto_id
    private int sale_user_id;     // 판매자 ID (user.info 참조)
    private int product_id;      // 상품 ID (product.info 참조)
    private int shortform_id;    // 숏폼 ID (content.shortform 참조)
    private int auction_data_id;      // 경매 ID (auction_data 참조)
}
