package com.whatsapp.calling.favorite.calllist;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C62482rT;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$deleteFavorite$1", f = "FavoriteCallListViewModel.kt", i = {}, l = {117, 118}, m = "invokeSuspend", n = {}, s = {})
public final class FavoriteCallListViewModel$deleteFavorite$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C62482rT $favorite;
    public int label;
    public final /* synthetic */ FavoriteCallListViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoriteCallListViewModel$deleteFavorite$1(FavoriteCallListViewModel favoriteCallListViewModel, C62482rT r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = favoriteCallListViewModel;
        this.$favorite = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FavoriteCallListViewModel$deleteFavorite$1(this.this$0, this.$favorite, r5);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r3) goto L_0x002b
            if (r0 != r4) goto L_0x0041
            X.C30691eM.A01(r7)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r7)
            com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel r0 = r6.this$0
            X.00H r0 = r0.A09
            java.lang.Object r2 = X.C18070vi.A0E(r0)
            com.whatsapp.favorite.FavoriteManager r2 = (com.whatsapp.favorite.FavoriteManager) r2
            X.2rT r1 = r6.$favorite
            r6.label = r3
            r0 = 0
            java.lang.Object r0 = r2.A01(r1, r0, r6)
            if (r0 != r5) goto L_0x002e
            return r5
        L_0x002b:
            X.C30691eM.A01(r7)
        L_0x002e:
            com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel r3 = r6.this$0
            X.0wl r2 = r3.A0C
            r1 = 0
            com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$deleteFavorite$1$1 r0 = new com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$deleteFavorite$1$1
            r0.<init>(r1)
            r6.label = r4
            java.lang.Object r0 = X.C30451dy.A00(r6, r2, r0)
            if (r0 != r5) goto L_0x000f
            return r5
        L_0x0041:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.favorite.calllist.FavoriteCallListViewModel$deleteFavorite$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoriteCallListViewModel$deleteFavorite$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
