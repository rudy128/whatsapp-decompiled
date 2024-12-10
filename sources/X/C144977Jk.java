package X;

import android.content.SharedPreferences;

/* renamed from: X.7Jk  reason: invalid class name and case insensitive filesystem */
public final class C144977Jk implements C25471Oi {
    public final C18010vc A00;
    public final C18100vl A01 = AnonymousClass1DF.A01(new C153237pC(this));

    public C144977Jk(C18010vc r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public static final synchronized SharedPreferences.Editor A00(C144977Jk r1) {
        SharedPreferences.Editor A0A;
        synchronized (r1) {
            A0A = C17890vO.A0A(r1.A01);
            C18070vi.A0X(A0A);
        }
        return A0A;
    }

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvr(C166278cd r1, AnonymousClass206 r2, C63362sw r3) {
    }

    public void Bvt(C63362sw r7) {
        C18070vi.A0d(r7, 0);
        AnonymousClass206 r0 = r7.A0A;
        if (r0 != null && (r0 instanceof C440922c)) {
            C17880vN.A1D(A00(this), "ptv_receive_count", C17890vO.A05(C17880vN.A0C(this.A01), "ptv_receive_count") + 1);
        }
    }

    public String BSr() {
        return "PtvSharedPreferences";
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }
}
