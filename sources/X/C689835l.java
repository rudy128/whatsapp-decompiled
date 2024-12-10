package X;

import android.os.Parcelable;

/* renamed from: X.35l  reason: invalid class name and case insensitive filesystem */
public final class C689835l implements C107605aI {
    public final AnonymousClass1M9 A00;
    public final AnonymousClass1CJ A01;
    public final AnonymousClass1MZ A02;
    public final AnonymousClass00H A03;

    public boolean Bfs(AnonymousClass206 r7) {
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        AnonymousClass1EC A002 = C42941yz.A00(r7.A0v.A00);
        if (A002 == null) {
            return true;
        }
        int A06 = this.A01.A06(A002);
        if (A06 == 0 || A06 == 6 || A06 == 2) {
            AnonymousClass1E7 A0E = this.A00.A0E(A002);
            if (A0E != null) {
                AnonymousClass00H r1 = this.A03;
                if (!((C42211xo) r1.get()).A02(A0E) && !((C42211xo) r1.get()).A00(A0E) && A0E.A05 != 1) {
                    AnonymousClass1MZ r0 = this.A02;
                    boolean A0J = r0.A0J(A002);
                    boolean A0K = r0.A0K(A002);
                    if (!A0J) {
                        return false;
                    }
                    if (A0K || !A0E.A13) {
                        return true;
                    }
                    return false;
                }
            }
        } else if (A06 != 3) {
            C17900vP.A0j("GroupPinInChatRestriction/isPinnable Unhandled group type ", AnonymousClass000.A10(), A06);
        } else {
            C42211xo r12 = (C42211xo) this.A03.get();
            if (!r12.A00(r12.A00.A0H(A002))) {
                return this.A02.A0K(A002);
            }
        }
        return false;
    }

    public C689835l(AnonymousClass1M9 r1, AnonymousClass1CJ r2, AnonymousClass1MZ r3, AnonymousClass00H r4) {
        C18070vi.A0s(r2, r1, r4, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }
}
