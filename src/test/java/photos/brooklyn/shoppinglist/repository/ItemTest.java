package photos.brooklyn.shoppinglist.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import photos.brooklyn.shoppinglist.model.Item;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/spring/mongo.xml" })
public class ItemTest {
    @Autowired
    private ItemRepository repo;
    
    @Test
    public void testSave() {
        for(Item s : repo.findAll()) {
            System.out.println(s);
        }
    }
}
