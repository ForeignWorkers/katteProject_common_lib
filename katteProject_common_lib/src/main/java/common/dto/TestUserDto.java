package common.dto;

import lombok.Data;

@Data
public class TestUserDto {
    public int id;
    public String name;
    public String password;
    public String phone;
    public String email;
}
