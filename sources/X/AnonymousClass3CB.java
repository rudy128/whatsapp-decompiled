package X;

import android.os.Message;

/* renamed from: X.3CB  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CB implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1VQ A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public final void run() {
        AnonymousClass1VQ r5 = this.A01;
        boolean z = this.A04;
        int i = this.A00;
        String str = this.A02;
        String str2 = this.A03;
        Message obtain = Message.obtain();
        obtain.arg1 = z ? 1 : 0;
        obtain.arg2 = i;
        obtain.obj = str;
        r5.A0A.A00(new A69(obtain, str2));
    }

    public /* synthetic */ AnonymousClass3CB(AnonymousClass1VQ r1, String str, String str2, int i, boolean z) {
        this.A01 = r1;
        this.A04 = z;
        this.A00 = i;
        this.A02 = str;
        this.A03 = str2;
    }
}
