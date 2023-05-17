package cn.huishengzhou.demo02;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *
 */
public class ProxyinvocationHandler implements InvocationHandler {

    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成得到代理类(固定代码，只需要改rent这个抽象代理接口即可)
//    Object newProxyInstance(ClassLoader, Class<?>[], InvocationHandler)   Object newProxyInstance(Class<?>, Constructor<?>, InvocationHandler)
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), this.rent.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 代理类额外的方法
        seeHouse();
        // 动态代理的本质就是通过反射机制调用方法
        Object result = method.invoke(rent, args);
        return result;
    }

    // 代理类额外的方法
    public void seeHouse() {
        // 中介的行为
        System.out.println("中介收取中介费");
    }
}
