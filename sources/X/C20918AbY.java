package X;

import java.util.Map;

/* renamed from: X.AbY  reason: case insensitive filesystem */
public final class C20918AbY implements C22522BBf {
    public final AnonymousClass1QD A00;
    public final AnonymousClass1QS A01;

    public /* bridge */ /* synthetic */ Object CFt(Enum enumR, Object obj, Map map) {
        boolean A0D;
        AnonymousClass1QK r8 = (AnonymousClass1QK) obj;
        C179899Ki r7 = (C179899Ki) enumR;
        boolean A17 = C18070vi.A17(r8, r7);
        int ordinal = r7.ordinal();
        if (ordinal == 0) {
            A0D = r8.A0D();
        } else if (ordinal == A17) {
            A0D = r8.A00.A03().getBoolean("payments_resume_onboarding_banner_started", false);
        } else if (ordinal == 2) {
            A0D = true;
            if (r8.A0D()) {
                AnonymousClass1QD r2 = this.A00;
                if ((r2.A03().contains("payment_is_first_send") && !r2.A03().getBoolean("payment_is_first_send", false)) || AnonymousClass8BR.A0O(this.A01).A0H() > 0) {
                    A0D = false;
                }
            }
        } else {
            throw AnonymousClass3MW.A14();
        }
        return Boolean.valueOf(A0D);
    }

    public C20918AbY(AnonymousClass1QD r1, AnonymousClass1QS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public Class BL8() {
        return C179899Ki.class;
    }
}
