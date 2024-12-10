package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.3NR  reason: invalid class name */
public class AnonymousClass3NR extends Handler {
    public final /* synthetic */ AnonymousClass4aY A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3NR(AnonymousClass4aY r2) {
        super(Looper.getMainLooper());
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        AnonymousClass4aY r2 = this.A00;
        if (r2.A2Q.Be3() && !r2.A2Q.getScreenLockStateProvider().A01()) {
            r2.A3d.A08();
            if (r2.A6u) {
                r2.A3d.A0E(false);
            }
            r2.A75 = false;
            r2.A6u = true;
        }
    }
}
