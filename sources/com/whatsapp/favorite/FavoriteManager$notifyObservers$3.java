package com.whatsapp.favorite;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C26811To;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C41911xI;
import X.C45982Ck;
import X.C46232Dt;
import X.C58862lN;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorite.FavoriteManager$notifyObservers$3", f = "FavoriteManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteManager$notifyObservers$3 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ FavoriteManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteManager$notifyObservers$3(FavoriteManager favoriteManager, C30391dr r3) {
        super(2, r3);
        this.this$0 = favoriteManager;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new FavoriteManager$notifyObservers$3(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FavoriteManager$notifyObservers$3(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C45982Ck r0;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C41911xI r1 = this.this$0.A01;
            C26811To r2 = r1.A01;
            if (r2.A0T() && (r0 = (C45982Ck) ((C58862lN) r1.A02.get()).A00("favorites")) != null) {
                C46232Dt A0K = r0.A0K();
                ArrayList A13 = AnonymousClass000.A13();
                A13.add(A0K);
                r2.A0N(A13);
                r2.A0I();
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
