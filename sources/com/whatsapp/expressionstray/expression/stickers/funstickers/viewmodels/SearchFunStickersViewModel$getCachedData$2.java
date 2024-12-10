package com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C121646Ky;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C72463Mc;
import java.util.ArrayList;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$getCachedData$2", f = "SearchFunStickersViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$getCachedData$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $chatJid;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$getCachedData$2(SearchFunStickersViewModel searchFunStickersViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = searchFunStickersViewModel;
        this.$chatJid = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new SearchFunStickersViewModel$getCachedData$2(this.this$0, this.$chatJid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C121646Ky r4 = this.this$0.A0H;
            String str = this.$chatJid;
            ArrayList A0s = C72463Mc.A0s(str);
            Set<Object> set = (Set) r4.A00.get(str);
            if (set != null) {
                for (Object obj2 : set) {
                    Object obj3 = r4.A01.get(obj2);
                    if (obj3 != null) {
                        A0s.add(obj3);
                    }
                }
            }
            return A0s;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$getCachedData$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
