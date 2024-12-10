package X;

import java.io.File;

/* renamed from: X.1Vr  reason: invalid class name and case insensitive filesystem */
public class C27331Vr {
    public final AnonymousClass00H A00;
    public final C25331Nu A01;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r6 = (X.AnonymousClass21V) r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File A00(X.AnonymousClass206 r6) {
        /*
            boolean r0 = r6 instanceof X.AnonymousClass21V
            r5 = 0
            if (r0 == 0) goto L_0x0028
            X.21V r6 = (X.AnonymousClass21V) r6
            X.2rc r0 = r6.A02
            if (r0 == 0) goto L_0x0028
            java.io.File r0 = r0.A0G
            if (r0 == 0) goto L_0x0028
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0028
            X.2rc r0 = r6.A02
            java.io.File r0 = r0.A0G
            long r3 = r0.length()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0028
            X.2rc r0 = r6.A02
            java.io.File r0 = r0.A0G
            return r0
        L_0x0028:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C27331Vr.A00(X.206):java.io.File");
    }

    public byte[] A01(AnonymousClass206 r9) {
        C54912eu A002;
        C25331Nu r5 = this.A01;
        byte[] A05 = r5.A05(r9);
        if (A05 == null) {
            if (r9.A0E() == 1 && r9.A0x > 0) {
                if (r9 instanceof AnonymousClass21V) {
                    AnonymousClass21V r0 = (AnonymousClass21V) r9;
                    File A003 = A00(r0);
                    if (!(A003 == null || (A002 = ((C57852jk) this.A00.get()).A00(new C54902et(C63972u0.A02(r0), A003, r0.A06, false))) == null || (A05 = A002.A02) == null)) {
                        r5.A03(r9, A05);
                    }
                }
            }
            return null;
        }
        return A05;
    }

    public C27331Vr(C25331Nu r1, AnonymousClass00H r2) {
        this.A00 = r2;
        this.A01 = r1;
    }
}
