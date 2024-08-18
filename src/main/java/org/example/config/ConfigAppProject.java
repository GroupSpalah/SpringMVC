package org.example.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = {
        "org.example.dao",
        "org.example.service",
        "org.example.controllers",
        "org.example.handlers"

})
//@EnableWebMvc
@EnableTransactionManagement
@EnableAspectJAutoProxy(proxyTargetClass = true)
@EnableJpaRepositories(basePackages = "org.example.repository")
public class ConfigAppProject {

    @Bean
    public JpaTransactionManager transactionManager(EntityManagerFactory factory) {
        JpaTransactionManager manager = new JpaTransactionManager();

        manager.setEntityManagerFactory(factory);
        manager.setDataSource(dataSource());
        return manager;
    }

    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("Suntour123");
        dataSource.setUrl("jdbc:mysql://localhost:3306/group_mvc?serverTimezone=UTC");
        return dataSource;
    }

    @Bean
    public JpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        adapter.setDatabase(Database.MYSQL);
        adapter.setShowSql(true);
        adapter.setDatabasePlatform("org.hibernate.dialect.MySQL8Dialect");
        adapter.setGenerateDdl(true);
        return adapter;
    }

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean emfb = new LocalContainerEntityManagerFactoryBean();

        emfb.setDataSource(dataSource());
        emfb.setJpaVendorAdapter(jpaVendorAdapter());
        emfb.setPackagesToScan("org.example.domain");

        return emfb;
    }
}

