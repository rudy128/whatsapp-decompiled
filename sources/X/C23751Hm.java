package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.1Hm  reason: invalid class name and case insensitive filesystem */
public class C23751Hm extends Handler {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public void handleMessage(Message message) {
        if (!((AnonymousClass1LD) this.A01.get()).A01()) {
            C62332rE.A00((C62332rE) this.A00.get(), true);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23751Hm(Looper looper, AnonymousClass00H r2, AnonymousClass00H r3) {
        super(looper);
        C17960vV.A07(looper);
        this.A00 = r2;
        this.A01 = r3;
    }
}
