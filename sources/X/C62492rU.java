package X;

/* renamed from: X.2rU  reason: invalid class name and case insensitive filesystem */
public class C62492rU {
    public final C22498BAf A00;
    public final C56202h4 A01;
    public final C56232h8 A02;
    public final C62022qf A03;
    public final C188859i7 A04;

    public int A00() {
        if (this instanceof AnonymousClass2KK) {
            return 3;
        }
        if (this instanceof AnonymousClass2KJ) {
            return 4;
        }
        return 0;
    }

    public boolean A01() {
        C56232h8 r1 = this.A02;
        if (C63972u0.A06(r1.A06)) {
            return r1.A0E;
        }
        return r1.A0D;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[job_id=");
        sb.append(this.A01.A0D);
        return AnonymousClass000.A0z(sb);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C62492rU(X.AnonymousClass34B r7, X.C56232h8 r8) {
        /*
            r6 = this;
            java.lang.String r5 = r7.A04()
            X.BAf r1 = r7.A0M
            X.2h4 r2 = r7.A0N
            X.2ta r0 = r7.A0P
            X.2qf r4 = r0.A03
            r0 = r6
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62492rU.<init>(X.34B, X.2h8):void");
    }

    public C62492rU(C22498BAf bAf, C56202h4 r3, C56232h8 r4, C62022qf r5, String str) {
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = bAf;
        C188859i7 r0 = new C188859i7();
        this.A04 = r0;
        r0.A0Q = str;
    }
}
