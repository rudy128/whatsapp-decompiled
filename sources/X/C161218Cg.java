package X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: X.8Cg  reason: invalid class name and case insensitive filesystem */
public final class C161218Cg extends Handler {
    public final Handler.Callback A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C161218Cg(Looper looper, Handler.Callback callback) {
        super(looper, new AAJ(callback));
        C18070vi.A0d(looper, 1);
        this.A00 = callback;
    }
}
