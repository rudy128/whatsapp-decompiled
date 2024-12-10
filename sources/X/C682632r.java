package X;

import java.util.Set;

/* renamed from: X.32r  reason: invalid class name and case insensitive filesystem */
public final class C682632r implements C25341Nv {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;

    public boolean Bca(AnonymousClass206 r2) {
        C18070vi.A0d(r2, 0);
        return r2 instanceof AnonymousClass22M;
    }

    public Set BZv() {
        return C18070vi.A0P(C178119Bw.class);
    }

    public C682632r(AnonymousClass00H r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }

    public void Bhl(AnonymousClass25F r8) {
        AnonymousClass206 A08 = C18070vi.A08(r8);
        if (A08 instanceof AnonymousClass22M) {
            AnonymousClass22M r6 = (AnonymousClass22M) A08;
            long A002 = ((C56742hx) this.A01.get()).A00(r6);
            if (A002 != -1) {
                AnonymousClass00H r4 = this.A00;
                C178119Bw A04 = ((AnonymousClass1TD) r4.get()).A04(A002);
                if (A04 != null || (A04 = ((AnonymousClass1TD) r4.get()).A05(A002)) != null) {
                    r6.A00.A02(A04);
                }
            }
        }
    }
}
