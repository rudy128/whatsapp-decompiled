package X;

/* renamed from: X.0PQ  reason: invalid class name */
public class AnonymousClass0PQ {
    public static final AnonymousClass0PQ A04;
    public static final AnonymousClass0PQ A05;
    public static final AnonymousClass0PQ A06;
    public final C03710Kf A00;
    public final C03710Kf A01;
    public final C03710Kf A02;
    public final C03710Kf A03;

    static {
        C016509i r2 = C03090Go.A0G;
        A05 = new C016609j(r2);
        C03710Kf r1 = C03090Go.A02;
        A06 = new AnonymousClass0PQ(r2, r1);
        A04 = new AnonymousClass0PQ(r1, r2);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0PQ(X.C03710Kf r7, X.C03710Kf r8) {
        /*
            r6 = this;
            long r1 = r7.A01
            long r4 = X.AnonymousClass0MS.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0024
            X.0KO r1 = X.C03060Gl.A01
            X.0MZ r0 = X.AnonymousClass0MZ.A01
            X.0Kf r3 = A01(r0, r7, r1)
        L_0x0010:
            long r1 = r8.A01
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0022
            X.0KO r1 = X.C03060Gl.A01
            X.0MZ r0 = X.AnonymousClass0MZ.A01
            X.0Kf r0 = A01(r0, r8, r1)
        L_0x001e:
            r6.<init>(r7, r8, r3, r0)
            return
        L_0x0022:
            r0 = r8
            goto L_0x001e
        L_0x0024:
            r3 = r7
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0PQ.<init>(X.0Kf, X.0Kf):void");
    }

    public static final C03710Kf A01(AnonymousClass0MZ r11, C03710Kf r12, AnonymousClass0KO r13) {
        if (r12.A01 == AnonymousClass0MS.A01) {
            C18070vi.A0z(r12, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            C016509i r3 = (C016509i) r12;
            AnonymousClass0KO r4 = r3.A07;
            AnonymousClass0KO r7 = r13;
            if (!C04960Pr.A02(r4, r13)) {
                float[] A042 = C04960Pr.A04(C04960Pr.A05(r11.A00, r4.A00(), r13.A00()), r3.A0A);
                String str = r3.A02;
                float[] fArr = r3.A09;
                return new C016509i(r3.A05, r3.A03, r3.A06, r7, str, fArr, A042, r3.A01, r3.A00, -1);
            }
        }
        return r12;
    }

    public long A02(float f, float f2, float f3, float f4) {
        C03710Kf r2 = this.A03;
        long A062 = r2.A06(f, f2, f3);
        return this.A02.A07(this.A00, AnonymousClass001.A02(A062), AnonymousClass001.A01(A062), r2.A03(f, f2, f3), f4);
    }

    public AnonymousClass0PQ(C03710Kf r1, C03710Kf r2, C03710Kf r3, C03710Kf r4) {
        this.A01 = r1;
        this.A00 = r2;
        this.A03 = r3;
        this.A02 = r4;
    }
}
