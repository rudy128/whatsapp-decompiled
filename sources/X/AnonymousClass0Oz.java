package X;

/* renamed from: X.0Oz  reason: invalid class name */
public abstract class AnonymousClass0Oz {
    public static final boolean A01(AnonymousClass0KX r1) {
        if (!r1.A0C || r1.A0B) {
            return false;
        }
        return true;
    }

    public static final boolean A02(AnonymousClass0KX r5, long j) {
        long j2 = r5.A06;
        float A01 = AnonymousClass0QY.A01(j2);
        float A02 = AnonymousClass0QY.A02(j2);
        int A0G = AnonymousClass000.A0G(j);
        int A0H = AnonymousClass000.A0H(j);
        if (A01 < 0.0f || A01 > ((float) A0G) || A02 < 0.0f || A02 > ((float) A0H)) {
            return true;
        }
        return false;
    }

    public static final boolean A03(AnonymousClass0KX r6, long j, long j2) {
        if (r6.A04 != 1) {
            return A02(r6, j);
        }
        long j3 = r6.A06;
        float A01 = AnonymousClass0QY.A01(j3);
        float A02 = AnonymousClass0QY.A02(j3);
        float f = -AnonymousClass0QG.A02(j2);
        float A022 = AnonymousClass000.A02(j) + AnonymousClass0QG.A02(j2);
        float f2 = -AnonymousClass0QG.A00(j2);
        float A0H = ((float) AnonymousClass000.A0H(j)) + AnonymousClass0QG.A00(j2);
        if (A01 < f || A01 > A022 || A02 < f2 || A02 > A0H) {
            return true;
        }
        return false;
    }

    public static final boolean A00(AnonymousClass0KX r1) {
        if (r1.A02() || !r1.A0C || r1.A0B) {
            return false;
        }
        return true;
    }
}
