package com.whatsapp.settings.securitycheckup;

import X.AnonymousClass1DS;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4OF;
import X.C30391dr;
import X.C41561wd;
import X.C41731wy;

public final class SecurityCheckupBannerViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DS A00;
    public final AnonymousClass4OF A01;
    public final SecurityCheckupStatusRepository A02;
    public final C41731wy A03;

    public SecurityCheckupBannerViewModel(AnonymousClass4OF r2, SecurityCheckupStatusRepository securityCheckupStatusRepository) {
        this.A01 = r2;
        this.A02 = securityCheckupStatusRepository;
        C41731wy A0o = AnonymousClass3MW.A0o();
        this.A03 = A0o;
        this.A00 = A0o;
    }

    public static final void A00(SecurityCheckupBannerViewModel securityCheckupBannerViewModel) {
        AnonymousClass3MX.A1Q(new SecurityCheckupBannerViewModel$refreshBannerEligibility$1(securityCheckupBannerViewModel, (C30391dr) null), C41561wd.A00(securityCheckupBannerViewModel));
    }
}
