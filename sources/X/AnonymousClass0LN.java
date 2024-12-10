package X;

/* renamed from: X.0LN  reason: invalid class name */
public abstract class AnonymousClass0LN {
    public static final AnonymousClass0NU A00(C16910tQ r18) {
        C16910tQ r1 = r18;
        C16910tQ A01 = A01(r1);
        AnonymousClass0NU Bhs = A01(r1).Bhs(r1, true);
        long BZM = A01.BZM();
        float A02 = AnonymousClass000.A02(BZM);
        float A0H = (float) AnonymousClass000.A0H(BZM);
        float A022 = C28851b7.A02(Bhs.A01, 0.0f, A02);
        float A023 = C28851b7.A02(Bhs.A03, 0.0f, A0H);
        float A024 = C28851b7.A02(Bhs.A02, 0.0f, A02);
        float A025 = C28851b7.A02(Bhs.A00, 0.0f, A0H);
        if (A022 == A024 || A023 == A025) {
            return AnonymousClass0NU.A04;
        }
        long A0p = AnonymousClass001.A0p(A022, A023);
        long j = AnonymousClass0QY.A03;
        long Bhw = A01.Bhw(A0p);
        long Bhw2 = A01.Bhw(AnonymousClass001.A0p(A024, A023));
        long Bhw3 = A01.Bhw(AnonymousClass001.A0p(A024, A025));
        long Bhw4 = A01.Bhw(AnonymousClass001.A0p(A022, A025));
        float A012 = AnonymousClass0QY.A01(Bhw);
        float[] fArr = {AnonymousClass0QY.A01(Bhw2), AnonymousClass0QY.A01(Bhw4), AnonymousClass0QY.A01(Bhw3)};
        int i = 0;
        do {
            A012 = Math.min(A012, fArr[i]);
            i++;
        } while (i < 3);
        float A026 = AnonymousClass0QY.A02(Bhw);
        float[] fArr2 = {AnonymousClass0QY.A02(Bhw2), AnonymousClass0QY.A02(Bhw4), AnonymousClass0QY.A02(Bhw3)};
        int i2 = 0;
        do {
            A026 = Math.min(A026, fArr2[i2]);
            i2++;
        } while (i2 < 3);
        float A013 = AnonymousClass0QY.A01(Bhw);
        float[] fArr3 = {AnonymousClass0QY.A01(Bhw2), AnonymousClass0QY.A01(Bhw4), AnonymousClass0QY.A01(Bhw3)};
        int i3 = 0;
        do {
            A013 = Math.max(A013, fArr3[i3]);
            i3++;
        } while (i3 < 3);
        float A027 = AnonymousClass0QY.A02(Bhw);
        float[] fArr4 = {AnonymousClass0QY.A02(Bhw2), AnonymousClass0QY.A02(Bhw4), AnonymousClass0QY.A02(Bhw3)};
        int i4 = 0;
        do {
            A027 = Math.max(A027, fArr4[i4]);
            i4++;
        } while (i4 < 3);
        return new AnonymousClass0NU(A012, A026, A013, A027);
    }

    public static final C16910tQ A01(C16910tQ r3) {
        C01850Ad r2;
        C01850Ad r1;
        C16910tQ BWE = r3.BWE();
        while (true) {
            r2 = r3;
            r3 = BWE;
            if (BWE == null) {
                break;
            }
            BWE = BWE.BWE();
        }
        if ((r2 instanceof C01850Ad) && (r1 = (C01850Ad) r2) != null) {
            C01850Ad A0x = r1.A0x();
            while (true) {
                r2 = r1;
                r1 = A0x;
                if (A0x == null) {
                    break;
                }
                A0x = A0x.A0x();
            }
        }
        return r2;
    }
}
