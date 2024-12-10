package com.whatsapp.expressionstray.expression.gifs;

import X.AnonymousClass000;
import X.AnonymousClass1DT;
import X.AnonymousClass1OS;
import X.AnonymousClass66S;
import X.AnonymousClass66T;
import X.AnonymousClass66W;
import X.C133816pX;
import X.C140126zz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.gifs.GifExpressionsSearchViewModel$runSearch$2", f = "GifExpressionsSearchViewModel.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
public final class GifExpressionsSearchViewModel$runSearch$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $searchQuery;
    public int label;
    public final /* synthetic */ GifExpressionsSearchViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GifExpressionsSearchViewModel$runSearch$2(GifExpressionsSearchViewModel gifExpressionsSearchViewModel, String str, C30391dr r4) {
        super(2, r4);
        this.this$0 = gifExpressionsSearchViewModel;
        this.$searchQuery = str;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new GifExpressionsSearchViewModel$runSearch$2(this.this$0, this.$searchQuery, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C133816pX A05;
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.label = 1;
            if (C62882s9.A00(this, 500) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        GifExpressionsSearchViewModel gifExpressionsSearchViewModel = this.this$0;
        String str = this.$searchQuery;
        GifExpressionsSearchViewModel.A03(gifExpressionsSearchViewModel);
        GifExpressionsSearchViewModel.A00(gifExpressionsSearchViewModel);
        AnonymousClass1DT r3 = gifExpressionsSearchViewModel.A03;
        if (str == null || str.length() == 0) {
            Log.i("GifExpressionsSearchViewModel/runGifSearch/trending");
            A05 = gifExpressionsSearchViewModel.A06.A05();
        } else {
            Log.i("GifExpressionsSearchViewModel/runGifSearch/search");
            C140126zz r1 = gifExpressionsSearchViewModel.A06;
            if (r1 instanceof AnonymousClass66T) {
                A05 = new AnonymousClass66W((AnonymousClass66T) r1, (CharSequence) str);
            } else {
                A05 = new AnonymousClass66W((AnonymousClass66S) r1, (CharSequence) str);
            }
        }
        A05.A00(gifExpressionsSearchViewModel.A07);
        r3.A0F(A05);
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GifExpressionsSearchViewModel$runSearch$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
