package X;

import com.whatsapp.util.Log;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Af0  reason: case insensitive filesystem */
public class C21132Af0 implements AnonymousClass1TI {
    public final AnonymousClass1TJ A00 = new AnonymousClass1TJ();
    public final AnonymousClass1TJ A01 = new AnonymousClass1TJ();
    public final AtomicBoolean A02 = C108965cb.A0w();

    public final void A09(AnonymousClass1TI r3) {
        this.A01.A03(r3, (Executor) null);
    }

    public final void A0A(AnonymousClass1TI r2, Executor executor) {
        this.A01.A03(r2, executor);
    }

    public final void A0B(Object obj) {
        if (AnonymousClass8BV.A1Z(this.A02)) {
            this.A01.A04(obj);
        }
    }

    public final void A0C(Throwable th) {
        if (AnonymousClass8BV.A1Z(this.A02)) {
            this.A00.A04(th);
        }
    }

    public void A0D() {
        this.A01.A01();
        this.A00.A01();
        if (!this.A02.get()) {
            Log.w("asyncfuture/unsubscribe called before completion, possibly not intended", new Throwable());
        }
    }

    public final void accept(Object obj) {
        A0B(obj);
    }
}
