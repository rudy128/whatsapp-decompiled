package X;

/* renamed from: X.07t  reason: invalid class name */
public final class AnonymousClass07t extends AnonymousClass0PV {
    public static final AnonymousClass07t A00 = new AnonymousClass07t();

    public AnonymousClass07t() {
        super(1, 2);
    }

    public String A04(int i) {
        if (i == 0) {
            return "insertIndex";
        }
        return super.A04(i);
    }

    public String A05(int i) {
        if (i == 0) {
            return "factory";
        }
        if (i == 1) {
            return "groupAnchor";
        }
        return super.A05(i);
    }

    public void A06(C16270rz r5, C15750r8 r6, AnonymousClass0Qu r7, AnonymousClass0r9 r8) {
        C05840Vx r82 = (C05840Vx) r8;
        C04910Pm r3 = r82.A03;
        Object invoke = ((C18090vk) r3.A07[r82.A01]).invoke();
        C18070vi.A0z(r5, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
        int i = ((C02090Cr) r3.A07[r82.A01 + 1]).A00;
        if (i < 0) {
            i += AnonymousClass0Qu.A00(r7);
        }
        AnonymousClass0Qu.A0I(r7, invoke, i);
        AnonymousClass0VP r52 = (AnonymousClass0VP) r5;
        r52.A02.add(r52.A00);
        r52.A00 = invoke;
    }
}
