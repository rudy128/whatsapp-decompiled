package X;

import androidx.window.java.core.CallbackToFlowAdapter$connect$1$1;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.2kY  reason: invalid class name and case insensitive filesystem */
public final class C58352kY {
    public final Map A00 = C17880vN.A13();
    public final ReentrantLock A01 = new ReentrantLock();

    public final void A01(AnonymousClass1GV r7, Executor executor, C23421Fz r9) {
        C18070vi.A0d(r9, 2);
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            Map map = this.A00;
            if (map.get(r7) == null) {
                AnonymousClass1OY A02 = AnonymousClass1OW.A02(new C23791Hq(executor));
                CallbackToFlowAdapter$connect$1$1 callbackToFlowAdapter$connect$1$1 = new CallbackToFlowAdapter$connect$1$1(r7, (C30391dr) null, r9);
                map.put(r7, C30451dy.A02(AnonymousClass00R.A00, AnonymousClass1OR.A00, callbackToFlowAdapter$connect$1$1, A02));
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void A00(AnonymousClass1GV r5) {
        ReentrantLock reentrantLock = this.A01;
        reentrantLock.lock();
        try {
            Map map = this.A00;
            AnonymousClass1OB r1 = (AnonymousClass1OB) map.get(r5);
            if (r1 != null) {
                r1.BEM((CancellationException) null);
            }
            map.remove(r5);
        } finally {
            reentrantLock.unlock();
        }
    }
}
