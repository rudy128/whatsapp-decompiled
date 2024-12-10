package X;

/* renamed from: X.34g  reason: invalid class name and case insensitive filesystem */
public final class C686734g implements C25471Oi, AnonymousClass3M6 {
    public final C18030ve A00;
    public final C192419oM A01;

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvt(C63362sw r1) {
    }

    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }

    public C686734g(C192419oM r1, C18030ve r2) {
        C18070vi.A0j(r2, r1);
        this.A00 = r2;
        this.A01 = r1;
    }

    public String BSr() {
        return "ChatOriginMessageHandler";
    }

    public void Bvr(C166278cd r4, AnonymousClass206 r5, C63362sw r6) {
        AnonymousClass1BI r2;
        C18070vi.A0i(r6, r5);
        C687634p r1 = (C687634p) C63362sw.A00(r6, C687634p.class);
        if (r1 != null && (r2 = r6.A0B.A00) != null && C22971Dz.A0T(r2)) {
            C49502Qs r12 = r1.A00;
            this.A01.A01(r12, r2);
            r5.A0J = r12;
        }
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }

    public /* bridge */ /* synthetic */ B5K CBD(C194979sb r7, C29621ca r8) {
        C49502Qs r0;
        String str;
        C29621ca A0A = C18070vi.A0A(r8);
        if (C18020vd.A05(C18040vf.A02, this.A00, 11440)) {
            C49502Qs r4 = C49502Qs.GENERAL;
            C49502Qs r3 = C49502Qs.CTWA;
            String str2 = r3.origin;
            if (A0A != null) {
                str = C29621ca.A02(A0A, "origin");
            } else {
                str = null;
            }
            if (AnonymousClass1YE.A09(str2, str, true)) {
                r4 = r3;
            }
            return new C687634p(r4);
        }
        if (A0A == null || (r0 = C29731cm.A00(C29621ca.A02(A0A, "origin"))) == null) {
            r0 = C49502Qs.CTWA;
        }
        return new C687634p(r0);
    }

    public /* synthetic */ boolean CM6(C63362sw r2) {
        return false;
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }
}
