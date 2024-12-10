package X;

import java.util.List;

/* renamed from: X.2sj  reason: invalid class name and case insensitive filesystem */
public final class C63232sj {
    public static final List A02;
    public final C32011gU A00;
    public final AnonymousClass00H A01;

    public final boolean A03(AnonymousClass206 r6, AnonymousClass206 r7) {
        String str;
        AnonymousClass00H r1 = this.A01;
        Integer A012 = ((AnonymousClass4Xe) r1.get()).A01(r6);
        Integer A013 = ((AnonymousClass4Xe) r1.get()).A01(r7);
        if (!A00(this, r6) || !A00(this, r7) || A012 != A013) {
            return false;
        }
        C692036h A002 = AnonymousClass2UW.A00(r6);
        String str2 = null;
        if (A002 != null) {
            str = A002.A02;
        } else {
            str = null;
        }
        C692036h A003 = AnonymousClass2UW.A00(r7);
        if (A003 != null) {
            str2 = A003.A02;
        }
        if (!C18070vi.A18(str, str2)) {
            return false;
        }
        if (r6.A11(67108864) || r7.A11(67108864)) {
            return true;
        }
        return false;
    }

    public static final boolean A00(C63232sj r1, AnonymousClass206 r2) {
        if (!(r2 instanceof AnonymousClass210) || AnonymousClass2UX.A00(r2) == null || AnonymousClass2UW.A00(r2) == null || r1.A01(r2)) {
            return false;
        }
        return true;
    }

    public final boolean A02(AnonymousClass206 r3) {
        if (!(r3 instanceof AnonymousClass210) || AnonymousClass2UX.A00(r3) == null || AnonymousClass2UW.A00(r3) == null || !r3.A0z(256)) {
            return false;
        }
        return true;
    }

    static {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "instagram.com";
        A02 = C18070vi.A0O("www.instagram.com", A1Z, 1);
    }

    public C63232sj(C32011gU r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean A01(AnonymousClass206 r3) {
        AnonymousClass6RT r1;
        if (A02(r3)) {
            return true;
        }
        if (!(r3 instanceof AnonymousClass210) || AnonymousClass2UX.A00(r3) == null || AnonymousClass2UW.A00(r3) == null) {
            return false;
        }
        C693236t A002 = C60512o9.A00(r3);
        if (A002 != null) {
            r1 = A002.A01;
        } else {
            r1 = null;
        }
        if (r1 == AnonymousClass6RT.BOT_PLUGINS) {
            return true;
        }
        return false;
    }
}
