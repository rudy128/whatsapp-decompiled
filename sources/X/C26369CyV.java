package X;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: X.CyV  reason: case insensitive filesystem */
public final class C26369CyV implements Handler.Callback {
    public final /* synthetic */ C26122Csk A00;

    public /* synthetic */ C26369CyV(C26122Csk csk) {
        this.A00 = csk;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            HashMap hashMap = this.A00.A02;
            synchronized (hashMap) {
                C26021Cqe cqe = (C26021Cqe) message.obj;
                Cy0 cy0 = (Cy0) hashMap.get(cqe);
                if (cy0 != null && cy0.A05.isEmpty()) {
                    if (cy0.A03) {
                        C26021Cqe cqe2 = cy0.A04;
                        C26122Csk csk = cy0.A06;
                        csk.A04.removeMessages(1, cqe2);
                        csk.A01.A02(csk.A00, cy0);
                        cy0.A03 = false;
                        cy0.A00 = 2;
                    }
                    hashMap.remove(cqe);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            HashMap hashMap2 = this.A00.A02;
            synchronized (hashMap2) {
                C26021Cqe cqe3 = (C26021Cqe) message.obj;
                Cy0 cy02 = (Cy0) hashMap2.get(cqe3);
                if (cy02 != null && cy02.A00 == 3) {
                    Log.e("GmsClientSupervisor", AnonymousClass001.A1H("Timeout waiting for ServiceConnection callback ", String.valueOf(cqe3), AnonymousClass000.A10()), new Exception());
                    ComponentName componentName = cy02.A01;
                    if (componentName == null && (componentName = cqe3.A00) == null) {
                        String str = cqe3.A02;
                        C18210vx.A00(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    cy02.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
