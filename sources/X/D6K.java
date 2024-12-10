package X;

import android.content.Context;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public final class D6K implements AnonymousClass1GV, Consumer {
    public C192929pG A00;
    public final Set A01 = C17880vN.A14();
    public final ReentrantLock A02 = new ReentrantLock();
    public final Context A03;

    /* renamed from: A01 */
    public void accept(WindowLayoutInfo windowLayoutInfo) {
        C18070vi.A0d(windowLayoutInfo, 0);
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            this.A00 = C198869z3.A00.A00(this.A03, windowLayoutInfo);
            for (AnonymousClass1GV accept : this.A01) {
                accept.accept(this.A00);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void A00(AnonymousClass1GV r3) {
        ReentrantLock reentrantLock = this.A02;
        reentrantLock.lock();
        try {
            C192929pG r0 = this.A00;
            if (r0 != null) {
                r3.accept(r0);
            }
            this.A01.add(r3);
        } finally {
            reentrantLock.unlock();
        }
    }

    public D6K(Context context) {
        this.A03 = context;
    }
}
