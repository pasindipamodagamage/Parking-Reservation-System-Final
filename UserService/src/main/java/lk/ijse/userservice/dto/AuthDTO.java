package lk.ijse.userservice.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class AuthDTO {
    private String email;
    private String password;
}
