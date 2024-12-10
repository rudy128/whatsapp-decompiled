package X;

import android.location.Address;
import android.text.TextUtils;

/* renamed from: X.7Po  reason: invalid class name and case insensitive filesystem */
public class C146557Po implements Runnable {
    public double A00;
    public double A01;
    public final int A02;
    public final Object A03;

    public C146557Po(AnonymousClass75M r1, double d, double d2, int i) {
        this.A02 = i;
        this.A03 = r1;
        this.A00 = d;
        this.A01 = d2;
    }

    public void run() {
        AnonymousClass1KB r4;
        Runnable akY;
        int i = this.A02;
        AnonymousClass75M r42 = (AnonymousClass75M) this.A03;
        double d = this.A00;
        double d2 = this.A01;
        if (i != 0) {
            Address A002 = AnonymousClass75M.A00(r42, d, d2);
            String A022 = AnonymousClass75M.A02(A002, r42);
            if (A002 != null && !TextUtils.isEmpty(A022)) {
                r4 = r42.A11;
                akY = new C146817Qs(29, A022, this);
            } else {
                return;
            }
        } else {
            Address A003 = AnonymousClass75M.A00(r42, d, d2);
            String A023 = AnonymousClass75M.A02(A003, r42);
            r4 = r42.A11;
            akY = new C21467AkY(this, A003, A023, 36);
        }
        r4.A0J(akY);
    }
}
