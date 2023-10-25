package net.nvsoftware.OrderService;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@EnableConfigurationProperties
@AutoConfigureMockMvc
@ContextConfiguration(classes = OrderServiceTestConfig.class)
public class OrderControllerTest {
//    @Bean
//    public  ServiceInstanceListSupplierTest supplierTest() {
//        return new ServiceInstanceListSupplierTest();
//    }
}
