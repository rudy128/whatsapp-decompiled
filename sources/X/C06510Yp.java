package X;

/* renamed from: X.0Yp  reason: invalid class name and case insensitive filesystem */
public class C06510Yp implements Runnable {
    public final /* synthetic */ AnonymousClass0SF A00;

    public C06510Yp(AnonymousClass0SF r1) {
        this.A00 = r1;
    }

    public void run() {
        C009205e r1 = this.A00.A0B;
        if (r1 != null) {
            r1.A07 = true;
            r1.requestLayout();
        }
    }
}
