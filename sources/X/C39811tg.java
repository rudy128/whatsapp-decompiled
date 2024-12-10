package X;

import android.os.Handler;
import android.os.Looper;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.1tg  reason: invalid class name and case insensitive filesystem */
public class C39811tg {
    public static Executor A04 = Executors.newCachedThreadPool();
    public final Handler A00 = new Handler(Looper.getMainLooper());
    public final Set A01 = new LinkedHashSet(1);
    public final Set A02 = new LinkedHashSet(1);
    public volatile C42891yu A03 = null;

    public synchronized void A01(C38591rZ r2) {
        Throwable th;
        C42891yu r0 = this.A03;
        if (!(r0 == null || (th = r0.A01) == null)) {
            r2.onResult(th);
        }
        this.A01.add(r2);
    }

    public synchronized void A02(C38591rZ r2) {
        Object obj;
        C42891yu r0 = this.A03;
        if (!(r0 == null || (obj = r0.A00) == null)) {
            r2.onResult(obj);
        }
        this.A02.add(r2);
    }

    public synchronized void A03(C38591rZ r2) {
        this.A02.remove(r2);
    }

    public static void A00(C42891yu r2, C39811tg r3) {
        if (r3.A03 == null) {
            r3.A03 = r2;
            r3.A00.post(new C449025f((Object) r3, 9));
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public C39811tg(Callable callable, boolean z) {
        if (z) {
            try {
                A00((C42891yu) callable.call(), this);
            } catch (Throwable th) {
                A00(new C42891yu(th), this);
            }
        } else {
            A04.execute(new C39821th(this, callable));
        }
    }
}
