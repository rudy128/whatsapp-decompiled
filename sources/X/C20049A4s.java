package X;

import android.net.Uri;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

/* renamed from: X.A4s  reason: case insensitive filesystem */
public final class C20049A4s {
    public static final SecretKey A02 = KeyGenerator.getInstance("AES").generateKey();
    public static final AI5 A03 = new AI5(0);
    public static final AI5 A04 = new AI5(1);
    public boolean A00;
    public final C18030ve A01;

    public C20049A4s(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public final String A01(String str) {
        C18070vi.A0d(str, 0);
        if (!this.A00) {
            A00(this);
        }
        C20030A3z a3z = C20030A3z.A01;
        Uri A012 = C26215Cuu.A01(str);
        C18070vi.A0X(A012);
        String A002 = C20030A3z.A00(new AI4(A012), C20030A3z.A01);
        if (A002 != null) {
            A012 = C26215Cuu.A01(A002);
            C18070vi.A0X(A012);
        }
        return C18070vi.A0H(A012);
    }

    public final String A02(String str) {
        C18070vi.A0d(str, 0);
        if (!this.A00) {
            A00(this);
        }
        C20030A3z a3z = C20030A3z.A01;
        Uri A012 = C26215Cuu.A01(str);
        C18070vi.A0X(A012);
        return C18070vi.A0H(AnonymousClass9OR.A00(A012, true));
    }

    public static final void A00(C20049A4s a4s) {
        AI5 ai5;
        boolean A05 = C18020vd.A05(C18040vf.A02, a4s.A01, 10967);
        B4U b4u = C182249Tq.A00;
        if (A05) {
            ai5 = A04;
        } else {
            ai5 = A03;
        }
        C18070vi.A0d(ai5, 0);
        C182249Tq.A00 = ai5;
        a4s.A00 = true;
    }
}
