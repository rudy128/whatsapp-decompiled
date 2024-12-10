package X;

/* renamed from: X.0Qk  reason: invalid class name and case insensitive filesystem */
public final class C05100Qk {
    public static final long A01 = (4278190080L << 32);
    public static final long A02 = (4278190335L << 32);
    public static final long A03 = (4294901760L << 32);
    public static final long A04 = (0 << 32);
    public static final long A05 = AnonymousClass0Oy.A03(C03090Go.A0H, 0.0f, 0.0f, 0.0f, 0.0f);
    public static final C02540Ek A06 = new Object();
    public final long A00;

    public static final double A00(long j) {
        return (((double) (j >>> 11)) * 2048.0d) + ((double) (j & 2047));
    }

    public static final float A01(long j) {
        float A002;
        float f;
        if ((63 & j) == 0) {
            A002 = (float) A00((j >>> 56) & 255);
            f = 255.0f;
        } else {
            A002 = (float) A00((j >>> 6) & 1023);
            f = 1023.0f;
        }
        return A002 / f;
    }

    public static final float A02(long j) {
        if ((63 & j) == 0) {
            return ((float) A00((j >>> 32) & 255)) / 255.0f;
        }
        return C06360Ya.A00((short) ((int) ((j >>> 16) & 65535)));
    }

    public static final float A03(long j) {
        if ((63 & j) == 0) {
            return ((float) A00((j >>> 40) & 255)) / 255.0f;
        }
        return C06360Ya.A00((short) ((int) ((j >>> 32) & 65535)));
    }

    public static final float A04(long j) {
        int i = ((63 & j) > 0 ? 1 : ((63 & j) == 0 ? 0 : -1));
        long j2 = j >>> 48;
        if (i == 0) {
            return ((float) A00(j2 & 255)) / 255.0f;
        }
        return C06360Ya.A00((short) ((int) (j2 & 65535)));
    }

    public static final AnonymousClass0PQ A07(C03710Kf r5, C03710Kf r6) {
        C016509i r1 = C03090Go.A0G;
        if (r5 == r1) {
            if (r6 == r1) {
                return AnonymousClass0PQ.A05;
            }
            if (r6 == C03090Go.A02) {
                return AnonymousClass0PQ.A06;
            }
        } else if (r5 == C03090Go.A02 && r6 == r1) {
            return AnonymousClass0PQ.A04;
        }
        if (r5 == r6) {
            return new C016609j(r5);
        }
        long j = r5.A01;
        long j2 = AnonymousClass0MS.A01;
        if (j != j2 || r6.A01 != j2) {
            return new AnonymousClass0PQ(r5, r6);
        }
        AnonymousClass0PQ r0 = AnonymousClass0PQ.A06;
        C18070vi.A0z(r5, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        C18070vi.A0z(r6, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new C016709k((C016509i) r5, (C016509i) r6);
    }

    public boolean equals(Object obj) {
        long j = this.A00;
        if (!(obj instanceof C05100Qk) || j != ((C05100Qk) obj).A00) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass000.A0I(this.A00);
    }

    public String toString() {
        return A08(this.A00);
    }

    public /* synthetic */ C05100Qk(long j) {
        this.A00 = j;
    }

    public static final long A06(C03710Kf r4, long j) {
        C03710Kf A11 = AnonymousClass001.A11(j);
        if (!C18070vi.A18(r4, A11)) {
            return A07(A11, r4).A02(A04(j), A03(j), A02(j), A01(j));
        }
        return j;
    }

    public static String A08(long j) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Color(");
        A10.append(A04(j));
        A10.append(", ");
        A10.append(A03(j));
        A10.append(", ");
        A10.append(A02(j));
        A10.append(", ");
        A10.append(A01(j));
        A10.append(", ");
        A10.append(AnonymousClass001.A11(j).A02);
        return AnonymousClass001.A1J(A10);
    }
}
