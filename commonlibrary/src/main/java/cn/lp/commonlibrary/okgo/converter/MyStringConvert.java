package cn.lp.commonlibrary.okgo.converter;

/**
 * Created by lp on 2018/2/3.
 */

public class MyStringConvert extends MyConverter<String> {

    public MyStringConvert() {
        super(String.class);
    }

    @Override
    public String convert(String stringResponse) throws Throwable {
        return stringResponse;
    }
}
