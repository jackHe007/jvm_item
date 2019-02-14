package demo.jackie.jvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author heting
 * @date 2019年02月13日 - 15:26
 * @history 2019年02月13日 - 15:26 heting  create.
 */
public class OutOfMemoryErrorTest {

    static class OOMObject{
        
    }

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();
        while (true) {
            list.add(new OOMObject());
        }
    }

}
