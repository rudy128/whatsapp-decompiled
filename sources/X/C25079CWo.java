package X;

import java.lang.ref.WeakReference;

/* renamed from: X.CWo  reason: case insensitive filesystem */
public class C25079CWo {
    public WeakReference A00 = null;
    public boolean A01 = false;
    public final DOZ A02;
    public final Runnable A03 = new C21466AkX((Object) this, 36);
    public final DFL A04;

    public void A00() {
        DFL dfl = this.A04;
        E8A A0A = dfl.A0A(40);
        if (this.A01 && A0A != null) {
            C26209Cul.A04(this.A02, dfl, new C20046A4p(), A0A, 0);
        }
    }

    public C25079CWo(DOZ doz, DFL dfl) {
        this.A02 = doz;
        this.A04 = dfl;
    }
}
