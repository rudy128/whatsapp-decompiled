package X;

/* renamed from: X.0Nx  reason: invalid class name and case insensitive filesystem */
public abstract class C04570Nx {
    public static final AnonymousClass07W A00 = AnonymousClass0PZ.A02(C08930ft.A00);

    public static final AnonymousClass0WV A00(AnonymousClass0NI r3, Integer num) {
        C18070vi.A0d(r3, 0);
        C18070vi.A0d(num, 1);
        switch (num.intValue()) {
            case 2:
                return r3.A00;
            case 3:
                AnonymousClass0WV r4 = r3.A00;
                AnonymousClass0VD r32 = new AnonymousClass0VD(0.0f);
                return new AnonymousClass0WV(r4.A03, r4.A02, new AnonymousClass0VD(0.0f), r32);
            case 4:
                return C04540Nu.A00;
            case 5:
                return r3.A01;
            case 6:
                AnonymousClass0WV r42 = r3.A01;
                return new AnonymousClass0WV(new AnonymousClass0VD(0.0f), r42.A02, r42.A00, new AnonymousClass0VD(0.0f));
            case 7:
                AnonymousClass0WV r43 = r3.A01;
                AnonymousClass0VD r33 = new AnonymousClass0VD(0.0f);
                return new AnonymousClass0WV(r43.A03, r43.A02, new AnonymousClass0VD(0.0f), r33);
            default:
                return r3.A02;
        }
    }

    public static final AnonymousClass0WV A01(C17130tn r1, Integer num) {
        C18070vi.A0d(num, 0);
        return A00((AnonymousClass0NI) r1.BFh(A00), num);
    }
}
