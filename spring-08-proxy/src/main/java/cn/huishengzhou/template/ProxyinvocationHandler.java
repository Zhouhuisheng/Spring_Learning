package cn.huishengzhou.template;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 *  万能模板，只需要更改代理角色要执行的方法即可
 */
public class ProxyinvocationHandler implements InvocationHandler {

    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 生成得到代理类(固定代码，只需要改rent这个抽象代理接口即可)
//    Object newProxyInstance(ClassLoader, Class<?>[], InvocationHandler)   Object newProxyInstance(Class<?>, Constructor<?>, InvocationHandler)
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }

    // 处理代理实例，并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 执行 代理角色要执行的方法
        log(method.getName());

        // 动态代理的本质就是通过反射机制调用方法
        Object result = method.invoke(target, args);
        return result;
    }

    // 代理角色要执行的方法
    public void log(String msg) {
        System.out.println("执行了" + msg + "方法");
    }
}
