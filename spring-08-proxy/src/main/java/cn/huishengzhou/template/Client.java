package cn.huishengzhou.template;

/**
 *  客户
 */
public class Client {
    public static void main(String[] args) {
        // 1. 真实角色
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        // 2. 代理角色:不存在
        ProxyinvocationHandler proxyinvocationHandler = new ProxyinvocationHandler();
        // 3. 设置要代理的对象
        proxyinvocationHandler.setTarget(userServiceImpl);
        // 4. 动态生成代理类：获取代理角色
        UserService proxy = (UserService) proxyinvocationHandler.getProxy();
        // 5. 通过代理角色调用真实角色的方法
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.query();
    }
}
