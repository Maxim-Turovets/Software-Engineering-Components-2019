package ua.MaxT.Proxy;

import java.lang.reflect.Method;

public class Immutability implements java.lang.reflect.InvocationHandler {

    private Object obj;

    public Immutability(Object obj){ this.obj = obj; }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (args != null) {
            throw new UnsupportedOperationException("Not available for immutable obj");
        }
        return method.invoke(obj, args);
    }
}
