package X;

import android.app.Notification;

/* renamed from: X.3CC  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CC implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Notification A01;
    public final /* synthetic */ AnonymousClass1Vo A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public final void run() {
        AnonymousClass1Vo r4 = this.A02;
        int i = this.A00;
        AnonymousClass1Vo.A00(this.A01, r4, this.A03, i, this.A04);
    }

    public /* synthetic */ AnonymousClass3CC(Notification notification, AnonymousClass1Vo r2, String str, int i, boolean z) {
        this.A02 = r2;
        this.A00 = i;
        this.A03 = str;
        this.A01 = notification;
        this.A04 = z;
    }
}
