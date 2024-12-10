package com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C1404771o;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.funstickers.logging.FunStickersFetchLogger$logRetry$2;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.funstickers.viewmodels.SearchFunStickersViewModel$sendRetryLog$2", f = "SearchFunStickersViewModel.kt", i = {}, l = {635}, m = "invokeSuspend", n = {}, s = {})
public final class SearchFunStickersViewModel$sendRetryLog$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ SearchFunStickersViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchFunStickersViewModel$sendRetryLog$2(SearchFunStickersViewModel searchFunStickersViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = searchFunStickersViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new SearchFunStickersViewModel$sendRetryLog$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new SearchFunStickersViewModel$sendRetryLog$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C1404771o r3 = (C1404771o) this.this$0.A0O.get();
            this.label = 1;
            if (r3.A05 != null && C30451dy.A00(this, r3.A0C, new FunStickersFetchLogger$logRetry$2(r3, (C30391dr) null)) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
