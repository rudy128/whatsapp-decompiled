package com.whatsapp.favorite;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C17890vO;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorite.FavoriteManager$notifyObservers$2", f = "FavoriteManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteManager$notifyObservers$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ FavoriteManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteManager$notifyObservers$2(FavoriteManager favoriteManager, C30391dr r3) {
        super(2, r3);
        this.this$0 = favoriteManager;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new FavoriteManager$notifyObservers$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FavoriteManager$notifyObservers$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C17890vO.A0q(this.this$0.A03, 18);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
