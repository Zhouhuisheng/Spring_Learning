package cn.huishengzhou.demo01;

/**
 *  中介（代理角色）
 */
public class Proxy implements Rent {
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        System.out.println("中介要收取中介费");
        host.rent();
    }
}
