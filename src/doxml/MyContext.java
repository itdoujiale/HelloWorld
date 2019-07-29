package doxml;

import java.io.InputStream;

/**
 * @ClassName: MyContext
 * @description:
 * @author: doujl
 * @create: 2019-07-17 09:51
 **/
public class MyContext {

    public String configLocation;

    public MyContext(String configLocation) {
        this.configLocation = configLocation;
    }

    public void refresh(){
        InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(configLocation);

    }
}
