package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.2uX  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64292uX implements Handler.Callback {
    public final /* synthetic */ C62332rE A00;
    public final /* synthetic */ AnonymousClass1LD A01;

    public final boolean handleMessage(Message message) {
        C62332rE r5 = this.A00;
        AnonymousClass1LD r0 = this.A01;
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            AnonymousClass00H r4 = r5.A03;
            if (((C30881ef) r4.get()).A00 != 1) {
                r5.A01();
                C188099gs r3 = r5.A01;
                r3.A05.execute(new C21448AkF(r3, 32));
                ((C51862Zx) r5.A02.get()).A00.clear();
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("presencestatemanager/timeout/foreground ");
            C17900vP.A0b(r4.get(), A10);
            return true;
        } else if (r0.A01()) {
            return true;
        } else {
            C62332rE.A00(r5, false);
            return true;
        }
    }

    public /* synthetic */ C64292uX(C62332rE r1, AnonymousClass1LD r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
