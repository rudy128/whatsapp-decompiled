package X;

import com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6mX  reason: invalid class name and case insensitive filesystem */
public final class C132286mX {
    public final AnonymousClass1M9 A00;
    public final C24921Me A01;
    public final C18140vp A02;

    public final AnonymousClass7C7 A00(UserJid userJid, boolean z) {
        AnonymousClass720 A03;
        int i;
        C18070vi.A0d(userJid, 0);
        if (C72473Md.A1Z(this.A02)) {
            A03 = AnonymousClass720.A00(C122636Rd.A0H, this.A01.A0X(userJid), AnonymousClass3MW.A1a(), 2131887674);
            i = 2131233179;
        } else {
            AnonymousClass1E7 A0H = this.A00.A0H(userJid);
            C122636Rd r3 = C122636Rd.A0H;
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass3MX.A1N(this.A01, A0H, A1a, 0);
            A03 = InCallBannerViewModel.A03(r3, C1402670q.A02(A1a, 2131887673), (AnonymousClass4ZN) null, z);
            i = 2131233396;
        }
        AnonymousClass720.A01(A03, i, 2131102055);
        return A03.A02();
    }

    public C132286mX(AnonymousClass1M9 r1, C24921Me r2, C18140vp r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
