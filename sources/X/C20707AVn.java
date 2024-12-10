package X;

/* renamed from: X.AVn  reason: case insensitive filesystem */
public final class C20707AVn implements C25471Oi, AnonymousClass3M6 {
    public final AnonymousClass190 A00;

    public C20707AVn(AnonymousClass190 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        if (((X.AnonymousClass23U) r8).A00 != 85) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bvr(X.C166278cd r7, X.AnonymousClass206 r8, X.C63362sw r9) {
        /*
            r6 = this;
            r4 = 0
            X.C18070vi.A0e(r9, r4, r8)
            X.190 r3 = r6.A00
            java.lang.String r5 = r9.A0R
            java.lang.String r0 = "event"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L_0x005e
            java.lang.Class<X.AVs> r0 = X.C20712AVs.class
            X.B5K r0 = X.C63362sw.A00(r9, r0)
            X.AVs r0 = (X.C20712AVs) r0
            if (r0 == 0) goto L_0x005c
            java.lang.String r1 = r0.A00
        L_0x001c:
            java.lang.String r0 = "response"
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x005e
            boolean r0 = r8 instanceof X.AnonymousClass23U
            if (r0 == 0) goto L_0x0032
            r0 = r8
            X.23U r0 = (X.AnonymousClass23U) r0
            int r2 = r0.A00
            r0 = 85
            r1 = 1
            if (r2 == r0) goto L_0x0033
        L_0x0032:
            r1 = 0
        L_0x0033:
            boolean r0 = r8 instanceof X.AnonymousClass24H
            if (r0 != 0) goto L_0x005e
            if (r1 != 0) goto L_0x005e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "type="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = " media_wa_type="
            X.AnonymousClass206.A07(r8, r0, r1)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "MessageUtils/buildFMessage message type does not correspond to an encoded message"
            r3.A0G(r0, r1, r4)
            r1 = 76
            java.lang.String r0 = "event_response_message_stanza_invalid"
            X.1hd r0 = X.AnonymousClass8BR.A0p(r0, r1)
            throw r0
        L_0x005c:
            r1 = 0
            goto L_0x001c
        L_0x005e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20707AVn.Bvr(X.8cd, X.206, X.2sw):void");
    }

    public /* synthetic */ void Bvt(C63362sw r1) {
    }

    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    public String BSr() {
        return "IncomingEventMessageHandler";
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }

    public /* bridge */ /* synthetic */ B5K CBD(C194979sb r3, C29621ca r4) {
        String A02;
        C29621ca A0A = C18070vi.A0A(r4);
        if (A0A == null || (A02 = C29621ca.A02(A0A, "event_type")) == null) {
            return null;
        }
        return new C20712AVs(A02);
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
