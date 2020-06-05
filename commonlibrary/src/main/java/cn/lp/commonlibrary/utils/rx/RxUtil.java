package cn.lp.commonlibrary.utils.rx;

import androidx.annotation.NonNull;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.ObservableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.Single;
import io.reactivex.SingleSource;
import io.reactivex.SingleTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

public class RxUtil {
    /**
     * 统一线程处理
     *
     * @param <T>
     * @return
     */
    public static <T> ObservableTransformer<T, T> rxIoMain() {    //compose简化线程
        return new ObservableTransformer<T, T>() {
            @Override
            public ObservableSource<T> apply(@NonNull Observable<T> upstream) {
                return upstream.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

    /**
     * 统一线程处理
     *
     * @param <T>
     * @return
     */
    public static <T> SingleTransformer<T, T> rxSingleIoMain() {    //compose简化线程
        return new SingleTransformer<T, T>() {
            @Override
            public SingleSource<T> apply(@io.reactivex.annotations.NonNull Single<T> upstream) {
                return upstream.subscribeOn(Schedulers.io())
                    .observeOn(AndroidSchedulers.mainThread());
            }
        };
    }

    public static Scheduler io() {
        return Schedulers.io();
    }

    public static Scheduler main() {
        return AndroidSchedulers.mainThread();
    }

    //public static Observable<Void> clickView(@NonNull View view) {
    //    checkNoNull(view);
    //    return Observable.(new ViewClickOnSubscribe(view));
    //}
    //
    ///**
    // * 查空
    // */
    //private static <T> void checkNoNull(T value) {
    //    if (value == null) {
    //        throw new NullPointerException("generic value here is null");
    //    }
    //}
    //
    //private static class ViewClickOnSubscribe implements Observable.OnSubscribe<Void> {
    //    private View view;
    //
    //    public ViewClickOnSubscribe(View view) {
    //        this.view = view;
    //    }
    //
    //    @Override
    //    public void call(final Subscriber<? super Void> subscriber) {
    //        View.OnClickListener onClickListener = new View.OnClickListener() {
    //            @Override
    //            public void onClick(View v) {
    //                //订阅没取消
    //                if (!subscriber.isUnsubscribed()) {
    //                    //发送消息
    //                    subscriber.onNext(null);
    //                }
    //            }
    //        };
    //        view.setOnClickListener(onClickListener);
    //    }
    //}
}
