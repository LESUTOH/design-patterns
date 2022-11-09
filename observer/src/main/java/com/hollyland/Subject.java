package com.hollyland;

/**
 * @ClassName Subject
 * @Description TODO
 * @Author wangqiang
 * @Date 2022/7/27 17:32
 **/
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}
