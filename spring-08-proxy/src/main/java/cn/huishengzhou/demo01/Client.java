package cn.huishengzhou.demo01;

/**
 *  客户
 */
public class Client {
    public static void main(String[] args) {
        // 1. 创建房东，丢给中介
        Proxy proxy = new Proxy(new Host());
        // 2. 找中介租房子
        proxy.rent();
    }
}
