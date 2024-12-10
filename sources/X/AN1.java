package X;

import com.whatsapp.jid.UserJid;

public final /* synthetic */ class AN1 implements B78 {
    public final /* synthetic */ C194829sM A00;
    public final /* synthetic */ C167918hz A01;
    public final /* synthetic */ UserJid A02;

    public final void C3p(boolean z) {
        C167918hz r5 = this.A01;
        C194829sM r4 = this.A00;
        UserJid userJid = this.A02;
        if (z) {
            C17880vN.A1E(C19830z4.A00(r5.A03), "latest_biz_backend_request_id", "252");
            r5.A01.A0E(new C20481AMs(r4, r5), userJid, true);
            return;
        }
        C167918hz.A00(r4, r5);
    }

    public /* synthetic */ AN1(C194829sM r1, C167918hz r2, UserJid userJid) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = userJid;
    }
}
