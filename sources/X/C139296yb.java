package X;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.UUID;

/* renamed from: X.6yb  reason: invalid class name and case insensitive filesystem */
public final class C139296yb {
    public HashMap A00 = C17880vN.A11();
    public final AnonymousClass11P A01;
    public final C18030ve A02;
    public final C27491Wh A03;
    public final C25431Oe A04;
    public final AnonymousClass10I A05;
    public final C18100vl A06 = AnonymousClass7S4.A02(this, 28);
    public final C18100vl A07 = AnonymousClass7S4.A02(this, 29);
    public final AnonymousClass18K A08;

    public static final void A00(AnonymousClass6UM r6, C139296yb r7) {
        AnonymousClass11P r5 = r7.A01;
        long A042 = C17880vN.A04(SystemClock.elapsedRealtime() - r6.A00);
        if (A042 > 0) {
            C1183263a r2 = r6.A01;
            r2.A02 = Long.valueOf(A042);
            r2.A04 = Long.valueOf(AnonymousClass11P.A01(r5));
            r2.A05 = r7.A04.A03();
            r7.A08.CC4(r2);
        }
    }

    public final C132116mE A01(int i) {
        if (!C18020vd.A05(C18040vf.A02, this.A02, 4928)) {
            return null;
        }
        int leastSignificantBits = (int) UUID.randomUUID().getLeastSignificantBits();
        ((C200710s) this.A07.getValue()).execute(new AnonymousClass7RE(this, leastSignificantBits, i, 10));
        return new C132116mE(this, leastSignificantBits);
    }

    public C139296yb(AnonymousClass11P r2, C18030ve r3, AnonymousClass18K r4, C27491Wh r5, C25431Oe r6, AnonymousClass10I r7) {
        C18070vi.A0w(r2, r3, r7, r4, r6);
        C18070vi.A0d(r5, 6);
        this.A01 = r2;
        this.A02 = r3;
        this.A05 = r7;
        this.A08 = r4;
        this.A04 = r6;
        this.A03 = r5;
    }
}
