package X;

import android.content.Context;
import java.math.BigDecimal;

/* renamed from: X.Aaj  reason: case insensitive filesystem */
public class C20867Aaj implements AnonymousClass5YC {
    public AnonymousClass1KN A00;
    public final Context A01;
    public final C18000vb A02;
    public final AnonymousClass1KJ A03;
    public final AnonymousClass1KN A04;
    public final C187419fm A05;
    public final AnonymousClass1KN A06;

    public static C85224Mo A00(C20867Aaj aaj, String str, BigDecimal bigDecimal, int i, boolean z) {
        AnonymousClass1KN r0;
        int i2;
        if (i == 0) {
            r0 = aaj.A00;
        } else {
            r0 = aaj.A06;
        }
        BigDecimal bigDecimal2 = r0.A00;
        C187419fm r7 = aaj.A05;
        if (r7 != null) {
            i2 = 0;
            BigDecimal A012 = C20092A6u.A01(r7.A03, bigDecimal);
            if (A012.compareTo(bigDecimal2) > 0 || (A012.compareTo(bigDecimal2) == 0 && str.endsWith(".") && !z)) {
                return new C85224Mo(3, C17880vN.A0q(r7.A00, r7.A02.BLd(r7.A01, bigDecimal2), new Object[1], 0, 2131894023));
            }
        } else {
            i2 = 0;
            if (bigDecimal.compareTo(bigDecimal2) > 0 || (bigDecimal.compareTo(bigDecimal2) == 0 && str.endsWith(".") && !z)) {
                return new C85224Mo(3, C17880vN.A0q(aaj.A01, aaj.A03.BLd(aaj.A02, bigDecimal2), AnonymousClass3MW.A1a(), 0, 2131894023));
            }
        }
        return new C85224Mo(i2, "");
    }

    public C20867Aaj(Context context, C18000vb r2, AnonymousClass1KJ r3, AnonymousClass1KN r4, AnonymousClass1KN r5, AnonymousClass1KN r6, C187419fm r7) {
        this.A01 = context;
        this.A05 = r7;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = r4;
        this.A04 = r5;
        this.A06 = r6;
    }
}
