package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

public final class BG3 extends Handler {
    public boolean A00;
    public final C26335Cxs A01 = new Object();
    public final /* synthetic */ C22581BEf A02;

    public static final synchronized void A00(BG3 bg3, String str) {
        synchronized (bg3) {
            if (bg3.A00) {
                if (Log.isLoggable("WearableLS", 2)) {
                    String valueOf = String.valueOf(bg3.A02.A00);
                    StringBuilder A0q = BE7.A0q(str.length() + 17, BE8.A0C(valueOf));
                    A0q.append("unbindService: ");
                    A0q.append(str);
                    Log.v("WearableLS", AnonymousClass001.A1H(", ", valueOf, A0q));
                }
                try {
                    bg3.A02.unbindService(bg3.A01);
                } catch (RuntimeException e) {
                    Log.e("WearableLS", "Exception when unbinding from local service", e);
                }
                bg3.A00 = false;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Cxs, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BG3(Looper looper, C22581BEf bEf) {
        super(looper);
        this.A02 = bEf;
    }

    public final void dispatchMessage(Message message) {
        synchronized (this) {
            if (!this.A00) {
                if (Log.isLoggable("WearableLS", 2)) {
                    String valueOf = String.valueOf(this.A02.A00);
                    Log.v("WearableLS", AnonymousClass001.A1H("bindService: ", valueOf, BE6.A0t(BE8.A0C(valueOf) + 13)));
                }
                C22581BEf bEf = this.A02;
                bEf.bindService(bEf.A01, this.A01, 1);
                this.A00 = true;
            }
        }
        try {
            super.dispatchMessage(message);
        } finally {
            if (!hasMessages(0)) {
                A00(this, "dispatch");
            }
        }
    }
}
