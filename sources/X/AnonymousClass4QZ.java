package X;

import java.util.List;

/* renamed from: X.4QZ  reason: invalid class name */
public final class AnonymousClass4QZ {
    public final C18000vb A00;
    public final AnonymousClass1K3 A01;
    public final AnonymousClass00H A02;

    public final Integer A00(AnonymousClass206 r5) {
        List<C61762qD> list;
        int i;
        C18070vi.A0d(r5, 0);
        if (!(r5 instanceof C439521o) || (list = ((C439521o) r5).A00.A06) == null) {
            return null;
        }
        for (C61762qD r2 : list) {
            AnonymousClass00H r1 = this.A02;
            C18070vi.A0b(r2);
            if (((AnonymousClass70P) r1.get()).A07(r2)) {
                i = 2131893422;
            } else if (((AnonymousClass70P) r1.get()).A09(r2)) {
                i = 2131893423;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public AnonymousClass4QZ(C18000vb r1, AnonymousClass1K3 r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
