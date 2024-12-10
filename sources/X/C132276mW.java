package X;

import com.whatsapp.calling.incallnotifbanner.viewmodel.InCallBannerViewModel;
import com.whatsapp.jid.UserJid;

/* renamed from: X.6mW  reason: invalid class name and case insensitive filesystem */
public final class C132276mW {
    public final AnonymousClass1M9 A00;
    public final C24921Me A01;
    public final C18140vp A02;

    public final AnonymousClass7C7 A00(UserJid userJid, boolean z, boolean z2) {
        AnonymousClass720 A03;
        int i;
        C18070vi.A0d(userJid, 0);
        if (C72473Md.A1Z(this.A02)) {
            C122636Rd r3 = C122636Rd.A0G;
            int i2 = 2131887680;
            if (z2) {
                i2 = 2131887671;
            }
            A03 = AnonymousClass720.A00(r3, this.A01.A0X(userJid), AnonymousClass3MW.A1a(), i2);
            i = 2131233496;
        } else {
            AnonymousClass1E7 A0H = this.A00.A0H(userJid);
            C122636Rd r4 = C122636Rd.A0G;
            int i3 = 2131887679;
            if (z2) {
                i3 = 2131887670;
            }
            Object[] A1a = AnonymousClass3MW.A1a();
            A1a[0] = this.A01.A0I(A0H);
            A03 = InCallBannerViewModel.A03(r4, C1402670q.A02(A1a, i3), AnonymousClass3MX.A0t(2131898241), z);
            i = 2131233498;
        }
        AnonymousClass720.A01(A03, i, 2131102382);
        return A03.A02();
    }

    public C132276mW(AnonymousClass1M9 r1, C24921Me r2, C18140vp r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
