package pl.altkom.springcloud.lab03.eureka.projectservice.client.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;

public class RequestHeaderCustomizerInterceptor implements RequestInterceptor {

    @Override
    public void apply(final RequestTemplate requestTemplate) {
        requestTemplate.header("system", "project");
    }
}
