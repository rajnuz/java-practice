package basicKnowledge.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author rajnuz
 * @date 2022/2/11 16:45
 */
public class TraceHandler implements InvocationHandler {
    private Object target;

    public TraceHandler(Object t){target = t;};

    @Override
    public Object invoke(Object proxy, Method m, Object[] args) throws Throwable{
        System.out.println(target);
        System.out.println("." + m.getName() + "(");
        if(args != null){
            for (int i = 0; i < args.length; i++){
                System.out.println(args[i] );
            }
        }
        System.out.println(")");
        return  m.invoke(target,args);
    }
}
