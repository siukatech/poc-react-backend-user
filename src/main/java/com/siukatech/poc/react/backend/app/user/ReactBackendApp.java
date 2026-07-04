package com.siukatech.poc.react.backend.app.user;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class ReactBackendApp {

    public static void main(String[] args) {
        SpringApplication.run(ReactBackendApp.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void printRegisteredBeans(ApplicationReadyEvent event) {
        ApplicationContext context = event.getApplicationContext();
        String[] beanNames = context.getBeanDefinitionNames();

        // Sort alphabetically to make it easier to search
        Arrays.sort(beanNames);

        log.info("printRegisteredBeans - ============== REGISTERED BEANS COUNT: {} ==============", beanNames.length);
        for (String beanName : beanNames) {
            // Check the class type of the bean
            try {
                Object beanInstance = context.getBean(beanName);
                log.info("printRegisteredBeans - Bean Name: [{}] ----> Class: [{}]", beanName, beanInstance.getClass().getName());
            }
            catch (Exception e) {
                log.info("printRegisteredBeans - Bean Name: [{}] ----> Exception: [{}]", beanName, e.getMessage());
            }
        }
        log.info("printRegisteredBeans - =======================================================");
    }

}
