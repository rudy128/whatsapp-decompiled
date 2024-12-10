package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.34X  reason: invalid class name */
public final class AnonymousClass34X implements C25471Oi {
    public final C26811To A00;
    public final C25181Nf A01;
    public final AnonymousClass10I A02;

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvr(C166278cd r1, AnonymousClass206 r2, C63362sw r3) {
    }

    public void Bvt(C63362sw r5) {
        C18070vi.A0d(r5, 0);
        UserJid A05 = r5.A05();
        if (A05 != null) {
            AnonymousClass1E7 A012 = this.A01.A01(A05);
            if (!A012.A10) {
                A012.A10 = true;
                this.A02.CGF(new C70623Bv(this, A012, 31));
            }
        }
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public AnonymousClass34X(C26811To r1, C25181Nf r2, AnonymousClass10I r3) {
        C18070vi.A0o(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String BSr() {
        return "ContactsIncomingMessageListener";
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }
}
