package X;

import java.util.concurrent.Future;

/* renamed from: X.3E5  reason: invalid class name */
public final class AnonymousClass3E5 implements AnonymousClass1OI {
    public final Future A00;

    public void dispose() {
        this.A00.cancel(false);
    }

    public AnonymousClass3E5(Future future) {
        this.A00 = future;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DisposableFutureHandle[");
        return C17900vP.A09(this.A00, A10);
    }
}
