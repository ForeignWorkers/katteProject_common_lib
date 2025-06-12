package common.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class NicknameGenerator {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int RANDOM_LENGTH = 6;

    // 랜덤 문자열 생성
    public static String generateRandomString(String baseNickname) {
        String today = new SimpleDateFormat("yyMMdd").format(new Date());
        Random random = new Random();
        StringBuilder sb = new StringBuilder(RANDOM_LENGTH);
        for (int i = 0; i < RANDOM_LENGTH; i++) {
            sb.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }

        return today + "_" + sb.toString() + "_" + baseNickname;
    }
}