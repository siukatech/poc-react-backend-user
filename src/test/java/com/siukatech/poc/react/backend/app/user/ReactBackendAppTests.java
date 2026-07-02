package com.siukatech.poc.react.backend.app.user;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

@SpringBootTest
class ReactBackendAppTests {

    protected static final org.slf4j.Logger log = LoggerFactory.getLogger(ReactBackendAppTests.class);

    @Autowired
    private ApplicationContext applicationContext;

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

    @BeforeAll
    public static void init() {
        final Logger rootLogger = (Logger) LoggerFactory.getLogger(Logger.ROOT_LOGGER_NAME);
//        rootLogger.setLevel(Level.ALL);
        rootLogger.setLevel(Level.DEBUG);

        log.debug("ReactBackendAppTests.init............");

    }

	@Test
	void contextLoads() {
        String[] beanDefinitionNames = this.applicationContext.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            log.debug("contextLoads - beanName: [{}]", beanName);
//            System.out.println("contextLoads - beanName: [%s]".formatted(beanName));
        }
	}

}
