package X;

import com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6mS  reason: invalid class name and case insensitive filesystem */
public final class C132236mS {
    public final AnonymousClass1M9 A00;
    public final C24921Me A01;
    public final C18140vp A02;

    public final AnonymousClass7C7 A00(UserJid userJid, boolean z) {
        AnonymousClass720 A03;
        C18070vi.A0d(userJid, 0);
        C18140vp r4 = this.A02;
        if (C72473Md.A1Z(r4)) {
            AnonymousClass6IR A0t = AnonymousClass3MX.A0t(2131898243);
            A03 = new AnonymousClass720(C122636Rd.A0A, A0t, (AnonymousClass4ZN) null, 0);
            A03.A03 = A0t;
        } else {
            String A0p = AnonymousClass3MY.A0p(this.A00, this.A01, userJid);
            C122636Rd r2 = C122636Rd.A0A;
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = A0p;
            A03 = InCallBannerViewModel.A03(r2, C1402670q.A02(A1a, 2131898242), AnonymousClass3MX.A0t(2131898241), z);
        }
        int i = 2131233364;
        if (C72473Md.A1Z(r4)) {
            i = 2131232421;
        }
        AnonymousClass720.A01(A03, i, 2131102055);
        return A03.A02();
    }

    public C132236mS(AnonymousClass1M9 r1, C24921Me r2, C18140vp r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
