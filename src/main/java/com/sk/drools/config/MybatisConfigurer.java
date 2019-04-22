package com.sk.drools.config;


import com.github.pagehelper.PageHelper;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
public class MybatisConfigurer {

    private static final String BASE_PACKAGE = "com.sk.drools";
    private static final String MODEL_PACKAGE = BASE_PACKAGE + ".entity";
    private static final String MAPPER_PACKAGE = BASE_PACKAGE + ".dao";
    private static final String MAPPER_INTERFACE_REFERENCE = BASE_PACKAGE + ".utils.Mapper";

    @Bean
    public SqlSessionFactory sqlSessionFactoryBean(DataSource dataSource) throws Exception{
        SqlSessionFactoryBean factory = new SqlSessionFactoryBean();
        factory.setDataSource(dataSource);
        factory.setTypeAliasesPackage(BASE_PACKAGE);

        PageHelper pageHelper = new PageHelper();
        Properties properties =  new Properties();
        properties.setProperty("pageSizeZero","true");
        properties.setProperty("reasonable","true");
        properties.setProperty("supportMethodsArguments","true");
        pageHelper.setProperties(properties);

        factory.setPlugins(new Interceptor[]{pageHelper});

        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factory.setMapperLocations(resolver.getResources("classpath:mapper/*.xml"));
        return factory.getObject();

    }

    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactoryBean");
        mapperScannerConfigurer.setBasePackage(MAPPER_PACKAGE);

        Properties properties = new Properties();
        properties.setProperty("mappers",MAPPER_INTERFACE_REFERENCE);
        properties.setProperty("notEmpty","false");
        properties.setProperty("IDENTITY","MYSQL");
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }

}
