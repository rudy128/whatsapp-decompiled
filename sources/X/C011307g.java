package X;

/* renamed from: X.07g  reason: invalid class name and case insensitive filesystem */
public final class C011307g extends AnonymousClass0PV {
    public static final C011307g A00 = new C011307g();

    public C011307g() {
        super(0, 1);
    }

    public String A05(int i) {
        if (i == 0) {
            return "nodes";
        }
        return super.A05(i);
    }

    public void A06(C16270rz r8, C15750r8 r9, AnonymousClass0Qu r10, AnonymousClass0r9 r11) {
        C18070vi.A0z(r8, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        C05840Vx r112 = (C05840Vx) r11;
        for (Object obj : (Object[]) r112.A03.A07[r112.A01]) {
            AnonymousClass0VP r2 = (AnonymousClass0VP) r8;
            r2.A02.add(r2.A00);
            r2.A00 = obj;
        }
    }
}
