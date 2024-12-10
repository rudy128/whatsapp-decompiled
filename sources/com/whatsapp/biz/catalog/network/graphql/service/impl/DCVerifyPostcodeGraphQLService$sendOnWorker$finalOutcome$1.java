package com.whatsapp.biz.catalog.network.graphql.service.impl;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass9Le;
import X.AnonymousClass9M3;
import X.C168348ii;
import X.C168448is;
import X.C168478iv;
import X.C180089Lb;
import X.C18030ve;
import X.C18070vi;
import X.C183899a0;
import X.C193499qC;
import X.C196209ud;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.network.graphql.service.impl.DCVerifyPostcodeGraphQLService$sendOnWorker$finalOutcome$1", f = "DCVerifyPostcodeGraphQLService.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
public final class DCVerifyPostcodeGraphQLService$sendOnWorker$finalOutcome$1 extends C30431dv implements C36001nB {
    public final /* synthetic */ C193499qC $translatedRequest;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ DCVerifyPostcodeGraphQLService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DCVerifyPostcodeGraphQLService$sendOnWorker$finalOutcome$1(C193499qC r2, DCVerifyPostcodeGraphQLService dCVerifyPostcodeGraphQLService, C30391dr r4) {
        super(3, r4);
        this.this$0 = dCVerifyPostcodeGraphQLService;
        this.$translatedRequest = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        DCVerifyPostcodeGraphQLService dCVerifyPostcodeGraphQLService = this.this$0;
        DCVerifyPostcodeGraphQLService$sendOnWorker$finalOutcome$1 dCVerifyPostcodeGraphQLService$sendOnWorker$finalOutcome$1 = new DCVerifyPostcodeGraphQLService$sendOnWorker$finalOutcome$1(this.$translatedRequest, dCVerifyPostcodeGraphQLService, (C30391dr) obj3);
        dCVerifyPostcodeGraphQLService$sendOnWorker$finalOutcome$1.L$0 = obj;
        return dCVerifyPostcodeGraphQLService$sendOnWorker$finalOutcome$1.invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.9Ma] */
    public final Object invokeSuspend(Object obj) {
        Exception r0;
        Object obj2 = obj;
        Object obj3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj2);
            DCVerifyPostcodeGraphQLService dCVerifyPostcodeGraphQLService = this.this$0;
            dCVerifyPostcodeGraphQLService.A02.A01(new Object(), dCVerifyPostcodeGraphQLService.A00);
            C196209ud r1 = this.this$0.A04;
            C193499qC r8 = this.$translatedRequest;
            C18070vi.A0d(r8, 0);
            C18030ve r10 = r1.A03;
            C168348ii r5 = new C168348ii(r1.A00, r1.A01, r8, r1.A02, r10, r1.A04, r1.A05, r1.A06, r1.A09);
            this.label = 1;
            obj2 = ((AnonymousClass1OS) this.L$0).invoke(r5, this);
            if (obj2 == obj3) {
                return obj3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj2);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass9M3 r2 = (AnonymousClass9M3) obj2;
        if (r2 instanceof C168478iv) {
            if (((C183899a0) ((C168478iv) r2).A00).A00 == null) {
                this.this$0.A03(1001);
                r0 = new AnonymousClass9Le();
            } else {
                DCVerifyPostcodeGraphQLService dCVerifyPostcodeGraphQLService2 = this.this$0;
                if (!dCVerifyPostcodeGraphQLService2.A01.A09(dCVerifyPostcodeGraphQLService2.A02.A00)) {
                    this.this$0.A03(1002);
                    r0 = new C180089Lb();
                }
            }
            return new C168448is(r0);
        }
        this.this$0.A04(r2, 440);
        return r2;
    }
}
