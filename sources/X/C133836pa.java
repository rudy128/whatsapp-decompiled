package X;

import com.whatsapp.Me;

/* renamed from: X.6pa  reason: invalid class name and case insensitive filesystem */
public final class C133836pa {
    public final C18030ve A00;
    public final C18100vl A01 = AnonymousClass1DF.A00(AnonymousClass00R.A0C, new C152477ny(this));
    public final AnonymousClass11S A02;
    public final C18000vb A03;
    public final AnonymousClass1K3 A04;

    public final String A00() {
        String A0p;
        AnonymousClass11S r0 = this.A02;
        r0.A0I();
        Me me = r0.A00;
        if (me == null || (A0p = C108965cb.A0p(me)) == null || A0p.length() == 0) {
            return "ZZ";
        }
        return A0p;
    }

    public final String A01(String str) {
        String A032;
        if (C18070vi.A18(str, "Global")) {
            return "Global";
        }
        if (str != null && (A032 = this.A04.A03(this.A03, str)) != null) {
            return A032;
        }
        AnonymousClass11S r0 = this.A02;
        r0.A0I();
        Me me = r0.A00;
        if (me != null) {
            return this.A04.A03(this.A03, C108965cb.A0p(me));
        }
        return null;
    }

    public C133836pa(AnonymousClass11S r3, C18000vb r4, C18030ve r5, AnonymousClass1K3 r6) {
        C18070vi.A0s(r5, r3, r6, r4);
        this.A00 = r5;
        this.A02 = r3;
        this.A04 = r6;
        this.A03 = r4;
    }
}
