package com.whatsapp.favorite;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorite.FavoriteManager$deleteFavoritesBlocking$1", f = "FavoriteManager.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteManager$deleteFavoritesBlocking$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $favoriteIds;
    public final /* synthetic */ Integer $favoritesUpdateEntryPoint;
    public int label;
    public final /* synthetic */ FavoriteManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteManager$deleteFavoritesBlocking$1(FavoriteManager favoriteManager, Integer num, List list, C30391dr r5) {
        super(2, r5);
        this.this$0 = favoriteManager;
        this.$favoriteIds = list;
        this.$favoritesUpdateEntryPoint = num;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new FavoriteManager$deleteFavoritesBlocking$1(this.this$0, this.$favoritesUpdateEntryPoint, this.$favoriteIds, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            FavoriteManager favoriteManager = this.this$0;
            List list = this.$favoriteIds;
            Integer num = this.$favoritesUpdateEntryPoint;
            this.label = 1;
            obj = favoriteManager.A02(num, list, this);
            if (obj == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoriteManager$deleteFavoritesBlocking$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
