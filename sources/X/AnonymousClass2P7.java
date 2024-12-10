package X;

import android.os.Looper;

/* renamed from: X.2P7  reason: invalid class name */
public class AnonymousClass2P7 extends AnonymousClass1Q3 {
    public final int A00 = 1;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2P7(Looper looper, AnonymousClass1Q1 r3, AnonymousClass1Q2 r4, C24681Lg r5) {
        super(looper);
        this.A01 = r4;
        this.A03 = r5;
        this.A02 = r3;
        C18070vi.A0d(looper, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        X.C17890vO.A0r(r2, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0099, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMessage(android.os.Message r8) {
        /*
            r7 = this;
            int r0 = r7.A00
            if (r0 == 0) goto L_0x0051
            int r1 = r8.what
            r0 = 11
            if (r1 != r0) goto L_0x0022
            java.lang.Object r0 = r8.obj
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r4 = r0.first
            java.lang.Object r3 = r0.second
            java.lang.Object r2 = r7.A03
            X.10T r2 = (X.AnonymousClass10T) r2
            if (r3 == 0) goto L_0x0021
            r0 = 7
            X.35N r1 = new X.35N
            r1.<init>(r4, r3, r0)
        L_0x001e:
            r2.notifyAllObservers(r1)
        L_0x0021:
            return
        L_0x0022:
            r0 = 14
            java.lang.Object r4 = r8.obj
            if (r1 != r0) goto L_0x003c
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r3 = r4.first
            java.lang.Object r2 = r4.second
            java.lang.Object r5 = r7.A03
            X.10T r5 = (X.AnonymousClass10T) r5
            int r1 = r8.arg1
            r0 = 0
            X.7KV r4 = new X.7KV
            r4.<init>(r3, r1, r0, r2)
            goto L_0x00f3
        L_0x003c:
            X.206 r4 = (X.AnonymousClass206) r4
            r0 = 2
            if (r1 == r0) goto L_0x009a
            switch(r1) {
                case 10: goto L_0x0045;
                case 11: goto L_0x0044;
                case 12: goto L_0x007b;
                case 13: goto L_0x0089;
                default: goto L_0x0044;
            }
        L_0x0044:
            return
        L_0x0045:
            java.lang.Object r2 = r7.A03
            X.10T r2 = (X.AnonymousClass10T) r2
            r0 = 20
            X.4om r1 = new X.4om
            r1.<init>(r4, r0)
            goto L_0x001e
        L_0x0051:
            java.lang.Object r6 = r8.obj
            X.206 r6 = (X.AnonymousClass206) r6
            int r1 = r8.what
            r0 = 3
            if (r1 == r0) goto L_0x006f
            r0 = 4
            if (r1 == r0) goto L_0x00d1
            r0 = 5
            if (r1 == r0) goto L_0x00a4
            r0 = 6
            if (r1 != r0) goto L_0x0021
            java.lang.Object r1 = r7.A02
            X.1Q1 r1 = (X.AnonymousClass1Q1) r1
            X.205 r0 = r6.A0v
            X.1BI r0 = r0.A00
            r1.A01(r0)
            return
        L_0x006f:
            java.lang.Object r2 = r7.A03
            X.10T r2 = (X.AnonymousClass10T) r2
            r0 = 17
            X.4om r1 = new X.4om
            r1.<init>(r6, r0)
            goto L_0x001e
        L_0x007b:
            java.lang.Object r2 = r7.A02
            X.10T r2 = (X.AnonymousClass10T) r2
            X.1BI r1 = X.AnonymousClass205.A00(r4)
            X.C17960vV.A07(r1)
            r0 = 12
            goto L_0x0096
        L_0x0089:
            java.lang.Object r2 = r7.A02
            X.10T r2 = (X.AnonymousClass10T) r2
            X.1BI r1 = X.AnonymousClass205.A00(r4)
            X.C17960vV.A07(r1)
            r0 = 10
        L_0x0096:
            X.C17890vO.A0r(r2, r1, r0)
            return
        L_0x009a:
            java.lang.Object r1 = r7.A01
            X.1Q2 r1 = (X.AnonymousClass1Q2) r1
            int r0 = r8.arg1
            X.AnonymousClass1Q2.A00(r1, r4, r0)
            return
        L_0x00a4:
            java.lang.Object r4 = r7.A01
            X.1Q2 r4 = (X.AnonymousClass1Q2) r4
            int r3 = r8.arg1
            X.1Lg r2 = r4.A04
            r1 = 5
            X.AWu r0 = new X.AWu
            r0.<init>(r6, r3, r1)
            r2.notifyAllObservers(r0)
            X.AW0 r2 = X.AnonymousClass25B.A00(r6)
            if (r2 == 0) goto L_0x00c6
            X.00H r0 = r4.A05
            X.10T r1 = X.C17880vN.A0V(r0)
            r0 = 25
            X.C17890vO.A0s(r1, r2, r0)
        L_0x00c6:
            X.1Q1 r2 = r4.A03
            X.1BI r1 = X.AnonymousClass205.A00(r6)
            r0 = 0
            r2.A03(r1, r0)
            return
        L_0x00d1:
            java.lang.Object r4 = r7.A02
            X.1Q1 r4 = (X.AnonymousClass1Q1) r4
            X.1BI r3 = X.AnonymousClass205.A00(r6)
            X.11A r2 = X.C18070vi.A0B(r4, r3)
            r1 = 9
            X.3Bx r0 = new X.3Bx
            r0.<init>(r4, r3, r1)
            r2.CGP(r0)
            java.lang.Object r5 = r7.A03
            X.1Lg r5 = (X.C24681Lg) r5
            int r1 = r8.arg1
            r0 = 5
            X.AWu r4 = new X.AWu
            r4.<init>(r6, r1, r0)
        L_0x00f3:
            r5.notifyAllObservers(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass2P7.handleMessage(android.os.Message):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2P7(Looper looper, AnonymousClass1NN r3, AnonymousClass1Q2 r4, C24681Lg r5) {
        super(looper);
        this.A01 = r4;
        this.A03 = r5;
        this.A02 = r3;
        C18070vi.A0d(looper, 1);
    }
}
