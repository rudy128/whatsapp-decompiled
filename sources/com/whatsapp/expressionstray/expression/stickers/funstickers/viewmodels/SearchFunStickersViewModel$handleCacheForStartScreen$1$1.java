package com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass60H;
import X.AnonymousClass60L;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$handleCacheForStartScreen$1$1", f = "SearchFunStickersViewModel.kt", i = {}, l = {460}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$handleCacheForStartScreen$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $jid;
    public Object L$0;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$handleCacheForStartScreen$1$1(SearchFunStickersViewModel searchFunStickersViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = searchFunStickersViewModel;
        this.$jid = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new SearchFunStickersViewModel$handleCacheForStartScreen$1$1(this.this$0, this.$jid, r5);
    }

    public final Object invokeSuspend(Object obj) {
        SearchFunStickersViewModel searchFunStickersViewModel;
        AnonymousClass60H r3;
        String str;
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            searchFunStickersViewModel = this.this$0;
            String str2 = this.$jid;
            this.L$0 = searchFunStickersViewModel;
            this.label = 1;
            obj = C30451dy.A00(this, searchFunStickersViewModel.A0S, new SearchFunStickersViewModel$getCachedData$2(searchFunStickersViewModel, str2, (C30391dr) null));
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            searchFunStickersViewModel = (SearchFunStickersViewModel) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        List list = (List) obj;
        if (list != null && AnonymousClass000.A1a(list)) {
            Object A0d = C29431cG.A0d(list);
            if (!(!(A0d instanceof AnonymousClass60H) || (r3 = (AnonymousClass60H) A0d) == null || (str = r3.A01.A03) == null)) {
                searchFunStickersViewModel.A0A.A0F(new AnonymousClass60L(str, list, true));
                if (SearchFunStickersViewModel.A0C(searchFunStickersViewModel)) {
                    searchFunStickersViewModel.A00 = r3.A00;
                    searchFunStickersViewModel.A09.A0F(SearchFunStickersViewModel.A09(searchFunStickersViewModel, list));
                }
            }
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$handleCacheForStartScreen$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
