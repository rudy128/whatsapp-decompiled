package com.whatsapp.calling.favorite;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.Collection;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.favorite.FavoritePickerViewModel$filterOutAddedFavorites$1", f = "FavoritePickerViewModel.kt", i = {1}, l = {144, 149}, m = "invokeSuspend", n = {"selectedJids"}, s = {"L$0"})
public final class FavoritePickerViewModel$filterOutAddedFavorites$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Collection $alreadyAddedFavorites;
    public final /* synthetic */ List $selectedContacts;
    public Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ FavoritePickerViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FavoritePickerViewModel$filterOutAddedFavorites$1(FavoritePickerViewModel favoritePickerViewModel, Collection collection, List list, C30391dr r5) {
        super(2, r5);
        this.$selectedContacts = list;
        this.this$0 = favoritePickerViewModel;
        this.$alreadyAddedFavorites = collection;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new FavoritePickerViewModel$filterOutAddedFavorites$1(this.this$0, this.$alreadyAddedFavorites, this.$selectedContacts, r6);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058 A[LOOP:1: B:14:0x0052->B:16:0x0058, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0078 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r8.label
            r5 = 2
            r6 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r6) goto L_0x0043
            if (r0 != r5) goto L_0x008e
            java.lang.Object r7 = r8.L$1
            com.whatsapp.calling.favorite.FavoritePickerViewModel r7 = (com.whatsapp.calling.favorite.FavoritePickerViewModel) r7
            java.lang.Object r6 = r8.L$0
            java.util.Set r6 = (java.util.Set) r6
            X.C30691eM.A01(r9)
        L_0x0017:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r1 = r9.iterator()
        L_0x001d:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0079
            X.1E7 r0 = X.C17880vN.A0O(r1)
            X.C72463Mc.A1D(r0, r6)
            goto L_0x001d
        L_0x002b:
            X.C30691eM.A01(r9)
            com.whatsapp.calling.favorite.FavoritePickerViewModel r3 = r8.this$0
            java.util.Collection r1 = r8.$alreadyAddedFavorites
            r0 = 0
            com.whatsapp.calling.favorite.FavoritePickerViewModel$filterOutAddedFavorites$1$suggestionsResult$1 r2 = new com.whatsapp.calling.favorite.FavoritePickerViewModel$filterOutAddedFavorites$1$suggestionsResult$1
            r2.<init>(r3, r1, r0)
            r8.label = r6
            r0 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r9 = X.AnonymousClass4Z5.A00(r8, r2, r0)
            if (r9 != r4) goto L_0x0046
            return r4
        L_0x0043:
            X.C30691eM.A01(r9)
        L_0x0046:
            X.9zz r9 = (X.C199429zz) r9
            java.util.List r0 = r8.$selectedContacts
            java.util.ArrayList r2 = X.C29351c6.A0D(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0052:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x005c
            X.C72473Md.A1N(r2, r1)
            goto L_0x0052
        L_0x005c:
            java.util.Set r6 = X.C29431cG.A12(r2)
            com.whatsapp.calling.favorite.FavoritePickerViewModel r7 = r8.this$0
            java.util.List r3 = r9.A01
            X.1M9 r2 = r7.A09
            r8.L$0 = r6
            r8.L$1 = r7
            r8.label = r5
            r1 = 0
            com.whatsapp.contact.extensions.ContactManagerExtKt$asWaContacts$2 r0 = new com.whatsapp.contact.extensions.ContactManagerExtKt$asWaContacts$2
            r0.<init>(r2, r3, r1)
            java.lang.Object r9 = X.AnonymousClass1OW.A00(r8, r0)
            if (r9 != r4) goto L_0x0017
            return r4
        L_0x0079:
            java.util.List r9 = (java.util.List) r9
            r7.A04 = r9
            com.whatsapp.calling.favorite.FavoritePickerViewModel r1 = r8.this$0
            java.util.List r0 = r1.A04
            if (r0 == 0) goto L_0x008c
            int r0 = r0.size()
        L_0x0087:
            r1.A01 = r0
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x008c:
            r0 = 0
            goto L_0x0087
        L_0x008e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.favorite.FavoritePickerViewModel$filterOutAddedFavorites$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FavoritePickerViewModel$filterOutAddedFavorites$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
