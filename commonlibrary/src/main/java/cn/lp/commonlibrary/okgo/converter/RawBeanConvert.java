package cn.lp.commonlibrary.okgo.converter;

/**
 * Created by lp on 2018/2/3.
 */

public class RawBeanConvert<T> extends MyConverter<T> {

    public RawBeanConvert(Class<T> clazz) {
        super(clazz);
    }

    @Override
    public T convert(String json) throws Throwable {
        return Convert2.toRawBean(json, mClazz);
    }
}
