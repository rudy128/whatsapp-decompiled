package com.whatsapp.settings;

import X.AnonymousClass00H;
import X.AnonymousClass1D6;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.C18070vi;
import X.C88074Yf;

public final class SettingsSetupUserProxyViewModel extends AnonymousClass1J2 {
    public C88074Yf A00;
    public C88074Yf A01;
    public final AnonymousClass1DT A02 = AnonymousClass3MW.A0L();
    public final AnonymousClass00H A03;

    public SettingsSetupUserProxyViewModel(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A03 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001d, code lost:
        if (X.AnonymousClass4HS.A00(r2) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C88074Yf r2, com.whatsapp.settings.SettingsSetupUserProxyViewModel r3) {
        /*
            X.4Yf r0 = r3.A01
            if (r0 != 0) goto L_0x0012
            X.00H r0 = r3.A03
            java.lang.Object r0 = r0.get()
            X.1fM r0 = (X.C31311fM) r0
            X.4Yf r0 = r0.A01()
            r3.A01 = r0
        L_0x0012:
            boolean r0 = X.C18070vi.A18(r0, r2)
            if (r0 != 0) goto L_0x001f
            boolean r1 = X.AnonymousClass4HS.A00(r2)
            r0 = 0
            if (r1 == 0) goto L_0x0020
        L_0x001f:
            r0 = 2
        L_0x0020:
            X.1DT r1 = r3.A02
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r0, r2)
            r1.A0F(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsSetupUserProxyViewModel.A00(X.4Yf, com.whatsapp.settings.SettingsSetupUserProxyViewModel):void");
    }

    public final C88074Yf A0T() {
        C88074Yf r0;
        AnonymousClass1D6 r02 = (AnonymousClass1D6) this.A02.A06();
        if (r02 == null || (r0 = (C88074Yf) r02.second) == null) {
            return new C88074Yf((String) null, (String) null, 443, 587, true);
        }
        return r0;
    }
}
