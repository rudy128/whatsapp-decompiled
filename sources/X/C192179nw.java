package X;

import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.9nw  reason: invalid class name and case insensitive filesystem */
public final class C192179nw {
    public final C18030ve A00;
    public final AnonymousClass18O A01;

    public final int A00() {
        int A002 = C18020vd.A00(C18040vf.A02, this.A00, 471);
        if (A002 <= 0) {
            A002 = this.A01.A04(AnonymousClass18O.A1R);
        }
        return A002 & 12252;
    }

    public final boolean A01() {
        if (!C18020vd.A05(C18040vf.A02, this.A00, 3214) || (A00() & DefaultCrypto.BUFFER_SIZE) <= 0) {
            return false;
        }
        return true;
    }

    public C192179nw(AnonymousClass18O r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }
}
