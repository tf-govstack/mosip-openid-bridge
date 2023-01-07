package io.mosip.kernel.openid.bridge.dto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class AccessTokenResponseDTO {
	private String accessToken;
	private String expiresIn;
	private String idToken;
}