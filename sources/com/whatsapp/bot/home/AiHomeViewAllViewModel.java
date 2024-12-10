package com.whatsapp.bot.home;

import X.AnonymousClass000;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MX;
import X.C108945cZ;
import X.C108995ce;
import X.C143257Cr;
import X.C143337Cz;
import X.C18070vi;
import X.C27443DfU;
import X.C28243Du4;
import X.C30391dr;
import X.C41561wd;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeSectionQueryResponseImpl;
import java.util.List;

public final class AiHomeViewAllViewModel extends AnonymousClass1J2 {
    public C143257Cr A00;
    public final AnonymousClass1DT A01;
    public final AiHomeFetchService A02;
    public final List A03 = AnonymousClass000.A13();

    public AiHomeViewAllViewModel(AiHomeFetchService aiHomeFetchService) {
        C18070vi.A0d(aiHomeFetchService, 1);
        this.A02 = aiHomeFetchService;
        AnonymousClass1DT A0S = C108945cZ.A0S();
        C108995ce.A13(this, new C27443DfU(A0S, 0), new C28243Du4(new AiHomeViewAllViewModel$sectionLiveData$lambda$2$$inlined$transform$1(this, (C30391dr) null, aiHomeFetchService.A05)));
        this.A01 = A0S;
    }

    public void A0S() {
        AiHomeFetchService aiHomeFetchService = this.A02;
        aiHomeFetchService.A01 = null;
        aiHomeFetchService.A05.setValue((Object) null);
    }

    public final void A0T(boolean z) {
        C143257Cr r3;
        AiHomeFetchService aiHomeFetchService = this.A02;
        AiHomeSectionQueryResponseImpl.XfbFetchGenaiPersonasBySection.PageInfo pageInfo = aiHomeFetchService.A01;
        if ((pageInfo == null || pageInfo.A0G("has_next_page")) && !(aiHomeFetchService.A05.getValue() instanceof C143337Cz) && !z && (r3 = this.A00) != null) {
            AnonymousClass3MX.A1Q(new AiHomeViewAllViewModel$fetchCurrentSection$1$1(r3, this, (C30391dr) null), C41561wd.A00(this));
        }
    }
}
