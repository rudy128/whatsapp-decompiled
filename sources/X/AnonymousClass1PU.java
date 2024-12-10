package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.1PU  reason: invalid class name */
public class AnonymousClass1PU {
    public final AnonymousClass1CJ A00;
    public final AnonymousClass1MZ A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;

    public boolean A02(AnonymousClass1EC r4) {
        if (r4 == null || this.A00.A06(r4) != 3) {
            return false;
        }
        return true;
    }

    public boolean A03(AnonymousClass1EC r3) {
        if (r3 == null || this.A00.A06(r3) != 1) {
            return false;
        }
        return true;
    }

    public AnonymousClass1PU(AnonymousClass1CJ r1, AnonymousClass1MZ r2, C18030ve r3, AnonymousClass00H r4) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = r4;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0024, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r4.A02, 5021) != false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A00(X.AnonymousClass1EC r5) {
        /*
            r4 = this;
            boolean r0 = r4.A03(r5)
            if (r0 == 0) goto L_0x0008
            r1 = 4
        L_0x0007:
            return r1
        L_0x0008:
            if (r5 == 0) goto L_0x0027
            X.1CJ r1 = r4.A00
            int r0 = r1.A06(r5)
            r3 = 2
            if (r0 == r3) goto L_0x0026
            int r1 = r1.A06(r5)
            r0 = 6
            if (r1 != r0) goto L_0x0027
            X.0ve r2 = r4.A02
            r1 = 5021(0x139d, float:7.036E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0027
        L_0x0026:
            return r3
        L_0x0027:
            boolean r0 = r4.A02(r5)
            r1 = 1
            if (r0 == 0) goto L_0x0007
            r1 = 3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1PU.A00(X.1EC):int");
    }

    public boolean A01(AnonymousClass1E7 r5, AnonymousClass1BI r6) {
        if (!r5.A0F() || !C22971Dz.A0e(r6)) {
            return false;
        }
        AnonymousClass00H r1 = this.A03;
        if (!((C42211xo) r1.get()).A02(r5)) {
            C42211xo r12 = (C42211xo) r1.get();
            if (!r12.A01(r5) && !r12.A00(r5) && r5.A05 != 1) {
                if (!r5.A0f || this.A01.A0K((GroupJid) r6)) {
                    return false;
                }
                return true;
            }
        }
        return true;
    }
}
