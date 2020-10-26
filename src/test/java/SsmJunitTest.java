import com.javakc.ssm.user.entity.User;
import com.javakc.ssm.user.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class SsmJunitTest {

    @Autowired
    private UserService userService;

    @Test
    public void insert()
    {
        User entity= new User();
        entity.setName("name1");
        entity.setAge(22);
        entity.setGender(1);
        entity.setPhone("17725545901");
        entity.setBirthday(new Date());
        entity.setAddress("北京海淀");
        userService.insert(entity);
    }
    @Test
    public void update()
    {
        User entity= new User();
        entity.setName("name");
        entity.setId(1);
        userService.update(entity);
    }

    @Test
    public void delete()
    {
        userService.delete(2);
    }

    @Test
    public void queryAll()
    {
      List<User> list= userService.queryAll();
      list.forEach(user ->{
          System.out.println(user);
      });

    }


    @Test
    public void queryByCount()
    {
        long count=userService.queryByCount();
        System.out.println(count);
    }

    @Test
    public void queryById()
    {
       User user= userService.queryById(1);
        System.out.println(user);
    }
}
