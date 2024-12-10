package com.whatsapp.community.communityInfo.viewModels;

import X.AnonymousClass1DF;
import X.AnonymousClass1EC;
import X.AnonymousClass1J2;
import X.AnonymousClass1NN;
import X.AnonymousClass3MY;
import X.AnonymousClass3VF;
import X.AnonymousClass5F6;
import X.C18070vi;
import X.C18100vl;
import X.C22801Dg;

public final class CAGInfoChatLockViewModel extends AnonymousClass1J2 {
    public AnonymousClass3VF A00;
    public AnonymousClass1EC A01;
    public final C22801Dg A02 = new C22801Dg();
    public final AnonymousClass1NN A03;
    public final C18100vl A04 = AnonymousClass1DF.A01(new AnonymousClass5F6(this));

    public CAGInfoChatLockViewModel(AnonymousClass1NN r2) {
        C18070vi.A0d(r2, 1);
        this.A03 = r2;
    }

    public void A0S() {
        AnonymousClass3VF r0 = this.A00;
        if (r0 != null) {
            this.A02.A0G(r0.A07);
        }
        AnonymousClass3MY.A1R(this.A03, this.A04);
    }
}
