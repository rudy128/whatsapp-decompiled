package X;

import com.whatsapp.funstickers.logging.FunStickersFetchLogger$logError$2;

/* renamed from: X.71o  reason: invalid class name and case insensitive filesystem */
public final class C1404771o {
    public long A00;
    public long A01;
    public C1184463m A02;
    public Integer A03;
    public Long A04;
    public Long A05;
    public Long A06;
    public Long A07;
    public final AnonymousClass11P A08;
    public final C34991lS A09;
    public final C18030ve A0A;
    public final AnonymousClass18K A0B;
    public final C18600wl A0C;

    public static final void A00(C1184363l r1, C1404771o r2) {
        r1.A06 = r2.A07;
        r1.A05 = r2.A04;
        r1.A02 = r2.A03;
    }

    public static void A01(C1404771o r2) {
        r2.A05 = r2.A04;
        r2.A04 = null;
        r2.A01 = 0;
        r2.A00 = 0;
    }

    public final Object A02(Integer num, C30391dr r6, int i) {
        if (this.A04 != null) {
            if (i == 10) {
                this.A00++;
            }
            Object A002 = C30451dy.A00(r6, this.A0C, new FunStickersFetchLogger$logError$2(this, num, (C30391dr) null, i));
            if (A002 == C31751g4.COROUTINE_SUSPENDED) {
                return A002;
            }
        }
        return C27621Wu.A00;
    }

    public C1404771o(AnonymousClass11P r1, C34991lS r2, C18030ve r3, AnonymousClass18K r4, C18600wl r5) {
        C18070vi.A0w(r3, r4, r2, r1, r5);
        this.A0A = r3;
        this.A0B = r4;
        this.A09 = r2;
        this.A08 = r1;
        this.A0C = r5;
    }
}
