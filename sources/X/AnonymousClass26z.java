package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.26z  reason: invalid class name */
public final class AnonymousClass26z extends Handler implements AnonymousClass3LB, AnonymousClass3KS {
    public boolean A00;
    public final /* synthetic */ C31701fz A01;

    public void A00() {
        this.A00 = true;
    }

    public void CAe(Message message) {
        message.what = 0;
        sendMessage(message);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass26z(C31701fz r2) {
        super(r2.getLooper());
        this.A01 = r2;
    }

    public void handleMessage(Message message) {
        C31701fz r1;
        String str;
        Object obj;
        AnonymousClass1O7 r12;
        int i;
        int i2 = message.what;
        if (i2 != 0) {
            if (i2 == 1) {
                boolean z = this.A00;
                r1 = this.A01;
                if (z) {
                    str = "ConnectionThread/ReaderThreadHandler/quit if logout is finished";
                }
                r1.A0M();
                return;
            } else if (i2 == 2) {
                boolean z2 = this.A00;
                r1 = this.A01;
                if (z2) {
                    str = "ConnectionThread/ReaderThreadHandler/quit if error and finished";
                } else {
                    if (!r1.A19()) {
                        r1.A0T(message.arg1);
                        return;
                    }
                    r1.A0M();
                    return;
                }
            } else if (i2 != 4) {
                if (i2 == 5) {
                    AnonymousClass1O4 A0C = this.A01.A0o;
                    obj = message.obj;
                    r12 = A0C.A08;
                    i = 6;
                } else if (i2 == 6) {
                    AnonymousClass1O4 A0C2 = this.A01.A0o;
                    obj = message.obj;
                    r12 = A0C2.A08;
                    i = 7;
                } else {
                    return;
                }
                r12.obtainMessage(i, obj).sendToTarget();
                return;
            } else {
                this.A01.A0Y(message);
                return;
            }
            r1.A14(str);
            return;
        }
        this.A01.A0Z(message);
    }
}
