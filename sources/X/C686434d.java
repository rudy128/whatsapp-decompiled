package X;

import android.util.Base64;

/* renamed from: X.34d  reason: invalid class name and case insensitive filesystem */
public final class C686434d implements C25471Oi, AnonymousClass3M6 {
    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvt(C63362sw r1) {
    }

    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    public /* bridge */ /* synthetic */ B5K CBD(C194979sb r3, C29621ca r4) {
        byte[] bArr;
        String encodeToString;
        C18070vi.A0d(r4, 0);
        C29621ca A0K = r4.A0K("rcat");
        if (A0K == null || (bArr = A0K.A01) == null || (encodeToString = Base64.encodeToString(bArr, 10)) == null) {
            return null;
        }
        return new C687834r(encodeToString);
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }

    public String BSr() {
        return "RcatIncomingMessageHandler";
    }

    public void Bvr(C166278cd r3, AnonymousClass206 r4, C63362sw r5) {
        C18070vi.A0i(r5, r4);
        C687834r r1 = (C687834r) C63362sw.A00(r5, C687834r.class);
        if (r1 != null && (r4 instanceof AnonymousClass210)) {
            ((AnonymousClass210) r4).A04 = r1.A00;
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
