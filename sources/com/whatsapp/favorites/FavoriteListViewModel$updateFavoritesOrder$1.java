package com.whatsapp.favorites;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.favorite.FavoriteManager;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorites.FavoriteListViewModel$updateFavoritesOrder$1", f = "FavoriteListViewModel.kt", i = {}, l = {114}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteListViewModel$updateFavoritesOrder$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $favorites;
    public int label;
    public final /* synthetic */ FavoriteListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteListViewModel$updateFavoritesOrder$1(FavoriteListViewModel favoriteListViewModel, List list, C30391dr r4) {
        super(2, r4);
        this.this$0 = favoriteListViewModel;
        this.$favorites = list;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FavoriteListViewModel$updateFavoritesOrder$1(this.this$0, this.$favorites, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            List list = this.$favorites;
            this.label = 1;
            if (((FavoriteManager) this.this$0.A03.get()).A04(list, this) == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoriteListViewModel$updateFavoritesOrder$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
