package com.hollyland;

/**
 * @ClassName Observer
 * @Description 所有的观察者都是先Observer接口，所以它们都不得不实现update()方法
 * @Author wangqiang
 * @Date 2022/7/27 17:33
 **/
public interface Observer {
    /**
     * 从Subject获取状态值
     */
    public void update();
}
