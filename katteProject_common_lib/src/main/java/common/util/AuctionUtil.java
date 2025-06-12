package common.util;

public class AuctionUtil {

    //가격에 따라 입찰단위 계산.
    public static int calculateAuctionInsertTerm(int price) {
        if (price < 50000) return 1000;
        if (price < 100000) return 5000;
        if (price < 300000) return 10000;
    return 20000;
    }
}
