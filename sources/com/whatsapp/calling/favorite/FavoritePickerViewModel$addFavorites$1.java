package com.whatsapp.calling.favorite;

import X.AnonymousClass1OS;
import X.C18090vk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePickerViewModel$addFavorites$1", f = "FavoritePickerViewModel.kt", i = {0}, l = {161, 180}, m = "invokeSuspend", n = {"favorites"}, s = {"L$0"})
public final class FavoritePickerViewModel$addFavorites$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $contacts;
    public final /* synthetic */ C18090vk $onFavoritesAdded;
    public Object L$0;
    public int label;
    public final /* synthetic */ FavoritePickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePickerViewModel$addFavorites$1(FavoritePickerViewModel favoritePickerViewModel, List list, C30391dr r4, C18090vk r5) {
        super(2, r4);
        this.$contacts = list;
        this.this$0 = favoritePickerViewModel;
        this.$onFavoritesAdded = r5;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new FavoritePickerViewModel$addFavorites$1(this.this$0, this.$contacts, r6, this.$onFavoritesAdded);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0146 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r15.label
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r4) goto L_0x007a
            if (r0 != r3) goto L_0x0147
            X.C30691eM.A01(r16)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r16)
            java.util.List r0 = r15.$contacts
            java.util.ArrayList r5 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r0.iterator()
        L_0x001f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x002f
            X.1BI r0 = X.C72453Mb.A0l(r1)
            if (r0 == 0) goto L_0x001f
            r5.add(r0)
            goto L_0x001f
        L_0x002f:
            java.util.ArrayList r14 = X.C29351c6.A0D(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x0037:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0064
            X.1BI r7 = X.C17880vN.A0Q(r1)
            X.C72453Mb.A1R(r7)
            boolean r0 = X.C22971Dz.A0d(r7)
            if (r0 == 0) goto L_0x0058
            X.2Qt r6 = X.C49512Qt.ONE_TO_ONE
        L_0x004c:
            r9 = -1
            r8 = -1
            X.2rT r5 = new X.2rT
            r5.<init>(r6, r7, r8, r9)
            r14.add(r5)
            goto L_0x0037
        L_0x0058:
            boolean r0 = X.C22971Dz.A0e(r7)
            if (r0 == 0) goto L_0x0061
            X.2Qt r6 = X.C49512Qt.GROUP
            goto L_0x004c
        L_0x0061:
            X.2Qt r6 = X.C49512Qt.NONE
            goto L_0x004c
        L_0x0064:
            com.whatsapp.calling.favorite.FavoritePickerViewModel r0 = r15.this$0
            X.00H r0 = r0.A0D
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            com.whatsapp.favorite.FavoriteManager r1 = (com.whatsapp.favorite.FavoriteManager) r1
            r15.L$0 = r14
            r15.label = r4
            r0 = 0
            java.lang.Object r0 = r1.A03(r0, r14, r15)
            if (r0 != r2) goto L_0x0081
            return r2
        L_0x007a:
            java.lang.Object r14 = r15.L$0
            java.util.List r14 = (java.util.List) r14
            X.C30691eM.A01(r16)
        L_0x0081:
            com.whatsapp.calling.favorite.FavoritePickerViewModel r0 = r15.this$0
            X.00H r0 = r0.A0C
            java.lang.Object r7 = r0.get()
            X.1xH r7 = (X.C41901xH) r7
            com.whatsapp.calling.favorite.FavoritePickerViewModel r4 = r15.this$0
            java.util.Collection r13 = r4.A03
            int r0 = r4.A01
            long r0 = (long) r0
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r0)
            long r0 = r4.A02
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r0)
            X.0vl r0 = r4.A0F
            java.util.Map r1 = X.AnonymousClass3MW.A12(r0)
            boolean r0 = r1.isEmpty()
            r4 = 0
            if (r0 == 0) goto L_0x0100
            r6 = 0
        L_0x00ac:
            long r0 = (long) r6
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r0)
            com.whatsapp.calling.favorite.FavoritePickerViewModel r0 = r15.this$0
            X.0vl r0 = r0.A0F
            java.util.Map r1 = X.AnonymousClass3MW.A12(r0)
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x00ea
            r6 = 0
        L_0x00c1:
            long r0 = (long) r6
            java.lang.Long r11 = new java.lang.Long
            r11.<init>(r0)
            com.whatsapp.calling.favorite.FavoritePickerViewModel r0 = r15.this$0
            X.0vl r0 = r0.A0F
            java.util.Map r1 = X.AnonymousClass3MW.A12(r0)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0116
            java.util.Iterator r5 = X.AnonymousClass000.A15(r1)
        L_0x00d9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0116
            java.lang.Object r1 = X.C17890vO.A0P(r5)
            X.4Cm r0 = X.C82874Cm.ALL_CONTACTS
            if (r1 != r0) goto L_0x00d9
            int r4 = r4 + 1
            goto L_0x00d9
        L_0x00ea:
            java.util.Iterator r5 = X.AnonymousClass000.A15(r1)
            r6 = 0
        L_0x00ef:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00c1
            java.lang.Object r1 = X.C17890vO.A0P(r5)
            X.4Cm r0 = X.C82874Cm.SEARCH
            if (r1 != r0) goto L_0x00ef
            int r6 = r6 + 1
            goto L_0x00ef
        L_0x0100:
            java.util.Iterator r5 = X.AnonymousClass000.A15(r1)
            r6 = 0
        L_0x0105:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r1 = X.C17890vO.A0P(r5)
            X.4Cm r0 = X.C82874Cm.SUGGESTION
            if (r1 != r0) goto L_0x0105
            int r6 = r6 + 1
            goto L_0x0105
        L_0x0116:
            long r0 = (long) r4
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r0)
            r7.A02(r8, r9, r10, r11, r12, r13, r14)
            com.whatsapp.calling.favorite.FavoritePickerViewModel r0 = r15.this$0
            X.1V9 r5 = r0.A08
            r0 = 9
            java.lang.Integer r4 = X.AnonymousClass3MW.A0v(r0)
            r1 = 39
            r0 = 15
            r5.A01(r4, r1, r0)
            com.whatsapp.calling.favorite.FavoritePickerViewModel r0 = r15.this$0
            X.0wl r5 = r0.A0H
            X.0vk r4 = r15.$onFavoritesAdded
            r1 = 0
            com.whatsapp.calling.favorite.FavoritePickerViewModel$addFavorites$1$4 r0 = new com.whatsapp.calling.favorite.FavoritePickerViewModel$addFavorites$1$4
            r0.<init>(r1, r4)
            r15.L$0 = r1
            r15.label = r3
            java.lang.Object r0 = X.C30451dy.A00(r15, r5, r0)
            if (r0 != r2) goto L_0x000f
            return r2
        L_0x0147:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.favorite.FavoritePickerViewModel$addFavorites$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePickerViewModel$addFavorites$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
