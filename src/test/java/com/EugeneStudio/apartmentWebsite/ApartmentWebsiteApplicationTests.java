package com.EugeneStudio.apartmentWebsite;

import com.fasterxml.jackson.databind.deser.Deserializers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Deserializers.Base.class)
public class ApartmentWebsiteApplicationTests {

    @Test
    public void contextLoads() {
    }

}
