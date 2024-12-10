package X;

import android.os.Handler;
import java.util.concurrent.Callable;
import java.util.concurrent.Exchanger;

/* renamed from: X.CCd  reason: case insensitive filesystem */
public abstract class C24617CCd {
    public static final Object A00(Handler handler, Object obj, Callable callable) {
        C18070vi.A0d(handler, 1);
        if (C18070vi.A18(Thread.currentThread(), handler.getLooper().getThread())) {
            try {
                return callable.call();
            } catch (Exception e) {
                throw AnonymousClass8BR.A0x(e);
            }
        } else {
            Exchanger exchanger = new Exchanger();
            if (!handler.post(new AnonymousClass7RL(exchanger, callable, 7))) {
                return obj;
            }
            try {
                return exchanger.exchange(obj);
            } catch (InterruptedException e2) {
                throw AnonymousClass8BR.A0x(e2);
            }
        }
    }
}
