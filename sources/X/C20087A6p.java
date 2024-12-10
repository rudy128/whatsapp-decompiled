package X;

/* renamed from: X.A6p  reason: case insensitive filesystem */
public abstract class C20087A6p {
    public static C20112A7u A00(AnonymousClass11P r7, AnonymousClass1KN r8, C19962A0v a0v, String str, boolean z) {
        C20112A7u[] a7uArr;
        C198769ys r5;
        int A00;
        if (a0v == null || (r5 = a0v.A01) == null || (A00 = a0v.A00(AnonymousClass11P.A00(r7))) == 0 || A00 == 3) {
            a7uArr = new C20112A7u[0];
        } else {
            C176058zi r4 = new C176058zi();
            r4.A08("is_ended_early", AnonymousClass000.A1T(A00, 4));
            if (z) {
                r4.A08("is_sender_receiver_eligible", AnonymousClass000.A1P(a0v.A00));
            }
            AnonymousClass1KN r0 = ((ARR) r5.A09.A00).A02;
            if (r8 != null) {
                r4.A08("is_amount_low", C108975cc.A19(r8.A00.compareTo(r0.A00)));
            }
            a7uArr = new C20112A7u[]{r4};
        }
        C20112A7u A03 = C20112A7u.A03(a7uArr);
        if (str != null) {
            A03.A07("section", str);
        }
        if (A03.A01.length() > 0) {
            return A03;
        }
        return null;
    }

    public static C20112A7u A01(AnonymousClass11P r2, AnonymousClass1KN r3, C19962A0v a0v, boolean z) {
        C20112A7u A00 = A00(r2, r3, a0v, (String) null, true);
        if (A00 == null) {
            A00 = C20112A7u.A02();
        }
        A00.A08("is_p2m_buyer_initiated", z);
        return A00;
    }

    public static void A02(C20112A7u a7u, BD4 bd4, Integer num, String str, String str2, int i) {
        BD4 bd42 = bd4;
        C17960vV.A07(bd4);
        Integer num2 = num;
        String str3 = str;
        String str4 = str2;
        int i2 = i;
        if (a7u != null) {
            bd42.BiM(a7u, num2, str3, str4, i2);
        } else {
            bd42.BiL(num2, str3, str4, i);
        }
    }

    public static void A03(C20112A7u a7u, BD4 bd4, String str, String str2) {
        A02(a7u, bd4, (Integer) null, str, str2, 0);
    }

    public static void A04(C19962A0v a0v, AnonymousClass8GH r6, int i) {
        A02(A00(r6.A05, (AnonymousClass1KN) null, a0v, (String) null, false), r6.A09, Integer.valueOf(i), "payment_home", (String) null, 1);
    }
}
