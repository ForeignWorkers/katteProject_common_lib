package common.bean.product;

import lombok.Data;
import java.util.Date;
@Data
public class ProductInfoBean {
    private int id;
    private int product_id;
    private Integer product_base_id;
    private String model_code;
    private Category category;
    private String detail_category;
    private String product_name;
    private String product_name_kor;
    private String product_desc;
    private String brand_name;
    private Date release_date;
    private Integer release_price;

    public enum Category {
        신발("shoes"),
        상의("tops"),
        아우터("outer"),
        하의("pants"),
        가방("bag"),
        지갑("wallet"),
        시계("watch"),
        패션잡화("accessory"),
        컬렉터블("collectible"),
        뷰티("beauty"),
        테크("tech"),
        캠핑("camping");

        private final String dbValue;

        Category(String dbValue) {
            this.dbValue = dbValue;
        }

        public String getDbValue() {
            return dbValue;
        }

        public static Category fromDbValue(String dbValue) {
            for (Category c : values()) {
                if (c.name().equals(dbValue)) return c; // DB에 한글 저장 시
                if (c.dbValue.equalsIgnoreCase(dbValue)) return c; // DB에 영문 저장 시
            }
            throw new IllegalArgumentException("Unknown category: " + dbValue);
        }
    }
}