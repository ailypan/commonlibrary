package cn.lp.commonlibrary.okgo.converter;

/**
 * Created by lp on 2018/2/3.
 */

public abstract class MyConverter<T> {

    protected Class<T> mClazz;

    public MyConverter(Class<T> clazz) {
        mClazz = clazz;
    }

    public void setClass(Class<T> clazz) {
        mClazz = clazz;
    }

    public Class<T> getToConvertClass() {
        return mClazz;
    }

    public abstract T convert(String stringResponse) throws Throwable;
}
