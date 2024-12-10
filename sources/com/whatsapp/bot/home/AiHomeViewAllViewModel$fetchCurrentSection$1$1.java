package com.whatsapp.bot.home;

import X.A7K;
import X.AIj;
import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass827;
import X.C143257Cr;
import X.C143337Cz;
import X.C18020vd;
import X.C18040vf;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeSectionQueryResponseImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.AiHomeViewAllViewModel$fetchCurrentSection$1$1", f = "AiHomeViewAllViewModel.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
public final class AiHomeViewAllViewModel$fetchCurrentSection$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C143257Cr $section;
    public int label;
    public final /* synthetic */ AiHomeViewAllViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiHomeViewAllViewModel$fetchCurrentSection$1$1(C143257Cr r2, AiHomeViewAllViewModel aiHomeViewAllViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = aiHomeViewAllViewModel;
        this.$section = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AiHomeViewAllViewModel$fetchCurrentSection$1$1(this.$section, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AiHomeFetchService aiHomeFetchService = this.this$0.A02;
            String str2 = this.$section.A01;
            this.label = 1;
            AiHomeSectionQueryResponseImpl.XfbFetchGenaiPersonasBySection.PageInfo pageInfo = aiHomeFetchService.A01;
            if (pageInfo == null || pageInfo.A0G("has_next_page")) {
                AnonymousClass1G4 r8 = aiHomeFetchService.A05;
                if (!(r8.getValue() instanceof C143337Cz)) {
                    A7K a7k = new A7K();
                    a7k.A07("section_id", str2);
                    a7k.A05(Integer.valueOf(C18020vd.A00(C18040vf.A01, AnonymousClass3MW.A0X(aiHomeFetchService.A02).A00, 10449)), "page_size");
                    AiHomeSectionQueryResponseImpl.XfbFetchGenaiPersonasBySection.PageInfo pageInfo2 = aiHomeFetchService.A01;
                    if (pageInfo2 != null) {
                        str = pageInfo2.A0F("end_cursor");
                    } else {
                        str = null;
                    }
                    a7k.A07("after", str);
                    AIj aIj = new AIj(a7k, AiHomeSectionQueryResponseImpl.class, "AiHomeSectionQuery");
                    boolean A1X = AnonymousClass000.A1X(aiHomeFetchService.A01);
                    if (AiHomeFetchService.A00(aIj, aiHomeFetchService, this, new AnonymousClass827(aiHomeFetchService, A1X), r8, A1X) == r2) {
                        return r2;
                    }
                }
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiHomeViewAllViewModel$fetchCurrentSection$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
