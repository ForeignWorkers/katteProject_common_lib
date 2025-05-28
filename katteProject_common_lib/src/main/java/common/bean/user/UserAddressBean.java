package common.bean.user;

import lombok.Data;

@Data
public class UserAddressBean {
    private int id;
    private int user_id;
    private String name;
    private String phone_number;
    private String address_line01;
    private String address_line02;
    private Boolean is_main;
}
