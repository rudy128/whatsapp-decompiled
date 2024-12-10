package com.whatsapp.expressionstray.search;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.C127256e3;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.search.SearchQueryProvider$clearSearchQuery$2", f = "SearchQueryProvider.kt", i = {}, l = {25}, m = "invokeSuspend", n = {}, s = {})
public final class SearchQueryProvider$clearSearchQuery$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C127256e3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchQueryProvider$clearSearchQuery$2(C127256e3 r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new SearchQueryProvider$clearSearchQuery$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SearchQueryProvider$clearSearchQuery$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G4 r1 = this.this$0.A01;
            this.label = 1;
            if (r1.BJt((Object) null, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
