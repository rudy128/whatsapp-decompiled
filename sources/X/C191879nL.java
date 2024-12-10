package X;

/* renamed from: X.9nL  reason: invalid class name and case insensitive filesystem */
public class C191879nL {
    public final C24361Ka A00;
    public final AnonymousClass1SV A01;
    public final C24371Kb A02;
    public final AnonymousClass1KX A03;
    public final AnonymousClass1SJ A04;
    public final C183199Xi A05;
    public final C187309fb A06 = new Object();
    public final C186819eo A07 = new Object();
    public final AnonymousClass99o A08;
    public final String A09;
    public final String A0A;
    public final C190089kM A0B;

    /* JADX WARNING: type inference failed for: r2v3, types: [X.9tP, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r0 == null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0052, code lost:
        if (r0 != 0) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C195479tP A00() {
        /*
            r13 = this;
            X.9eo r3 = r13.A07
            android.os.SystemClock.elapsedRealtime()
            X.9kM r5 = r13.A0B
            r4 = 0
            X.AVT r0 = new X.AVT
            r0.<init>(r13, r4)
            java.lang.Object r2 = r5.A00(r0)
            X.9tP r2 = (X.C195479tP) r2
            if (r2 == 0) goto L_0x0019
            X.9Hz r0 = r2.A02
            if (r0 != 0) goto L_0x0033
        L_0x0019:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "resumecheck/failed; no routes; hash="
            r1.append(r0)
            java.lang.String r0 = r13.A09
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)
            X.9tP r2 = new X.9tP
            r2.<init>()
            X.9Hz r0 = X.C179449Hz.FAILURE
            r2.A02 = r0
            r2.A04 = r1
        L_0x0033:
            X.9Hz r0 = r2.A02
            X.C17960vV.A07(r0)
            android.os.SystemClock.elapsedRealtime()
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A01
            int r0 = r0.get()
            java.lang.Long r0 = X.C17880vN.A0n(r0)
            r3.A02 = r0
            X.9Hz r0 = r2.A02
            if (r0 == 0) goto L_0x0054
            int r0 = r0.ordinal()
            r1 = 1
            if (r0 == r1) goto L_0x006f
            if (r0 == r4) goto L_0x0055
        L_0x0054:
            r1 = 2
        L_0x0055:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.A01 = r0
            X.9fb r0 = r13.A06
            long r7 = r0.A00
            long r9 = r0.A02
            java.lang.Boolean r5 = r0.A03
            long r11 = r0.A01
            java.lang.String r6 = r0.A04
            X.6iI r4 = new X.6iI
            r4.<init>(r5, r6, r7, r9, r11)
            r3.A00 = r4
            return r2
        L_0x006f:
            r1 = 3
            goto L_0x0055
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191879nL.A00():X.9tP");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.9eo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v1, types: [X.9fb, java.lang.Object] */
    public C191879nL(C24361Ka r2, AnonymousClass1SV r3, C24371Kb r4, AnonymousClass1KX r5, AnonymousClass1SJ r6, C190089kM r7, C183199Xi r8, AnonymousClass99o r9, String str, String str2) {
        this.A00 = r2;
        this.A04 = r6;
        this.A03 = r5;
        this.A01 = r3;
        this.A02 = r4;
        this.A0B = r7;
        this.A09 = str;
        this.A08 = r9;
        this.A0A = str2;
        this.A05 = r8;
    }
}
