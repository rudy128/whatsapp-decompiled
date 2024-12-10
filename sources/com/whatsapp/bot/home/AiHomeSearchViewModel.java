package com.whatsapp.bot.home;

import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1OB;
import X.AnonymousClass1UD;
import X.AnonymousClass3MY;
import X.AnonymousClass7D1;
import X.C108945cZ;
import X.C108975cc;
import X.C18070vi;
import X.C30391dr;
import X.C41561wd;

public final class AiHomeSearchViewModel extends AnonymousClass1J2 {
    public String A00;
    public AnonymousClass1OB A01;
    public final AnonymousClass1DT A02 = C108945cZ.A0S();
    public final AiHomeFetchService A03;
    public final AnonymousClass1UD A04;

    public final void A0T(String str) {
        if (str == null) {
            return;
        }
        if (!C18070vi.A18(this.A00, str) || (this.A02.A06() instanceof AnonymousClass7D1)) {
            this.A00 = str;
            C30391dr A0j = C108975cc.A0j(this.A01);
            this.A01 = AnonymousClass3MY.A0s(new AiHomeSearchViewModel$filterBots$1(this, str, A0j), C41561wd.A00(this));
        }
    }

    public AiHomeSearchViewModel(AiHomeFetchService aiHomeFetchService, AnonymousClass1UD r3) {
        C18070vi.A0j(r3, aiHomeFetchService);
        this.A04 = r3;
        this.A03 = aiHomeFetchService;
    }
}
