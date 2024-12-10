package X;

/* renamed from: X.0OH  reason: invalid class name */
public final class AnonymousClass0OH {
    public static final AnonymousClass0OH A00 = new Object();

    public final long A01(int i, int i2, int i3, int i4) {
        C04660Og r15;
        C04660Og r14;
        int i5 = i;
        int i6 = i2;
        if (i5 == i6) {
            r15 = AnonymousClass0C7.A00;
        } else if (i == 0) {
            r15 = AnonymousClass0C9.A00;
        } else {
            r15 = AnonymousClass0C8.A00;
        }
        int i7 = i3;
        int i8 = i4;
        if (i7 == i8) {
            r14 = AnonymousClass0C7.A00;
        } else if (i3 == 0) {
            r14 = AnonymousClass0C9.A00;
        } else {
            r14 = AnonymousClass0C8.A00;
        }
        C25411Oc A06 = r15.A06();
        int A002 = A06.A00();
        int A01 = A06.A01();
        C25411Oc A062 = r14.A06();
        int A003 = A062.A00();
        int A012 = A062.A01();
        if (i < 0) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("minWidth must be >= 0, but was: ");
            A10.append(i5);
            A00(". minWidth=", ", maxWidth=", A10, i5, i6);
            A00(", minHeight=", ", maxHeight=", A10, i7, i8);
            throw AnonymousClass000.A0j(A10);
        } else if (i3 >= 0) {
            int i9 = A002;
            if (i5 <= i9 || i5 == Integer.MAX_VALUE) {
                int i10 = A01;
                if (i6 > i10 && i6 != Integer.MAX_VALUE) {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A00("maxWidth must be <= ", ", but was: ", A102, i10, i6);
                    A00(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A102, i5, i6);
                    A00(", minHeight=", ", maxHeight=", A102, i7, i8);
                    throw AnonymousClass000.A0j(A102);
                } else if (i7 > A003 && i7 != Integer.MAX_VALUE) {
                    StringBuilder A103 = AnonymousClass000.A10();
                    A00("minHeight must be <= ", ", but was: ", A103, A003, i7);
                    A00(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A103, i5, i6);
                    A00(", minHeight=", ", maxHeight=", A103, i7, i8);
                    throw AnonymousClass000.A0j(A103);
                } else if (i8 > A012 && i8 != Integer.MAX_VALUE) {
                    StringBuilder A104 = AnonymousClass000.A10();
                    A00("maxHeight must be <= ", ", but was: ", A104, A012, i8);
                    A00(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A104, i5, i6);
                    A00(", minHeight=", ", maxHeight=", A104, i7, i8);
                    throw AnonymousClass000.A0j(A104);
                } else if (i5 > i6) {
                    StringBuilder A105 = AnonymousClass000.A10();
                    A105.append("maxWidth must be >= minWidth, but was: maxWidth=");
                    A105.append(i6);
                    A105.append("; minWidth=");
                    A105.append(i5);
                    A00(". minWidth=", ", maxWidth=", A105, i5, i6);
                    A00(", minHeight=", ", maxHeight=", A105, i7, i8);
                    throw AnonymousClass000.A0j(A105);
                } else if (i7 <= i8) {
                    return (r15.A05(i5, i6) << 32) | r14.A05(i7, i8);
                } else {
                    StringBuilder A106 = AnonymousClass000.A10();
                    A106.append("maxHeight must be >= minHeight, but was: maxHeight=");
                    A106.append(i8);
                    A00("; minHeight=", ". minWidth=", A106, i7, i5);
                    A00(", maxWidth=", ", minHeight=", A106, i6, i7);
                    throw AnonymousClass001.A13(", maxHeight=", A106, i8);
                }
            } else {
                StringBuilder A107 = AnonymousClass000.A10();
                A00("minWidth must be <= ", ", but was: ", A107, i9, i5);
                A00(". Components this big may affect performance and lead to out of memory errors. minWidth=", ", maxWidth=", A107, i5, i6);
                A00(", minHeight=", ", maxHeight=", A107, i7, i8);
                throw AnonymousClass000.A0j(A107);
            }
        } else {
            StringBuilder A108 = AnonymousClass000.A10();
            A00("minHeight must be >= 0, but was: ", ". minWidth=", A108, i7, i5);
            A00(", maxWidth=", ", minHeight=", A108, i6, i7);
            throw AnonymousClass001.A13(", maxHeight=", A108, i8);
        }
    }

    public static void A00(String str, String str2, StringBuilder sb, int i, int i2) {
        sb.append(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i2);
    }
}
