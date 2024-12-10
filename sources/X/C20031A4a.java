package X;

import java.util.Random;

/* renamed from: X.A4a  reason: case insensitive filesystem */
public class C20031A4a {
    public long A00;
    public AnonymousClass11P A01;
    public String A02;
    public Random A03 = new Random();
    public final AnonymousClass1QE A04 = AnonymousClass1QE.A00("PaymentFieldStats", "notification", "COMMON");

    public static void A01(C20031A4a a4a) {
        a4a.A02 = null;
        a4a.A00 = 0;
    }

    public static void A00(C171858sO r2, C20031A4a a4a) {
        String str = a4a.A02;
        if (str == null) {
            byte[] bArr = new byte[8];
            a4a.A03.nextBytes(bArr);
            str = C17970vW.A06(bArr);
            a4a.A02 = str;
        }
        r2.A0V = str;
    }

    public void A02() {
        this.A04.A06("PaymentWamEvent timer reset.");
        this.A00 = AnonymousClass11P.A01(this.A01);
    }

    public C20031A4a(AnonymousClass11P r4) {
        this.A01 = r4;
    }
}
