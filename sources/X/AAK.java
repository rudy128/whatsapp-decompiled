package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.rendercore.RootHostView;

public class AAK implements Handler.Callback {
    public final /* synthetic */ ALM A00;

    public AAK(ALM alm) {
        this.A00 = alm;
    }

    public boolean handleMessage(Message message) {
        if (!C26176Ctu.A03()) {
            C161218Cg r3 = this.A00.A04;
            Message obtainMessage = r3.obtainMessage(message.what, message.obj);
            C18070vi.A0d(obtainMessage, 0);
            if (C18070vi.A18(Looper.myLooper(), r3.getLooper())) {
                r3.A00.handleMessage(obtainMessage);
            } else {
                r3.sendMessageAtFrontOfQueue(obtainMessage);
                return true;
            }
        } else {
            int i = message.what;
            if (i == 1) {
                ALM alm = this.A00;
                Object obj = message.obj;
                C25344Ce3.A00(obj);
                AnonymousClass8KU r2 = (AnonymousClass8KU) obj;
                try {
                    C25813CmQ cmQ = alm.A01;
                    if (cmQ != null) {
                        cmQ.A02();
                    }
                    RootHostView rootHostView = alm.A00;
                    if (rootHostView == null) {
                        ALM.A00(alm, 8);
                    } else {
                        r2.A01.A03(rootHostView);
                    }
                    return true;
                } finally {
                    alm.A01 = r2.A01;
                    ALM.A00(alm, r2.A00);
                }
            } else if (i != 2) {
                return false;
            } else {
                ALM alm2 = this.A00;
                C25344Ce3.A00((Object) null);
                if (alm2.A01 != null) {
                    throw AnonymousClass000.A0s("getExternalVariables");
                }
            }
        }
        return true;
    }
}
