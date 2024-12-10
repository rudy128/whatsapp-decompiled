package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.1xo  reason: invalid class name and case insensitive filesystem */
public final class C42211xo {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass1CJ A01;
    public final C18030ve A02;

    public C42211xo(AnonymousClass1M9 r2, AnonymousClass1CJ r3, C18030ve r4) {
        C18070vi.A0d(r4, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r2, 3);
        this.A02 = r4;
        this.A01 = r3;
        this.A00 = r2;
    }

    public final boolean A00(AnonymousClass1E7 r5) {
        GroupJid groupJid;
        if (!(r5 == null || (groupJid = (GroupJid) r5.A06(GroupJid.class)) == null)) {
            int A06 = this.A01.A06(groupJid);
            if (r5.A0F() && (A06 == 1 || A06 == 3)) {
                if (!C18020vd.A05(C18040vf.A02, this.A02, 10539)) {
                    return r5.A0t;
                }
                if (r5.A05 == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A01(AnonymousClass1E7 r5) {
        GroupJid groupJid;
        if (!(r5 == null || (groupJid = (GroupJid) r5.A06(GroupJid.class)) == null)) {
            int A06 = this.A01.A06(groupJid);
            if (r5.A0F() && ((A06 == 1 || A06 == 3) && r5.A0t)) {
                if (C18020vd.A05(C18040vf.A02, this.A02, 10539)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean A02(AnonymousClass1E7 r4) {
        if (r4 == null) {
            return false;
        }
        int A06 = this.A01.A06((GroupJid) r4.A06(AnonymousClass1EC.class));
        if (!r4.A0F() || A06 == 3 || A06 == 1) {
            return false;
        }
        return r4.A0t;
    }

    public final boolean A03(AnonymousClass1BI r3) {
        if (r3 == null || !C22971Dz.A0e(r3)) {
            return false;
        }
        return A02(this.A00.A0H(r3));
    }
}
