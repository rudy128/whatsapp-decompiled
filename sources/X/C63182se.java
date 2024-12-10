package X;

/* renamed from: X.2se  reason: invalid class name and case insensitive filesystem */
public class C63182se {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public static final Boolean A00(C63182se r3) {
        int A002 = C18020vd.A00(C18040vf.A02, r3.A00, 11642);
        if (A002 == 0) {
            return null;
        }
        return Boolean.valueOf(AnonymousClass000.A1T(C17890vO.A00(C17900vP.A02(r3.A03), "axolotl_lid_sender_key_migration_completed_v2"), A002));
    }

    public static final Boolean A01(C63182se r3) {
        int A002 = C18020vd.A00(C18040vf.A02, r3.A00, 11643);
        if (A002 == 0) {
            return null;
        }
        return Boolean.valueOf(AnonymousClass000.A1T(C17890vO.A00(C17900vP.A02(r3.A03), "axolotl_lid_session_migration_completed_v2"), A002));
    }

    public C63182se(C18030ve r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }

    public final boolean A02() {
        Boolean A002;
        Boolean A012 = A01(this);
        if (A012 == null || !A012.booleanValue() || (A002 = A00(this)) == null || !A002.booleanValue()) {
            return false;
        }
        return true;
    }
}
