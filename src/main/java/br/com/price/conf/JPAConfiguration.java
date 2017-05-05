package br.com.price.conf;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@EnableTransactionManagement
public class JPAConfiguration {
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
		LocalContainerEntityManagerFactoryBean factoryBean =
				new LocalContainerEntityManagerFactoryBean();
		
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		factoryBean.setJpaVendorAdapter(vendorAdapter);
		
		//Trecho de configuração para usar DB MySQL
		/*
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("root");
		dataSource.setPassword("divino");
		dataSource.setUrl("jdbc:mysql://localhost:3306/price");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");*/
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUsername("SA");
		dataSource.setPassword("");
		dataSource.setUrl("jdbc:hsqldb:file:C:/banco/price;hsqldb.lock_file=false");
		dataSource.setDriverClassName("org.hsqldb.jdbcDriver");
		factoryBean.setDataSource(dataSource);
		Properties props = new Properties();
		props.setProperty("hibernate.dialect", "org.hibernate.dialect.HSQLDialect");
		props.setProperty("hibernate.show_sql", "true");
		props.setProperty("hibernate.hbm2ddl.auto", "update");
		factoryBean.setJpaProperties(props);
		factoryBean.setPackagesToScan("br.com.price.model");
		return factoryBean;
	}
	
	@Bean
	public JpaTransactionManager transactionManager(EntityManagerFactory emf){
		return new JpaTransactionManager(emf);		
	}

}
