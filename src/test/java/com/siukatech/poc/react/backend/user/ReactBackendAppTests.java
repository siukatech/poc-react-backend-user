package com.siukatech.poc.react.backend.user;

import com.siukatech.poc.react.backend.module.core.web.advice.mapper.ProblemDetailExtMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.security.oauth2.client.OAuth2ClientProperties;
import org.springframework.boot.autoconfigure.security.oauth2.resource.OAuth2ResourceServerProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@SpringBootTest
class ReactBackendAppTests {

	@MockitoBean
	private InMemoryClientRegistrationRepository clientRegistrationRepository;

	// After moving the following WebSecurityConfig Components from constructor to filterChain,
	// they are no longer required to mark as MockBean or MockitoBean
//	@MockitoBean
//	private OAuth2ClientProperties oAuth2ClientProperties;
//	@MockitoBean
//	private OAuth2ResourceServerProperties oAuth2ResourceServerProperties;
//	@MockitoBean
//	private JwtDecoder jwtDecoder;
//	@MockitoBean
//	private ProblemDetailExtMapper problemDetailExtMapper;

	@Test
	void contextLoads() {
	}

}
