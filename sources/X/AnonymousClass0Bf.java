package X;

import java.security.Signature;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* renamed from: X.0Bf  reason: invalid class name */
public class AnonymousClass0Bf extends C195869u2 {
    public final /* synthetic */ C03480Ik A00;

    public static AnonymousClass0PP A00(A52 a52) {
        if (a52 == null) {
            return null;
        }
        Cipher A01 = a52.A01();
        if (A01 != null) {
            return new AnonymousClass0PP(A01);
        }
        Signature A002 = a52.A00();
        if (A002 != null) {
            return new AnonymousClass0PP(A002);
        }
        Mac A02 = a52.A02();
        if (A02 != null) {
            return new AnonymousClass0PP(A02);
        }
        return null;
    }

    public AnonymousClass0Bf(C03480Ik r1) {
        this.A00 = r1;
    }

    public void A01() {
        this.A00.A02.A00();
    }

    public void A02(int i, CharSequence charSequence) {
        this.A00.A02.A01(i, charSequence);
    }

    public void A03(int i, CharSequence charSequence) {
        this.A00.A02.A03(charSequence);
    }

    public void A04(C189159ic r4) {
        this.A00.A02.A02(new AnonymousClass0HL(A00(r4.A00()), 2));
    }
}
