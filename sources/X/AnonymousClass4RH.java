package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4RH  reason: invalid class name */
public final class AnonymousClass4RH {
    public AnonymousClass4KI A00;
    public C51532Yq A01;
    public AnonymousClass4KJ A02;
    public AnonymousClass4KK A03;
    public AnonymousClass4KL A04;
    public final C25001Mm A05;
    public final AnonymousClass00H A06;

    public final C175108y4 A00(C29681ch r10, UserJid userJid, C22515BAy bAy) {
        C29681ch r3 = r10;
        UserJid userJid2 = userJid;
        C18070vi.A0h(r10, userJid);
        if (!C72453Mb.A1X(this.A06)) {
            return null;
        }
        C51532Yq r0 = this.A01;
        if (r0 != null) {
            AnonymousClass10E r1 = r0.A00.A00;
            C22515BAy bAy2 = bAy;
            C175108y4 r12 = new C175108y4(AnonymousClass3Ma.A0l(r1), r3, userJid2, bAy2, (AnonymousClass5Y9) r1.A7S.get(), (C20131A8r) r1.A7I.get(), AnonymousClass10E.AL1(r1));
            r12.A01();
            return r12;
        }
        C18070vi.A11("newsletterAdminDemoteHandler");
        throw null;
    }

    public AnonymousClass4RH(C25001Mm r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A05 = r1;
        this.A06 = r2;
    }
}
