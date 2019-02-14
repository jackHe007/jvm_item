package demo.jackie.jvm.memory;

/**
 * 运行时常量池内存溢出
 * java 1.6即之前版本会发生这样异常
 *
 * @author heting
 * @date 2019年02月13日 - 17:16
 * @history 2019年02月13日 - 17:16 heting  create.
 */
public class RuntimeConstantPoolOOM {

    /**
     *
     * VM args : -XX:PermSize=10M -XX:MaxPermSize=10M
     */
    public static void main(String[] args) {
        ////使list保持着常量池引用，避免Full GC回收常量池行为
        //List<String> list = new ArrayList<String>();
        ////10M的PermSize在integer范围内足够产生OOM
        //int i = 0;
        //while (true) {
        //    list.add(String.valueOf(i++).intern());
        //}

        String str1 = new StringBuilder("欢迎").append("你").toString();
        System.out.println(str1.intern() == str1);

        String str2 = new StringBuilder("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }

}
