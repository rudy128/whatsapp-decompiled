package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.concurrent.Executor;

/* renamed from: X.BFs  reason: case insensitive filesystem */
public class C22612BFs extends Handler {
    public void handleMessage(Message message) {
        CMQ cmq = (CMQ) message.obj;
        int i = message.what;
        if (i == 1) {
            C27078DTd dTd = cmq.A00;
            Object obj = cmq.A01[0];
            if (dTd.A02.get()) {
                try {
                    dTd.A06.A0A(dTd, obj);
                } catch (Throwable th) {
                    dTd.A00.countDown();
                    throw th;
                }
            } else {
                C22702BLf bLf = dTd.A06;
                if (bLf.A02 != dTd) {
                    bLf.A0A(dTd, obj);
                } else if (bLf.A02) {
                    bLf.A0B(obj);
                } else {
                    bLf.A04 = false;
                    SystemClock.uptimeMillis();
                    bLf.A02 = null;
                    bLf.A04(obj);
                }
            }
            dTd.A00.countDown();
            dTd.A05 = AnonymousClass00R.A0C;
        } else if (i == 2) {
            Executor executor = C27078DTd.A08;
        }
    }

    public C22612BFs() {
        super(Looper.getMainLooper());
    }
}
