package X;

import com.facebook.msys.mci.DefaultCrypto;
import java.util.List;

/* renamed from: X.9uX  reason: invalid class name and case insensitive filesystem */
public final class C196149uX {
    public final AnonymousClass1PM A00;
    public final C18030ve A01;
    public final AnonymousClass11S A02;
    public final C19830z4 A03;
    public final C198989zF A04;
    public final AnonymousClass00H A05;

    public final String A00(AEW aew) {
        C192179nw r3 = (C192179nw) this.A05.get();
        if (!C18020vd.A05(C18040vf.A02, r3.A00, 3832) || (r3.A00() & DefaultCrypto.BUFFER_SIZE) <= 0 || aew == null || !aew.A0Y) {
            return "UNBLOCKED";
        }
        return aew.A0C;
    }

    public final boolean A01(AEW aew) {
        String str;
        if (!C18020vd.A05(C18040vf.A02, this.A01, 355) || aew == null || (str = aew.A0K) == null || str.length() == 0) {
            return false;
        }
        return this.A04.A01(str);
    }

    public final boolean A02(AEW aew) {
        if (aew == null || !aew.A0Z || aew.A0a) {
            return false;
        }
        if (!aew.A0Y) {
            return true;
        }
        return A04(aew);
    }

    public final boolean A03(AEW aew) {
        C18030ve r2 = this.A01;
        C18040vf r1 = C18040vf.A02;
        if (!C18020vd.A05(r1, r2, 355) || !C18020vd.A05(r1, r2, 636) || !A01(aew)) {
            return false;
        }
        return true;
    }

    public final boolean A04(AEW aew) {
        List list;
        if (!((C192179nw) this.A05.get()).A01() || aew == null || !aew.A0Y || (list = aew.A0R) == null || this.A02.A0O(aew.A09)) {
            return true;
        }
        C19830z4 r2 = this.A03;
        String A002 = AnonymousClass1K3.A00(r2.A0l());
        if (A002 == null || A002.equals("ZZ")) {
            A002 = AnonymousClass1K3.A01(r2.A0l(), r2.A0n());
        }
        return list.contains(A002);
    }

    public C196149uX(AnonymousClass11S r2, AnonymousClass1PM r3, C19830z4 r4, C18030ve r5, C198989zF r6, AnonymousClass00H r7) {
        C18070vi.A0w(r5, r6, r4, r2, r3);
        C18070vi.A0d(r7, 6);
        this.A01 = r5;
        this.A04 = r6;
        this.A03 = r4;
        this.A02 = r2;
        this.A00 = r3;
        this.A05 = r7;
    }
}
