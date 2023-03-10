// package com.poser_db.datasource;

// import javax.sql.DataSource;

// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.boot.jdbc.DataSourceBuilder;
// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.context.annotation.Primary;

// import com.zaxxer.hikari.HikariDataSource;

// @Configuration
// public class MongoDatasource {
    
//     @Bean
//     @Primary
//     @ConfigurationProperties(prefix = "app.datasource")
//     public DataSource hikariDataSource()
//     {
//         return DataSourceBuilder.create().build();
//         // return DataSourceBuilder.create().type(HikariDataSource.class).build();
//     }

// }
