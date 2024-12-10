package X;

import java.util.Arrays;

/* renamed from: X.09k  reason: invalid class name and case insensitive filesystem */
public final class C016709k extends AnonymousClass0PQ {
    public final C016509i A00;
    public final C016509i A01;
    public final float[] A02;

    public static final float[] A00(C016509i r9, C016509i r10) {
        AnonymousClass0KO r1 = r9.A07;
        AnonymousClass0KO r8 = r10.A07;
        if (C04960Pr.A02(r1, r8)) {
            return C04960Pr.A04(r10.A08, r9.A0A);
        }
        float[] fArr = r9.A0A;
        float[] fArr2 = r10.A08;
        float[] A002 = r1.A00();
        float[] A003 = r8.A00();
        AnonymousClass0KO r5 = C03060Gl.A01;
        if (!C04960Pr.A02(r1, r5)) {
            float[] fArr3 = AnonymousClass0MZ.A01.A00;
            float[] copyOf = Arrays.copyOf(C03060Gl.A04, 3);
            C18070vi.A0X(copyOf);
            fArr = C04960Pr.A04(C04960Pr.A05(fArr3, A002, copyOf), fArr);
        }
        if (!C04960Pr.A02(r8, r5)) {
            float[] fArr4 = AnonymousClass0MZ.A01.A00;
            float[] copyOf2 = Arrays.copyOf(C03060Gl.A04, 3);
            C18070vi.A0X(copyOf2);
            fArr2 = C04960Pr.A03(C04960Pr.A04(C04960Pr.A05(fArr4, A003, copyOf2), r10.A0A));
        }
        return C04960Pr.A04(fArr2, fArr);
    }

    public long A02(float f, float f2, float f3, float f4) {
        C16380sA r2 = this.A01.A02;
        float Bdp = (float) r2.Bdp((double) f);
        float Bdp2 = (float) r2.Bdp((double) f2);
        float Bdp3 = (float) r2.Bdp((double) f3);
        float[] fArr = this.A02;
        float A09 = AnonymousClass001.A09(fArr, Bdp, Bdp2, Bdp3);
        float A08 = AnonymousClass001.A08(fArr, Bdp, Bdp2, Bdp3);
        float A07 = AnonymousClass001.A07(fArr, Bdp, Bdp2, Bdp3);
        C016509i r5 = this.A00;
        C16380sA r22 = r5.A04;
        return AnonymousClass0Oy.A03(r5, (float) r22.Bdp((double) A09), (float) r22.Bdp((double) A08), (float) r22.Bdp((double) A07), f4);
    }

    public C016709k(C016509i r2, C016509i r3) {
        super(r2, r3, r2, r3);
        this.A01 = r2;
        this.A00 = r3;
        this.A02 = A00(r2, r3);
    }
}
