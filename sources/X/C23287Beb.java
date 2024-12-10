package X;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Beb  reason: case insensitive filesystem */
public final class C23287Beb extends BG6 {
    public final /* synthetic */ BZB A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23287Beb(Looper looper, BZB bzb) {
        super(looper);
        this.A00 = bzb;
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            BZB bzb = this.A00;
            Lock lock = bzb.A0G;
            lock.lock();
            try {
                if (bzb.A09()) {
                    BZB.A01(bzb);
                }
            } finally {
                lock.unlock();
            }
        } else if (i != 2) {
            Log.w("GoogleApiClientImpl", AnonymousClass001.A1I("Unknown message id: ", AnonymousClass000.A10(), i));
        } else {
            BZB.A02(this.A00);
        }
    }
}
