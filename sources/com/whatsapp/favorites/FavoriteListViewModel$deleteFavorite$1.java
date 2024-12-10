package com.whatsapp.favorites;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62482rT;
import com.whatsapp.favorite.FavoriteManager;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorites.FavoriteListViewModel$deleteFavorite$1", f = "FavoriteListViewModel.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteListViewModel$deleteFavorite$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C62482rT $favorite;
    public int label;
    public final /* synthetic */ FavoriteListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteListViewModel$deleteFavorite$1(C62482rT r2, FavoriteListViewModel favoriteListViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = favoriteListViewModel;
        this.$favorite = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FavoriteListViewModel$deleteFavorite$1(this.$favorite, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C62482rT r1 = this.$favorite;
            Integer A0v = AnonymousClass3MW.A0v(this.this$0.A00);
            this.label = 1;
            if (((FavoriteManager) this.this$0.A03.get()).A01(r1, A0v, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoriteListViewModel$deleteFavorite$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
