package X;

/* renamed from: X.37Z  reason: invalid class name */
public final class AnonymousClass37Z implements AnonymousClass3M6 {
    public final C18030ve A00;
    public final AnonymousClass00H A01;

    public /* synthetic */ B5K CBD(C194979sb r2, C29621ca r3) {
        return null;
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }

    public AnonymousClass37Z(C18030ve r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void CB9(C63362sw r12, C29621ca r13) {
        String str;
        Boolean bool;
        boolean A18;
        C18070vi.A0h(r13, r12);
        String A0Q = r13.A0Q("username", (String) null);
        String A0Q2 = r13.A0Q("recipient_username", (String) null);
        C29621ca A0K = r13.A0K("meta");
        if (A0K != null) {
            str = A0K.A0Q("liveloc_mode", (String) null);
        } else {
            str = null;
        }
        boolean A182 = C18070vi.A18(str, "lid");
        C18030ve r5 = this.A00;
        C63182se r0 = (C63182se) C18070vi.A0E(this.A01);
        C18070vi.A0d(r0, 1);
        if (!r0.A02() || C18020vd.A00(C18040vf.A02, r5, 7821) != 1) {
            bool = null;
        } else {
            if (A0K == null) {
                A18 = true;
            } else {
                A18 = C18070vi.A18(A0K.A0Q("deprecated_lid_session", "true"), "true");
            }
            bool = Boolean.valueOf(A18);
        }
        String A002 = C42671yY.A00(r13.A0Q("addressing_mode", (String) null));
        r12.A06 = new C62532rY(r12.A0a, r12.A0b, r12.A0e, r12.A0c, r12.A0d, A0Q, A0Q2, A182);
        r12.A0E = bool;
        r12.A0M = A002;
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }

    public /* synthetic */ boolean CM6(C63362sw r2) {
        return false;
    }
}
