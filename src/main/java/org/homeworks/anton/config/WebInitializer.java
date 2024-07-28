package org.homeworks.anton.config;


import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebInitializer
     extends AbstractAnnotationConfigDispatcherServletInitializer {
        @Override
        protected Class<?>[] getRootConfigClasses() {
            return new Class[0];
        }

        @Override
        protected Class<?>[] getServletConfigClasses() {
            return new Class[]{ConfigApp.class};
        }

        @Override
        protected String[] getServletMappings() {
            return new String[]{"/mvc/*"};
        }
}