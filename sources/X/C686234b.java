package X;

/* renamed from: X.34b  reason: invalid class name and case insensitive filesystem */
public final class C686234b implements C25471Oi, AnonymousClass3M6 {
    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvr(C166278cd r1, AnonymousClass206 r2, C63362sw r3) {
    }

    public /* synthetic */ void Bvt(C63362sw r1) {
    }

    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.34l, java.lang.Object, X.B5K] */
    public /* bridge */ /* synthetic */ B5K CBD(C194979sb r6, C29621ca r7) {
        C18070vi.A0d(r7, 0);
        String A0Q = r7.A0Q("tb_expiration_ts", (String) null);
        String A0Q2 = r7.A0Q("tb_cooldown", (String) null);
        if (A0Q == null) {
            if (A0Q2 == null) {
                return null;
            }
        } else if (A0Q2 != null) {
            try {
                long parseLong = Long.parseLong(A0Q);
                long parseLong2 = Long.parseLong(A0Q2);
                ? obj = new Object();
                obj.A01 = parseLong;
                obj.A00 = parseLong2;
                return obj;
            } catch (NumberFormatException unused) {
                throw AnonymousClass1UI.A01("tb_expiration_ts and tb_cooldown must be numbers");
            }
        }
        throw AnonymousClass1UI.A01("tb_expiration_ts and tb_cooldown must be both present or both absent");
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }

    public String BSr() {
        return "IncomingMessageTriggeredBlockHandler";
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
