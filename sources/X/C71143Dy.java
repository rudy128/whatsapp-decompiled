package X;

import java.util.concurrent.Future;

/* renamed from: X.3Dy  reason: invalid class name and case insensitive filesystem */
public final class C71143Dy implements AnonymousClass3MV {
    public final Future A00;

    public void Bdq(Throwable th) {
        if (th != null) {
            this.A00.cancel(false);
        }
    }

    public C71143Dy(Future future) {
        this.A00 = future;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CancelFutureOnCancel[");
        return C17900vP.A09(this.A00, A10);
    }
}
