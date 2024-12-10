package X;

import android.os.MessageQueue;

/* renamed from: X.2uZ  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C64312uZ implements MessageQueue.IdleHandler {
    public final /* synthetic */ C78843tk A00;
    public final /* synthetic */ Runnable A01;

    public final boolean queueIdle() {
        C78843tk r4 = this.A00;
        Runnable runnable = this.A01;
        C200710s r2 = r4.A07;
        if (r2 == null) {
            AnonymousClass1FY waBaseActivity = r4.getWaBaseActivity();
            C17960vV.A07(waBaseActivity);
            r2 = new C200710s(waBaseActivity.A05, true);
            r4.A07 = r2;
        }
        r2.execute(runnable);
        return false;
    }

    public /* synthetic */ C64312uZ(C78843tk r1, Runnable runnable) {
        this.A00 = r1;
        this.A01 = runnable;
    }
}
