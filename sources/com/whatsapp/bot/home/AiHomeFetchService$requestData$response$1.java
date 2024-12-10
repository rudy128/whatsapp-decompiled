package com.whatsapp.bot.home;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1PY;
import X.AnonymousClass5WY;
import X.AnonymousClass83W;
import X.C19993A2g;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C35021lW;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.AiHomeFetchService$requestData$response$1", f = "AiHomeFetchService.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
public final class AiHomeFetchService$requestData$response$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass5WY $query;
    public int label;
    public final /* synthetic */ AiHomeFetchService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiHomeFetchService$requestData$response$1(AnonymousClass5WY r2, AiHomeFetchService aiHomeFetchService, C30391dr r4) {
        super(2, r4);
        this.this$0 = aiHomeFetchService;
        this.$query = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AiHomeFetchService$requestData$response$1(this.$query, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C19993A2g A01 = ((AnonymousClass1PY) this.this$0.A03.get()).A01(this.$query);
            A01.A01 = true;
            A01.A02(C35021lW.A05);
            AnonymousClass83W r0 = AnonymousClass83W.A00;
            this.label = 1;
            obj = A01.A01(this, r0);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiHomeFetchService$requestData$response$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
