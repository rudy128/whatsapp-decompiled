package com.whatsapp.data.graphql.imagine.suggestions.get;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6YX;
import X.C108975cc;
import X.C128416fx;
import X.C130066ip;
import X.C131206ki;
import X.C144567Hu;
import X.C144617Hz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C71053Dp;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.graphql.imagine.suggestions.get.ImagineSuggestionsProvider$getEmptyStateModel$2", f = "ImagineSuggestionsProvider.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
public final class ImagineSuggestionsProvider$getEmptyStateModel$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C130066ip this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagineSuggestionsProvider$getEmptyStateModel$2(C130066ip r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new ImagineSuggestionsProvider$getEmptyStateModel$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new ImagineSuggestionsProvider$getEmptyStateModel$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C128416fx r5 = (C128416fx) this.this$0.A03.get();
            this.label = 1;
            C71053Dp A0k = C108975cc.A0k(this);
            C131206ki.A00(AnonymousClass6YX.A00, r5.A02, new C144567Hu(r5, 0)).CBv(new C144617Hz(r5, A0k, 0));
            obj = A0k.A00();
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }
}
