package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.8y4  reason: invalid class name and case insensitive filesystem */
public final class C175108y4 extends AMB {
    public C22515BAy A00;
    public final C29681ch A01;
    public final UserJid A02;
    public final C20131A8r A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175108y4(AnonymousClass1PY r1, C29681ch r2, UserJid userJid, C22515BAy bAy, AnonymousClass5Y9 r5, C20131A8r a8r, AnonymousClass10I r7) {
        super(r1, r5, r7);
        C18070vi.A0s(r7, r1, r5, a8r);
        this.A03 = a8r;
        this.A01 = r2;
        this.A02 = userJid;
        this.A00 = bAy;
    }

    public void cancel() {
        super.cancel();
        this.A00 = null;
    }
}
