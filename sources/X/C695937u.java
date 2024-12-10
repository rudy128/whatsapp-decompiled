package X;

import com.whatsapp.jid.GroupJid;

/* renamed from: X.37u  reason: invalid class name and case insensitive filesystem */
public final class C695937u implements C108145bC {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass126 A01;
    public final AnonymousClass1CJ A02;
    public final AnonymousClass1MZ A03;
    public final AnonymousClass1PU A04;
    public final AnonymousClass00H A05;

    public final boolean A01(AnonymousClass206 r5) {
        AnonymousClass1E7 A0E;
        C18070vi.A0d(r5, 0);
        C36321nh r0 = GroupJid.Companion;
        GroupJid A002 = C36321nh.A00(r5.A0v.A00);
        if (this.A02.A06(A002) != 3 || !r5.A0t()) {
            return false;
        }
        if (A002 == null || (A0E = this.A00.A0E(A002)) == null) {
            return true;
        }
        AnonymousClass126 r2 = this.A01;
        if ((((C42211xo) r2.A1D.get()).A00(A0E) || r2.A0I(A0E) == 1) && !r5.A0z(16)) {
            return false;
        }
        return true;
    }

    public boolean Bfz(AnonymousClass206 r4) {
        C18070vi.A0d(r4, 0);
        AnonymousClass1BI r1 = r4.A0v.A00;
        if (!C22971Dz.A0e(r1) || !A00(r4)) {
            return false;
        }
        if (this.A02.A0R(r1)) {
            return this.A03.A0R(r4);
        }
        return true;
    }

    public boolean BgC(AnonymousClass206 r6) {
        C18070vi.A0d(r6, 0);
        C36321nh r0 = GroupJid.Companion;
        GroupJid A002 = C36321nh.A00(r6.A0v.A00);
        if (A002 != null) {
            if (!A01(r6)) {
                AnonymousClass1E7 A0E = this.A00.A0E(A002);
                if (A0E != null && this.A04.A01(A0E, A002)) {
                    return false;
                }
            }
        }
        return A00(r6);
    }

    private final boolean A00(AnonymousClass206 r4) {
        C36321nh r0 = GroupJid.Companion;
        GroupJid A002 = C36321nh.A00(r4.A0v.A00);
        if (A002 == null) {
            return true;
        }
        if ((this.A00.A0E(A002) == null || !((C42211xo) this.A05.get()).A03(A002)) && this.A03.A0J(A002)) {
            return true;
        }
        return false;
    }

    public C695937u(AnonymousClass1M9 r2, AnonymousClass1CJ r3, AnonymousClass1MZ r4, AnonymousClass126 r5, AnonymousClass1PU r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r2, r6, r7, r5);
        C18070vi.A0d(r4, 6);
        this.A02 = r3;
        this.A00 = r2;
        this.A04 = r6;
        this.A05 = r7;
        this.A01 = r5;
        this.A03 = r4;
    }
}
