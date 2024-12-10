package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.1Kl  reason: invalid class name and case insensitive filesystem */
public class C24471Kl extends Handler {
    public final /* synthetic */ C24421Kg A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24471Kl(Looper looper, C24421Kg r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        super.handleMessage(message);
        if (message.what == 0) {
            C24421Kg.A05(this.A00);
        }
    }
}
