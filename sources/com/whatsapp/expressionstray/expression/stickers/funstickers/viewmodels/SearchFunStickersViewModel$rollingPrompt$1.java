package com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.C135206rp;
import X.C135246rt;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$rollingPrompt$1", f = "SearchFunStickersViewModel.kt", i = {0}, l = {203}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class SearchFunStickersViewModel$rollingPrompt$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$rollingPrompt$1(SearchFunStickersViewModel searchFunStickersViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = searchFunStickersViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        SearchFunStickersViewModel$rollingPrompt$1 searchFunStickersViewModel$rollingPrompt$1 = new SearchFunStickersViewModel$rollingPrompt$1(this.this$0, r4);
        searchFunStickersViewModel$rollingPrompt$1.L$0 = obj;
        return searchFunStickersViewModel$rollingPrompt$1;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1OX r2;
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r2 = (AnonymousClass1OX) this.L$0;
            this.L$0 = r2;
            this.label = 1;
            if (C62882s9.A00(this, 7000) == r3) {
                return r3;
            }
        } else if (i == 1) {
            r2 = (AnonymousClass1OX) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        if (AnonymousClass1OW.A05(r2) && !this.this$0.A0V()) {
            SearchFunStickersViewModel searchFunStickersViewModel = this.this$0;
            int i2 = searchFunStickersViewModel.A01;
            List list = searchFunStickersViewModel.A0R;
            int size = (i2 + 1) % list.size();
            searchFunStickersViewModel.A01 = size;
            int i3 = ((C135246rt) list.get(size)).A01;
            SearchFunStickersViewModel searchFunStickersViewModel2 = this.this$0;
            searchFunStickersViewModel2.A0B.A0F(new C135206rp(i2, searchFunStickersViewModel2.A01, i3));
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SearchFunStickersViewModel$rollingPrompt$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
