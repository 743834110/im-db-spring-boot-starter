package xyz.berby.im;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

@EnableAutoConfiguration(exclude = ImDataBaseAutoConfigure.class)
@PropertySource("classpath:application.properties")
public class ImDataBaseAutoConfigure {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public static void main(String [] args) {
        new AnnotationConfigApplicationContext(ImDataBaseAutoConfigure.class);
    }
}
