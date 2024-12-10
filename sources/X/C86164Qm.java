package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.4Qm  reason: invalid class name and case insensitive filesystem */
public final class C86164Qm {
    public C107095Yj A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass4RH A02;
    public final AnonymousClass00H A03;

    public final void A00(C29681ch r10, UserJid userJid, C108125bA r12) {
        C175118y5 r1;
        C29681ch r3 = r10;
        C18070vi.A0d(r10, 0);
        C107095Yj r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
        }
        this.A01.A07(2131895343, 2131891463);
        AnonymousClass4RH r13 = this.A02;
        UserJid userJid2 = userJid;
        C96864oX r5 = new C96864oX(userJid, r12, this, 1);
        if (!C72453Mb.A1X(r13.A06)) {
            r1 = null;
        } else {
            AnonymousClass4KK r02 = r13.A03;
            if (r02 != null) {
                AnonymousClass10E r14 = r02.A00.A00;
                r1 = new C175118y5(AnonymousClass3Ma.A0l(r14), r3, userJid2, r5, (AnonymousClass5Y9) r14.A7S.get(), (C20131A8r) r14.A7I.get(), AnonymousClass10E.AL1(r14));
                r1.A01();
            } else {
                C18070vi.A11("newsletterAdminInviteRevokeHandler");
                throw null;
            }
        }
        this.A00 = r1;
    }

    public C86164Qm(AnonymousClass1KB r1, AnonymousClass4RH r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A01 = r1;
        this.A02 = r2;
        this.A03 = r3;
    }
}
