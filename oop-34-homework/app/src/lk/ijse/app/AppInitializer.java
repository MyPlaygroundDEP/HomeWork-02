package lk.ijse.app;
import com.spring.security.api.*;
import com.netflix.ribbon.api.*;
import com.netflix.zuul.service.ApiGateway;

public class AppInitializer {
    ApiGateway apiGateway;
    SecurityFilterChain securityFilterChain ;
    RibbonService ribbonService;

}
