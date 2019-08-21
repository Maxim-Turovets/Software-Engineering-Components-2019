package Proxy;

import java.lang.reflect.Method;

public class Immutability implements java.lang.reflect.InvocationHandler {

    private Object obj;

    public Immutability(Object obj){ this.obj = obj; }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if( method.getName().startsWith("get") ){
            return method.invoke(obj, args);
        }
        throw new IllegalAccessException("Not allowed");
    }
}
