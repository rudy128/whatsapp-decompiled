package com.whatsapp.data.graphql.imagine.suggestions.get;

import X.AnonymousClass000;
import X.AnonymousClass1DS;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.C130066ip;
import X.C134296qM;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.data.graphql.imagine.suggestions.get.ImagineSuggestionsProvider$getSearchEmptyStateModel$2$1", f = "ImagineSuggestionsProvider.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
public final class ImagineSuggestionsProvider$getSearchEmptyStateModel$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1DT $it;
    public Object L$0;
    public int label;
    public final /* synthetic */ C130066ip this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ImagineSuggestionsProvider$getSearchEmptyStateModel$2$1(AnonymousClass1DT r2, C130066ip r3, C30391dr r4) {
        super(2, r4);
        this.$it = r2;
        this.this$0 = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ImagineSuggestionsProvider$getSearchEmptyStateModel$2$1(this.$it, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1DS r4;
        List list;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            try {
                r4 = this.$it;
                C130066ip r3 = this.this$0;
                this.L$0 = r4;
                this.label = 1;
                obj = C30451dy.A00(this, r3.A04, new ImagineSuggestionsProvider$getEmptyStateModel$2(r3, (C30391dr) null));
                if (obj == r5) {
                    return r5;
                }
            } catch (Exception unused) {
            }
        } else if (i == 1) {
            r4 = (AnonymousClass1DS) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C134296qM r7 = (C134296qM) obj;
        if (r7 != null) {
            list = r7.A00;
        } else {
            list = null;
        }
        r4.A0E(list);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ImagineSuggestionsProvider$getSearchEmptyStateModel$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
