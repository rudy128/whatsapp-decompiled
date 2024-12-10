package X;

/* renamed from: X.AVo  reason: case insensitive filesystem */
public final class C20708AVo implements C25471Oi, AnonymousClass3M6 {
    public final AnonymousClass190 A00;

    public C20708AVo(AnonymousClass190 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public void Bvr(C166278cd r6, AnonymousClass206 r7, C63362sw r8) {
        String str;
        C18070vi.A0e(r8, 0, r7);
        AnonymousClass190 r2 = this.A00;
        C20713AVt aVt = (C20713AVt) r8.A06(C20713AVt.class);
        String str2 = r8.A0R;
        if (aVt != null) {
            str = aVt.A00;
        } else {
            str = null;
        }
        if ("poll".equals(str2) && "vote".equals(str) && !(r7 instanceof AnonymousClass22E)) {
            if (!(r7 instanceof AnonymousClass23U) || ((AnonymousClass23U) r7).A00 != 67) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("type=");
                A10.append(str2);
                AnonymousClass206.A07(r7, " media_wa_type=", A10);
                r2.A0G("MessageUtils/buildFMessage message type does not correspond to an encoded message", A10.toString(), false);
                throw AnonymousClass8BR.A0p("poll_update_message_stanza_invalid", 76);
            }
        }
    }

    public /* synthetic */ void Bvt(C63362sw r1) {
    }

    public /* synthetic */ void CB9(C63362sw r1, C29621ca r2) {
    }

    public String BSr() {
        return "IncomingPollMessageHandler";
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }

    public /* synthetic */ long CBC(C29621ca r3) {
        return 0;
    }

    public /* bridge */ /* synthetic */ B5K CBD(C194979sb r4, C29621ca r5) {
        String A0Q;
        C29621ca A0A = C18070vi.A0A(r5);
        if (A0A == null || (A0Q = A0A.A0Q("polltype", (String) null)) == null) {
            return null;
        }
        return new C20713AVt(A0Q);
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
