import com.pochit.dao.Config;
import com.pochit.dao.ConfigJDBCTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by emilianoalbiani on 4/27/17.
 */
public class TestConfigDAO {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ConfigJDBCTemplate configDAO =
                (ConfigJDBCTemplate)context.getBean("configDAO");

        Config config = configDAO.getConfig("emiliano");
        System.out.println("FirsName:" + config.getFirstNanme() + " to number:" + config.getToNumber() );


    }
}
