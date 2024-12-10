package X;

import android.os.SystemClock;

/* renamed from: X.357  reason: invalid class name */
public final /* synthetic */ class AnonymousClass357 implements C22515BAy {
    public final /* synthetic */ C683933e A00;
    public final /* synthetic */ C27001Ui A01;
    public final /* synthetic */ boolean A02;

    public final void BzD(C29681ch r5) {
        C27001Ui r0 = this.A01;
        boolean z = this.A02;
        C683933e r3 = this.A00;
        C55782gM A002 = ((C57712jW) r0.A08.get()).A00(r5, z);
        if (A002 != null) {
            r3.C1y(A002, SystemClock.elapsedRealtime());
        }
    }

    public /* synthetic */ AnonymousClass357(C683933e r1, C27001Ui r2, boolean z) {
        this.A01 = r2;
        this.A02 = z;
        this.A00 = r1;
    }

    public /* synthetic */ void onError(Throwable th) {
    }
}
