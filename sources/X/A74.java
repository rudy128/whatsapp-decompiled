package X;

public class A74 {
    public final AnonymousClass1R3 A00;
    public final AnonymousClass12L A01;
    public final AnonymousClass18K A02;
    public final AnonymousClass10I A03;
    public final AnonymousClass00H A04;

    public static void A01(A74 a74, AnonymousClass1BI r7, Integer num, Integer num2, int i) {
        A74 a742 = a74;
        AnonymousClass1BI r3 = r7;
        if (C42761yh.A01(a74.A01, r7)) {
            a74.A03.CGF(new AnonymousClass7Q7(a742, r3, num, num2, i, 3));
        }
    }

    public static String A00(AnonymousClass206 r3) {
        String str = r3.A0v.A01;
        if (!AnonymousClass1EG.A0H(str)) {
            String[] split = str.split("-");
            if (split.length >= 2) {
                return split[0];
            }
        }
        return null;
    }

    public static void A02(A74 a74, AnonymousClass1BI r6, Integer num, Integer num2, int i) {
        if (C42761yh.A01(a74.A01, r6)) {
            C171328rX r2 = new C171328rX();
            AnonymousClass206 A06 = a74.A00.A06(r6, true);
            if (A06 != null) {
                r2.A00 = Integer.valueOf(C62242r5.A00(A06, a74.A04));
                r2.A05 = Long.valueOf(A06.A0I);
                r2.A06 = A06.A0v.A01;
                r2.A07 = A00(A06);
            }
            r2.A02 = Integer.valueOf(i);
            r2.A03 = num;
            r2.A04 = 1;
            r2.A01 = num2;
            a74.A02.CC7(r2);
        }
    }

    public static void A03(A74 a74, AnonymousClass206 r5, int i) {
        AnonymousClass12L r2 = a74.A01;
        if (r5 != null) {
            AnonymousClass205 r1 = r5.A0v;
            if (C42761yh.A01(r2, r1.A00)) {
                C170978qy r3 = new C170978qy();
                r3.A03 = r1.A01;
                r3.A02 = A00(r5);
                r3.A00 = Integer.valueOf(C1409973w.A01(r5.A0u, r5.A09, AnonymousClass25A.A0t(r5)));
                r3.A01 = Integer.valueOf(i);
                a74.A02.CC7(r3);
            }
        }
    }

    public A74(AnonymousClass1R3 r1, AnonymousClass12L r2, AnonymousClass18K r3, AnonymousClass10I r4, AnonymousClass00H r5) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
        this.A04 = r5;
    }
}
