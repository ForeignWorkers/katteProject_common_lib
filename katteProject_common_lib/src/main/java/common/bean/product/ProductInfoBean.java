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
        악세사리("accessory"),
        콜렉터("collectible"),
        뷰티("beauty"),
        전자("tech"),
        캠핑("camping"),
        가구리빙("furniture_living");

        private final String dbValue;

        Category(String dbValue) {
            this.dbValue = dbValue;
        }

        public String getDbValue() {
            return dbValue;
        }

        public static Category fromDbValue(String dbValue) {
            for (Category c : values()) {
                // ✅ Enum 이름으로 매핑
                if (c.name().equalsIgnoreCase(dbValue)) {
                    return c;
                }

                // ✅ dbValue로 매핑
                if (c.getDbValue().equalsIgnoreCase(dbValue)) {
                    return c;
                }
            }

            // 예외 처리
            if ("가구/리빙".equals(dbValue)) {
                return 가구리빙;
            }

            throw new IllegalArgumentException("Unknown category: " + dbValue);
        }
    }
}