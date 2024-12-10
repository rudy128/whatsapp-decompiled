package X;

/* renamed from: X.71Z  reason: invalid class name */
public final class AnonymousClass71Z {
    public final C18030ve A00;

    public AnonymousClass71Z(C18030ve r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final boolean A02(String str) {
        C18030ve r3 = this.A00;
        String A0v = C108955ca.A0v(r3, 7050);
        if (C18020vd.A05(C18040vf.A02, r3, 6617) || AnonymousClass1YF.A0Y(A0v, C17890vO.A0c(AnonymousClass000.A11(str), ','), false)) {
            return true;
        }
        return false;
    }

    public static C18030ve A00(AnonymousClass00H r0) {
        return ((AnonymousClass71Z) r0.get()).A00;
    }

    public static boolean A01(AnonymousClass00H r2) {
        return C18020vd.A05(C18040vf.A02, ((AnonymousClass71Z) r2.get()).A00, 1023);
    }
}
