package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2T7  reason: invalid class name */
public abstract class AnonymousClass2T7 {
    public static boolean A00(AnonymousClass206 r4, C32021gV r5, boolean z) {
        C693536w A00;
        File A0L;
        if (z) {
            C20941Abv A002 = C60532oB.A00(r4);
            if (A002 == null || A002.A02 != 1) {
                C693536w A003 = C60502o8.A00(r4);
                if (A003 != null && (!(A003.A05 == null && A003.A08 == null) && A003.A01 > 0 && A003.A00 > 0)) {
                    if (A003.A0A || (r4.A0v.A02 && !r4.A19)) {
                        if (!(r4 instanceof AnonymousClass210) || (A00 = C60502o8.A00(r4)) == null || (A0L = r5.A04.A03.A0L(A00)) == null) {
                            return false;
                        }
                        try {
                            return A0L.exists();
                        } catch (SecurityException unused) {
                            Log.i("fmessageio/doesWebPageImageExist no read access");
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }
}
