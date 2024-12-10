package X;

import com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6mT  reason: invalid class name and case insensitive filesystem */
public final class C132246mT {
    public final AnonymousClass1M9 A00;
    public final C24921Me A01;
    public final C18140vp A02;

    public final AnonymousClass7C7 A00(UserJid userJid, boolean z) {
        AnonymousClass720 A03;
        int i;
        C18070vi.A0d(userJid, 0);
        boolean A1Z = C72473Md.A1Z(this.A02);
        AnonymousClass1E7 A0H = this.A00.A0H(userJid);
        C122636Rd r3 = C122636Rd.A09;
        if (A1Z) {
            A03 = AnonymousClass720.A00(r3, this.A01.A0J(A0H), AnonymousClass3MW.A1a(), 2131898246);
            i = 2131232421;
        } else {
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass3MX.A1N(this.A01, A0H, A1a, 0);
            A03 = InCallBannerViewModel.A03(r3, C1402670q.A02(A1a, 2131898245), AnonymousClass3MX.A0t(2131898244), z);
            i = 2131233364;
        }
        AnonymousClass720.A01(A03, i, 2131102055);
        return A03.A02();
    }

    public C132246mT(AnonymousClass1M9 r1, C24921Me r2, C18140vp r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
