package com.whatsapp.favorites;

import X.AnonymousClass000;
import X.C27621Wu;
import X.C29351c6;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import X.C62482rT;
import X.C96044nD;
import X.C96054nE;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorites.FavoriteListViewModel$favorites$1", f = "FavoriteListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteListViewModel$favorites$1 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ FavoriteListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteListViewModel$favorites$1(FavoriteListViewModel favoriteListViewModel, C30391dr r3) {
        super(3, r3);
        this.this$0 = favoriteListViewModel;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            List<C62482rT> list = (List) this.L$0;
            boolean z = this.Z$0;
            FavoriteListViewModel favoriteListViewModel = this.this$0;
            ArrayList A0D = C29351c6.A0D(list);
            for (C62482rT r2 : list) {
                A0D.add(new C96044nD(favoriteListViewModel.A02.A0H(r2.A03), r2, z));
            }
            return C29431cG.A0l(C96054nE.A00, A0D);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1Y = AnonymousClass000.A1Y(obj2);
        FavoriteListViewModel$favorites$1 favoriteListViewModel$favorites$1 = new FavoriteListViewModel$favorites$1(this.this$0, (C30391dr) obj3);
        favoriteListViewModel$favorites$1.L$0 = obj;
        favoriteListViewModel$favorites$1.Z$0 = A1Y;
        return favoriteListViewModel$favorites$1.invokeSuspend(C27621Wu.A00);
    }
}
