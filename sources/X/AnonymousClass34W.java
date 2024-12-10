package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.34W  reason: invalid class name */
public final class AnonymousClass34W implements C25471Oi {
    public final A1E A00;
    public final AnonymousClass10I A01;

    public /* synthetic */ void BBw(AnonymousClass206 r1, C63362sw r2) {
    }

    public /* synthetic */ void Bvr(C166278cd r1, AnonymousClass206 r2, C63362sw r3) {
    }

    public void Bvt(C63362sw r5) {
        C18070vi.A0d(r5, 0);
        if (r5.A0C()) {
            AnonymousClass1BI r0 = r5.A0B.A00;
            if (r0 == null) {
                r0 = r5.A03();
            }
            C18070vi.A0b(r0);
            UserJid A002 = C22941Dw.A00(r0);
            if (A002 != null) {
                this.A01.CGS(new C21451AkI(this, A002, 2), "BizIntegritySignalsManager");
            }
        }
    }

    public /* synthetic */ B5J BCv(AnonymousClass206 r2, C63362sw r3) {
        return C20699AVf.A00;
    }

    public AnonymousClass34W(A1E a1e, AnonymousClass10I r2) {
        C18070vi.A0j(r2, a1e);
        this.A01 = r2;
        this.A00 = a1e;
    }

    public String BSr() {
        return "BizIntegrityIncomingMessageListener";
    }

    public /* synthetic */ B5I Bvs(C166418cr r2, C63362sw r3, boolean z) {
        return C20697AVd.A00;
    }
}
