package X;

/* renamed from: X.9FQ  reason: invalid class name */
public class AnonymousClass9FQ extends AnonymousClass9CP {
    public final int A00;
    public final Object A01;

    public static final AnonymousClass9DP A00(C29621ca r4, C29621ca r5, C62672rm r6, A96 a96) {
        AnonymousClass9DB A07;
        int A17 = C18070vi.A17(a96, r4);
        if (AnonymousClass8BR.A1Q(r5, r6)) {
            String[] strArr = new String[A17];
            C29621ca A0Z = AnonymousClass8BT.A0Z(r5, "error", strArr);
            if (A0Z == null) {
                AnonymousClass8BY.A11(r5, r6, strArr, 0);
            } else {
                AnonymousClass9D6 A012 = A96.A01(A0Z, r6);
                if (!(A012 == null || (A07 = A96.A07(r5, r4, r6)) == null)) {
                    return new AnonymousClass9DP(r5, A012, A07);
                }
            }
        }
        return null;
    }

    public AnonymousClass9FQ(C29621ca r11, AnonymousClass9F7 r12, int i) {
        Object obj;
        this.A00 = i;
        switch (i) {
            case 4:
                C108945cZ.A1N(r11);
                Object obj2 = r12.A00;
                C62672rm A0s = AnonymousClass8BR.A0s();
                A96 a96 = A96.A00;
                C22470B9c[] b9cArr = new C22470B9c[5];
                b9cArr[0] = new C21289Aha(obj2, a96, 0);
                b9cArr[1] = new C21289Aha(obj2, a96, 1);
                b9cArr[2] = new C21289Aha(obj2, a96, 2);
                b9cArr[3] = new C21289Aha(obj2, a96, 3);
                obj = A0s.A06(r11, "BadRequestIQErrorResponse|UnavailableForLegalReasonsResponse|ItemNotFoundIQErrorResponse|SuspendedIQErrorResponse|RateLimitedIQErrorResponse", C18070vi.A0O(new C21289Aha(obj2, a96, 4), b9cArr, 4), new String[0]);
                if (obj == null) {
                    throw AnonymousClass1O9.A00(A0s);
                }
                break;
            case 5:
                C108945cZ.A1N(r11);
                C62672rm A0s2 = AnonymousClass8BR.A0s();
                obj = A00((C29621ca) r12.A00, r11, A0s2, A96.A00);
                if (obj == null) {
                    throw AnonymousClass1O9.A00(A0s2);
                }
                break;
            case 6:
                C108945cZ.A1N(r11);
                Object obj3 = r12.A00;
                C62672rm A0s3 = AnonymousClass8BR.A0s();
                A96 a962 = A96.A00;
                C22470B9c[] b9cArr2 = new C22470B9c[6];
                b9cArr2[0] = new C21289Aha(obj3, a962, 5);
                b9cArr2[1] = new C21289Aha(obj3, a962, 6);
                b9cArr2[2] = new C21289Aha(obj3, a962, 7);
                b9cArr2[3] = new C21289Aha(obj3, a962, 8);
                b9cArr2[4] = new C21289Aha(obj3, a962, 9);
                obj = A0s3.A06(r11, "BadRequestIQErrorResponse|UnavailableForLegalReasonsResponse|ItemNotFoundIQErrorResponse|SuspendedIQErrorResponse|RateLimitedIQErrorResponse|NotAllowedIQErrorResponse", C18070vi.A0O(new C21289Aha(obj3, a962, 10), b9cArr2, 5), new String[0]);
                if (obj == null) {
                    throw AnonymousClass1O9.A00(A0s3);
                }
                break;
            case 7:
                C108945cZ.A1N(r11);
                Object obj4 = r12.A00;
                C62672rm A0s4 = AnonymousClass8BR.A0s();
                A96 a963 = A96.A00;
                C22470B9c[] b9cArr3 = new C22470B9c[4];
                b9cArr3[0] = new C21289Aha(obj4, a963, 11);
                b9cArr3[1] = new C21289Aha(obj4, a963, 12);
                b9cArr3[2] = new C21289Aha(obj4, a963, 13);
                obj = A0s4.A06(r11, "BadRequestIQErrorResponse|UnauthorizedIQErrorResponse|ItemNotFoundIQErrorResponse|RateLimitedIQErrorResponse", C18070vi.A0O(new C21289Aha(obj4, a963, 14), b9cArr3, 3), new String[0]);
                if (obj == null) {
                    throw AnonymousClass1O9.A00(A0s4);
                }
                break;
            case 8:
                C108945cZ.A1N(r11);
                C62672rm A0s5 = AnonymousClass8BR.A0s();
                obj = A00((C29621ca) r12.A00, r11, A0s5, A96.A00);
                if (obj == null) {
                    throw AnonymousClass1O9.A00(A0s5);
                }
                break;
            case 9:
                C108945cZ.A1N(r11);
                Object obj5 = r12.A00;
                C62672rm A0s6 = AnonymousClass8BR.A0s();
                A96 a964 = A96.A00;
                C22470B9c[] b9cArr4 = new C22470B9c[5];
                b9cArr4[0] = new C21289Aha(obj5, a964, 15);
                b9cArr4[1] = new C21289Aha(obj5, a964, 16);
                b9cArr4[2] = new C21289Aha(obj5, a964, 17);
                b9cArr4[3] = new C21289Aha(obj5, a964, 18);
                obj = A0s6.A06(r11, "BadRequestIQErrorResponse|UnavailableForLegalReasonsResponse|ItemNotFoundIQErrorResponse|SuspendedIQErrorResponse|RateLimitedIQErrorResponse", C18070vi.A0O(new C21289Aha(obj5, a964, 19), b9cArr4, 4), new String[0]);
                if (obj == null) {
                    throw AnonymousClass1O9.A00(A0s6);
                }
                break;
            default:
                C108945cZ.A1N(r11);
                C62672rm A0s7 = AnonymousClass8BR.A0s();
                obj = A00((C29621ca) r12.A00, r11, A0s7, A96.A00);
                if (obj == null) {
                    throw AnonymousClass1O9.A00(A0s7);
                }
                break;
        }
        this.A01 = obj;
        this.A00 = r11;
    }

    public AnonymousClass9FQ(C29621ca r4, AnonymousClass9F6 r5, int i) {
        Object obj;
        this.A00 = i;
        C29621ca A002 = AnonymousClass9F6.A00(r4, r5);
        C62672rm A0s = AnonymousClass8BR.A0s();
        if (i != 0) {
            C18070vi.A0h(A97.A00, A002);
            obj = A97.A00(r4, A002, A0s);
            if (obj == null) {
                throw AnonymousClass1O9.A00(A0s);
            }
        } else {
            C18070vi.A0h(A8Z.A00, A002);
            obj = A8Z.A02(r4, A002, A0s);
            if (obj == null) {
                throw AnonymousClass1O9.A00(A0s);
            }
        }
        this.A01 = obj;
        this.A00 = r4;
    }

    public AnonymousClass9FQ(C29621ca r4, AnonymousClass9F5 r5, int i) {
        Object obj;
        this.A00 = i;
        C18070vi.A0d(r5, 2);
        C29621ca A03 = C20121A8g.A03(r4, r5);
        C62672rm A0s = AnonymousClass8BR.A0s();
        if (2 - i != 0) {
            C18070vi.A0h(C20022A3o.A00, A03);
            obj = C20022A3o.A00(r4, A03, A0s);
            if (obj == null) {
                throw AnonymousClass1O9.A00(A0s);
            }
        } else {
            C18070vi.A0h(A8H.A00, A03);
            obj = A8H.A01(r4, A03, A0s);
            if (obj == null) {
                throw AnonymousClass1O9.A00(A0s);
            }
        }
        this.A01 = obj;
        this.A00 = r4;
    }

    public AnonymousClass9FQ(C29621ca r5, AnonymousClass9F1 r6) {
        this.A00 = 1;
        C108945cZ.A1N(r5);
        C29621ca r2 = r6.A00;
        C62672rm A0s = AnonymousClass8BR.A0s();
        C108975cc.A12(A8Z.A00, r2, 1);
        C178359Cu A02 = A8Z.A02(r5, r2, A0s);
        if (A02 != null) {
            this.A01 = A02;
            this.A00 = r5;
            return;
        }
        throw AnonymousClass1O9.A00(A0s);
    }
}
