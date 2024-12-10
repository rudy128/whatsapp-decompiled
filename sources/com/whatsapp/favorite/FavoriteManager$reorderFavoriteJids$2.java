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

@DebugMetadata(c = "com.whatsapp.favorite.FavoriteManager$reorderFavoriteJids$2", f = "FavoriteManager.kt", i = {}, l = {254}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteManager$reorderFavoriteJids$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $favorite;
    public int label;
    public final /* synthetic */ FavoriteManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteManager$reorderFavoriteJids$2(FavoriteManager favoriteManager, List list, C30391dr r4) {
        super(2, r4);
        this.this$0 = favoriteManager;
        this.$favorite = list;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FavoriteManager$reorderFavoriteJids$2(this.this$0, this.$favorite, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            FavoriteManager favoriteManager = this.this$0;
            List list = this.$favorite;
            this.label = 1;
            obj = favoriteManager.A04(list, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoriteManager$reorderFavoriteJids$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
