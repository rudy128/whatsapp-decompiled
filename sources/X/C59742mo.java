package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.2mo  reason: invalid class name and case insensitive filesystem */
public final class C59742mo {
    public final AnonymousClass190 A00;
    public final AnonymousClass1M9 A01;
    public final AnonymousClass1CJ A02;
    public final C24751Ln A03;
    public final AnonymousClass18K A04;
    public final C18030ve A05;

    public final int A00(AnonymousClass1E9 r4) {
        C18070vi.A0d(r4, 0);
        boolean z = r4 instanceof C47712Jo;
        int i = 2;
        AnonymousClass1M9 r0 = this.A01;
        if (z) {
            AnonymousClass1E7 A0E = r0.A0E(r4);
            if (A0E == null || !C18070vi.A18(A0E.A0O, "lid")) {
                return 0;
            }
        } else {
            AnonymousClass1E7 A0G = r0.A0G(r4);
            if (A0G == null || !"lid".equals(A0G.A0O)) {
                C36321nh r02 = GroupJid.Companion;
                i = 1;
                if (!this.A02.A0R(C36321nh.A00(r4))) {
                    return 0;
                }
            }
        }
        return i;
    }

    public final String A01(AnonymousClass1E9 r2) {
        C18070vi.A0d(r2, 0);
        AnonymousClass1E7 A0G = this.A01.A0G(r2);
        if (A0G != null) {
            return A0G.A0O;
        }
        return "pn";
    }

    public final boolean A02(GroupJid groupJid, String str) {
        if (groupJid != null) {
            C18030ve r2 = this.A05;
            C18040vf r1 = C18040vf.A02;
            return C18020vd.A05(r1, r2, 3688) && (!this.A02.A0R(groupJid) || C18020vd.A05(r1, r2, 12481)) && !C18070vi.A18(A01(groupJid), str);
        }
    }

    public C59742mo(AnonymousClass190 r2, AnonymousClass1M9 r3, AnonymousClass1CJ r4, C24751Ln r5, C18030ve r6, AnonymousClass18K r7) {
        C18070vi.A0w(r6, r2, r4, r7, r3);
        C18070vi.A0d(r5, 6);
        this.A05 = r6;
        this.A00 = r2;
        this.A02 = r4;
        this.A04 = r7;
        this.A01 = r3;
        this.A03 = r5;
    }
}
