package X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1d3  reason: invalid class name and case insensitive filesystem */
public final class C29901d3 extends Handler {
    public final /* synthetic */ C219017v A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C29901d3(Looper looper, C219017v r2) {
        super(looper);
        this.A00 = r2;
    }

    public void handleMessage(Message message) {
        boolean z;
        boolean z2;
        Bundle data = message.getData();
        C219017v r3 = this.A00;
        boolean z3 = false;
        if (message.arg1 != 0) {
            z3 = true;
        }
        long j = data.getLong("networkId");
        boolean z4 = data.getBoolean("networkIsBlocked");
        AtomicBoolean atomicBoolean = C219017v.A1B;
        synchronized (r3.A0k) {
            z = true;
            if (r3.A09 != z3) {
                if (z3) {
                    Log.i("MessageHandler/handleNetworkChange/up");
                    C36281nd r0 = r3.A07;
                    if (r0 != null) {
                        ((C36291ne) r0).A00.A1I.compareAndSet(true, false);
                    }
                    C219017v.A06(r3, false, true, false);
                } else {
                    Log.i("MessageHandler/handleNetworkChange/down");
                    C36281nd r02 = r3.A07;
                    if (r02 != null) {
                        if (z4) {
                            Log.i("MessageHandler/handleNetworkChange/sendDisconnect");
                            ((C36291ne) r3.A07).A00.A1I.set(true);
                            r3.A07.CHR(true, 1);
                        } else {
                            r02.CHR(true, 11);
                        }
                    }
                }
                r3.A09 = z3;
                r3.A00 = j;
            } else if (z3) {
                long j2 = r3.A00;
                if (j != j2) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("MessageHandler/handleNetworkChange/switch old=");
                    sb.append(j2);
                    sb.append(" new=");
                    sb.append(j);
                    Log.i(sb.toString());
                    C36281nd r03 = r3.A07;
                    if (r03 != null) {
                        r03.CHR(true, 11);
                    }
                    r3.A00 = j;
                    z2 = true;
                } else {
                    z2 = false;
                }
                C219017v.A06(r3, false, false, true);
                z = z2;
            } else {
                z = false;
            }
        }
        if (z) {
            r3.A0d.CGF(new C70583Br(r3, 43));
        }
    }
}
