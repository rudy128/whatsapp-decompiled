package com.whatsapp.bot.home;

import X.A7K;
import X.AIj;
import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass1OS;
import X.AnonymousClass1YF;
import X.AnonymousClass3MW;
import X.AnonymousClass7D0;
import X.AnonymousClass83V;
import X.C134506qh;
import X.C18020vd;
import X.C18040vf;
import X.C18070vi;
import X.C18460wS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.infra.graphql.generated.aihome.AiHomeSearchQueryResponseImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.AiHomeFetchService$loadAiHomeSearch$1", f = "AiHomeFetchService.kt", i = {}, l = {101, 111}, m = "invokeSuspend", n = {}, s = {})
public final class AiHomeFetchService$loadAiHomeSearch$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $queryString;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AiHomeFetchService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiHomeFetchService$loadAiHomeSearch$1(AiHomeFetchService aiHomeFetchService, String str, C30391dr r4) {
        super(2, r4);
        this.$queryString = str;
        this.this$0 = aiHomeFetchService;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        AiHomeFetchService$loadAiHomeSearch$1 aiHomeFetchService$loadAiHomeSearch$1 = new AiHomeFetchService$loadAiHomeSearch$1(this.this$0, this.$queryString, r5);
        aiHomeFetchService$loadAiHomeSearch$1.L$0 = obj;
        return aiHomeFetchService$loadAiHomeSearch$1;
    }

    public final Object invokeSuspend(Object obj) {
        Object A00;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r10 = (AnonymousClass1G2) this.L$0;
            if (AnonymousClass1YF.A0I(this.$queryString).length() == 0) {
                AnonymousClass7D0 r0 = new AnonymousClass7D0(new C134506qh(C18460wS.A00, (String) null), false);
                this.label = 1;
                A00 = r10.BJt(r0, this);
            } else {
                A7K a7k = new A7K();
                String str = this.$queryString;
                C18070vi.A0d(str, 0);
                a7k.A07("query", str);
                a7k.A05(Integer.valueOf(C18020vd.A00(C18040vf.A01, AnonymousClass3MW.A0X(this.this$0.A02).A00, 10448)), "page_size");
                AIj aIj = new AIj(a7k, AiHomeSearchQueryResponseImpl.class, "AiHomeSearchQuery");
                AiHomeFetchService aiHomeFetchService = this.this$0;
                AnonymousClass83V r9 = AnonymousClass83V.A00;
                this.label = 2;
                A00 = AiHomeFetchService.A00(aIj, aiHomeFetchService, this, r9, r10, true);
            }
            if (A00 == r4) {
                return r4;
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiHomeFetchService$loadAiHomeSearch$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
