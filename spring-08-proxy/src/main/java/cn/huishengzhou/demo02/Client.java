package cn.huishengzhou.demo02;

/**
 *  客户
 */
public class Client {
    public static void main(String[] args) {
        // 1. 定义真实角色
        Host host = new Host();
        // 2. 代理角色：现在没有
        ProxyinvocationHandler proxyinvocationHandler = new ProxyinvocationHandler();
        // 3. 通过调用程序处理角色来处理我们要调用的接口对象
        proxyinvocationHandler.setRent(host);
        // 4. 得到代理类对象
        Rent proxy = (Rent)proxyinvocationHandler.getProxy();
        // 5. 通过代理类调用方法
        proxy.rent();
    }
}
