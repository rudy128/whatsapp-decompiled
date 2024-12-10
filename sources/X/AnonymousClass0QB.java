package X;

/* renamed from: X.0QB  reason: invalid class name */
public abstract class AnonymousClass0QB {
    public static final AnonymousClass07W A00 = AnonymousClass0PZ.A02(C08890fp.A00);

    public static final long A00(AnonymousClass0OR r4, float f) {
        C18070vi.A0d(r4, 0);
        if (AnonymousClass000.A1P(Float.compare(f, 0.0f))) {
            return AnonymousClass000.A0V(r4.A0O);
        }
        return AnonymousClass0Oy.A02(AnonymousClass0Oy.A03(AnonymousClass001.A11(AnonymousClass000.A0V(r4.A0P)), C05100Qk.A04(AnonymousClass000.A0V(r4.A0P)), C05100Qk.A03(AnonymousClass000.A0V(r4.A0P)), C05100Qk.A02(AnonymousClass000.A0V(r4.A0P)), ((((float) Math.log((double) (f + 1.0f))) * 4.5f) + 2.0f) / 100.0f), AnonymousClass000.A0V(r4.A0O));
    }

    public static final long A02(AnonymousClass0OR r3, long j) {
        C17330uU r0;
        C18070vi.A0d(r3, 0);
        if (j == AnonymousClass000.A0V(r3.A0J)) {
            r0 = r3.A09;
        } else if (j == AnonymousClass000.A0V(r3.A0M)) {
            r0 = r3.A0B;
        } else if (j == AnonymousClass000.A0V(r3.A0R)) {
            r0 = r3.A0F;
        } else if (j == AnonymousClass000.A0V(r3.A00)) {
            r0 = r3.A06;
        } else if (j == AnonymousClass000.A0V(r3.A01)) {
            r0 = r3.A07;
        } else if (j == AnonymousClass000.A0V(r3.A0O)) {
            r0 = r3.A0D;
        } else if (j == AnonymousClass000.A0V(r3.A0Q)) {
            r0 = r3.A0E;
        } else if (j == AnonymousClass000.A0V(r3.A0K)) {
            r0 = r3.A0A;
        } else if (j == AnonymousClass000.A0V(r3.A0N)) {
            r0 = r3.A0C;
        } else if (j == AnonymousClass000.A0V(r3.A0S)) {
            r0 = r3.A0G;
        } else if (j == AnonymousClass000.A0V(r3.A02)) {
            r0 = r3.A08;
        } else if (j != AnonymousClass000.A0V(r3.A05)) {
            return C05100Qk.A05;
        } else {
            r0 = r3.A03;
        }
        return AnonymousClass000.A0V(r0);
    }

    public static final long A03(AnonymousClass0OR r1, Integer num) {
        C17330uU r0;
        C18070vi.A0d(r1, 0);
        C18070vi.A0d(num, 1);
        switch (num.intValue()) {
            case 1:
                r0 = r1.A01;
                break;
            case 2:
                r0 = r1.A02;
                break;
            case 3:
                r0 = r1.A03;
                break;
            case 4:
                r0 = r1.A04;
                break;
            case 5:
                r0 = r1.A05;
                break;
            case 6:
                r0 = r1.A06;
                break;
            case 7:
                r0 = r1.A07;
                break;
            case 8:
                r0 = r1.A08;
                break;
            case 9:
                r0 = r1.A09;
                break;
            case 10:
                r0 = r1.A0A;
                break;
            case 11:
                r0 = r1.A0B;
                break;
            case 12:
                r0 = r1.A0C;
                break;
            case 13:
                r0 = r1.A0D;
                break;
            case 14:
                r0 = r1.A0E;
                break;
            case 15:
                r0 = r1.A0F;
                break;
            case 16:
                r0 = r1.A0G;
                break;
            case 17:
                r0 = r1.A0H;
                break;
            case 18:
                r0 = r1.A0I;
                break;
            case 19:
                r0 = r1.A0J;
                break;
            case 20:
                r0 = r1.A0K;
                break;
            case 21:
                r0 = r1.A0L;
                break;
            case 22:
                r0 = r1.A0M;
                break;
            case 23:
                r0 = r1.A0N;
                break;
            case 24:
                return AnonymousClass000.A0V(r1.A0O);
            case 25:
                r0 = r1.A0P;
                break;
            default:
                r0 = r1.A0Q;
                break;
        }
        return AnonymousClass000.A0V(r0);
    }

    public static final long A05(C17130tn r1, Integer num) {
        C18070vi.A0d(num, 0);
        return A03((AnonymousClass0OR) r1.BFh(A00), num);
    }

    public static final long A01(AnonymousClass0OR r4, long j) {
        C18070vi.A0d(r4, 0);
        long A0V = AnonymousClass000.A0V(r4.A0O);
        C02540Ek r0 = C05100Qk.A06;
        if (j == A0V) {
            return A00(r4, 3.0f);
        }
        return j;
    }

    public static final long A04(C17130tn r5, long j) {
        long A02 = A02((AnonymousClass0OR) r5.BFh(A00), j);
        if (A02 == C05100Qk.A05) {
            return AnonymousClass001.A0v(r5);
        }
        return A02;
    }
}
