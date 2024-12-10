package X;

/* renamed from: X.AVq  reason: case insensitive filesystem */
public final class C20710AVq implements C25471Oi, AnonymousClass3M6 {
    public final AnonymousClass11P A00;
    public final C19830z4 A01;
    public final AnonymousClass18K A02;

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvt(C63362sw r1) {
    }

    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    public C20710AVq(AnonymousClass11P r1, C19830z4 r2, AnonymousClass18K r3) {
        C18070vi.A0o(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }

    public String BSr() {
        return "IncomingMessageTriggerCSATHandler";
    }

    public void Bvr(C166278cd r4, AnonymousClass206 r5, C63362sw r6) {
        C20715AVv aVv;
        C18070vi.A0i(r6, r5);
        if (!(r5 instanceof C439721q) && (aVv = (C20715AVv) C63362sw.A00(r6, C20715AVv.class)) != null && (r5 instanceof C439421n)) {
            ((C439421n) r5).BaE().A00 = Long.valueOf(aVv.A00);
        }
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001a, code lost:
        if (r0 == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ X.B5K CBD(X.C194979sb r13, X.C29621ca r14) {
        /*
            r12 = this;
            X.C18070vi.A0h(r14, r13)
            java.lang.String r0 = "meta"
            X.1ca r2 = r14.A0K(r0)
            r9 = 0
            if (r2 == 0) goto L_0x001c
            java.lang.String r0 = "tm_csat_exp_ts"
            java.lang.String r1 = r2.A0Q(r0, r9)
            java.lang.String r0 = "tm_csat_cooldown"
            java.lang.String r0 = r2.A0Q(r0, r9)
            if (r1 != 0) goto L_0x001d
            if (r0 != 0) goto L_0x007e
        L_0x001c:
            return r9
        L_0x001d:
            if (r0 == 0) goto L_0x007e
            long r10 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x0077 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r3
            long r1 = java.lang.Long.parseLong(r1)     // Catch:{ NumberFormatException -> 0x0077 }
            long r1 = r1 * r3
            r3 = 0
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
            X.11P r0 = r12.A00     // Catch:{ NumberFormatException -> 0x0077 }
            long r3 = X.AnonymousClass11P.A01(r0)     // Catch:{ NumberFormatException -> 0x0077 }
            X.0z4 r8 = r12.A01     // Catch:{ NumberFormatException -> 0x0077 }
            android.content.SharedPreferences r0 = X.C17890vO.A0B(r8)     // Catch:{ NumberFormatException -> 0x0077 }
            java.lang.String r7 = "cooldown_expiry_time_millis"
            long r5 = X.C17890vO.A04(r0, r7)     // Catch:{ NumberFormatException -> 0x0077 }
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x001c
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r8)     // Catch:{ NumberFormatException -> 0x0077 }
            long r3 = r3 + r10
            X.C17880vN.A1D(r0, r7, r3)     // Catch:{ NumberFormatException -> 0x0077 }
            X.8rM r3 = new X.8rM     // Catch:{ NumberFormatException -> 0x0077 }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x0077 }
            com.whatsapp.jid.UserJid r0 = r13.A03     // Catch:{ NumberFormatException -> 0x0077 }
            java.lang.String r0 = X.C22971Dz.A06(r0)     // Catch:{ NumberFormatException -> 0x0077 }
            r3.A05 = r0     // Catch:{ NumberFormatException -> 0x0077 }
            java.lang.Integer r0 = X.C17880vN.A0i()     // Catch:{ NumberFormatException -> 0x0077 }
            r3.A03 = r0     // Catch:{ NumberFormatException -> 0x0077 }
            java.lang.Integer r0 = X.C17880vN.A0k()     // Catch:{ NumberFormatException -> 0x0077 }
            r3.A02 = r0     // Catch:{ NumberFormatException -> 0x0077 }
            X.18K r0 = r12.A02     // Catch:{ NumberFormatException -> 0x0077 }
            r0.CC4(r3)     // Catch:{ NumberFormatException -> 0x0077 }
            X.AVv r9 = new X.AVv     // Catch:{ NumberFormatException -> 0x0077 }
            r9.<init>(r1)     // Catch:{ NumberFormatException -> 0x0077 }
            return r9
        L_0x0077:
            java.lang.String r0 = "trigger_csat_expiration_ts or trigger_csat_cooldown is not a number"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        L_0x007e:
            java.lang.String r0 = "trigger_csat_expiration_ts or trigger_csat_cooldown is null"
            X.1UI r0 = X.AnonymousClass1UI.A01(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20710AVq.CBD(X.9sb, X.1ca):X.B5K");
    }

    public /* synthetic */ boolean CM6(C63362sw r2) {
        return false;
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public /* synthetic */ void CBF(C63362sw r1, C29621ca r2) {
    }
}
