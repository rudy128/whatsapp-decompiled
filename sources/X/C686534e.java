package X;

import java.util.Iterator;

/* renamed from: X.34e  reason: invalid class name and case insensitive filesystem */
public final class C686534e implements C25471Oi, AnonymousClass3M6 {
    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvt(C63362sw r1) {
    }

    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    public /* bridge */ /* synthetic */ B5K CBD(C194979sb r5, C29621ca r6) {
        C18070vi.A0d(r6, 0);
        Iterator A03 = C29621ca.A03(r6, "enc");
        while (A03.hasNext()) {
            int A0A = C17880vN.A0a(A03).A0A("duration", -1);
            if (A0A >= 0) {
                return new C687934s(A0A);
            }
        }
        return null;
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }

    public String BSr() {
        return "IncomingLiveLocationHandler";
    }

    public void Bvr(C166278cd r3, AnonymousClass206 r4, C63362sw r5) {
        C18070vi.A0i(r5, r4);
        C687934s r1 = (C687934s) C63362sw.A00(r5, C687934s.class);
        if (r1 != null && (r4 instanceof AnonymousClass219)) {
            ((AnonymousClass219) r4).A00 = r1.A00;
        }
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }

    public /* synthetic */ boolean CM6(C63362sw r2) {
        return false;
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }
}
