import base.BaseTest;
import com.guru.github.spring.demo.po.Account;
import com.guru.github.spring.demo.service.IAccountService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

public class AccountServiceTest extends BaseTest {

    @Autowired
    @Qualifier("proxyService")
    private IAccountService accountService;

    @Test
    public void testTransfer(){
        accountService.transfer("张三","李四",500);
    }

    @Test
    public void testFindAll(){
        List<Account> list = accountService.findAll();
        for (Account account : list) {
            System.out.println(account.toString());
        }
    }

}
