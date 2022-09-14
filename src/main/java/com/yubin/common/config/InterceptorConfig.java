package com.yubin.common.config;

import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class InterceptorConfig implements WebMvcConfigurer {



    /**
     * 资源映射到本地路径
     * @param registry
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/image/**")
                .addResourceLocations("file:E:\\Microsoft Visual Studio\\Desktop\\car-vue\\carrental-vue-yubin\\public\\image");
    }
}
