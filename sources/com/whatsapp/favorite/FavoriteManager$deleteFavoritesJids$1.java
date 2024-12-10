package com.whatsapp.favorite;

import X.AnonymousClass1OS;
import X.AnonymousClass1TI;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.Collection;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.favorite.FavoriteManager$deleteFavoritesJids$1", f = "FavoriteManager.kt", i = {0}, l = {245, 247}, m = "invokeSuspend", n = {"favoritesToDeleteList"}, s = {"L$0"})
public final class FavoriteManager$deleteFavoritesJids$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Collection $chatJids;
    public final /* synthetic */ int $favoritesUpdateEntryPoint;
    public final /* synthetic */ AnonymousClass1TI $onDeleteFavoritesCallback;
    public Object L$0;
    public int label;
    public final /* synthetic */ FavoriteManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteManager$deleteFavoritesJids$1(FavoriteManager favoriteManager, AnonymousClass1TI r3, Collection collection, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = favoriteManager;
        this.$favoritesUpdateEntryPoint = i;
        this.$onDeleteFavoritesCallback = r3;
        this.$chatJids = collection;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new FavoriteManager$deleteFavoritesJids$1(this.this$0, this.$onDeleteFavoritesCallback, this.$chatJids, r8, this.$favoritesUpdateEntryPoint);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r9.label
            r6 = 2
            r8 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r8) goto L_0x0073
            if (r0 != r6) goto L_0x0093
            X.C30691eM.A01(r10)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r10)
            com.whatsapp.favorite.FavoriteManager r0 = r9.this$0
            X.1xG r0 = r0.A04
            java.util.List r0 = r0.A02()
            java.util.Collection r3 = r9.$chatJids
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0027:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2rT r0 = (X.C62482rT) r0
            X.1BI r0 = r0.A03
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L_0x0027
            r4.add(r1)
            goto L_0x0027
        L_0x0040:
            java.util.ArrayList r7 = X.C29351c6.A0D(r4)
            java.util.Iterator r3 = r4.iterator()
        L_0x0048:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r3.next()
            X.2rT r0 = (X.C62482rT) r0
            long r1 = r0.A01
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r7.add(r0)
            goto L_0x0048
        L_0x005f:
            com.whatsapp.favorite.FavoriteManager r2 = r9.this$0
            int r1 = r9.$favoritesUpdateEntryPoint
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r9.L$0 = r4
            r9.label = r8
            java.lang.Object r0 = r2.A02(r0, r7, r9)
            if (r0 != r5) goto L_0x007a
            return r5
        L_0x0073:
            java.lang.Object r4 = r9.L$0
            java.util.List r4 = (java.util.List) r4
            X.C30691eM.A01(r10)
        L_0x007a:
            X.1TI r3 = r9.$onDeleteFavoritesCallback
            if (r3 == 0) goto L_0x000f
            com.whatsapp.favorite.FavoriteManager r0 = r9.this$0
            X.0wl r2 = r0.A09
            r1 = 0
            com.whatsapp.favorite.FavoriteManager$deleteFavoritesJids$1$1 r0 = new com.whatsapp.favorite.FavoriteManager$deleteFavoritesJids$1$1
            r0.<init>(r4, r1)
            r9.L$0 = r1
            r9.label = r6
            java.lang.Object r0 = X.C30451dy.A00(r9, r2, r0)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x0093:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.favorite.FavoriteManager$deleteFavoritesJids$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoriteManager$deleteFavoritesJids$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
