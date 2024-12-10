package com.whatsapp.businesscollection.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass8F1;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.businesscollection.viewmodel.CollectionProductListViewModel$fetchNextPageProductsIfNeeded$1", f = "CollectionProductListViewModel.kt", i = {}, l = {78}, m = "invokeSuspend", n = {}, s = {})
public final class CollectionProductListViewModel$fetchNextPageProductsIfNeeded$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ String $collectionId;
    public final /* synthetic */ boolean $isCategory;
    public final /* synthetic */ UserJid $ownerJid;
    public int label;
    public final /* synthetic */ AnonymousClass8F1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CollectionProductListViewModel$fetchNextPageProductsIfNeeded$1(AnonymousClass8F1 r2, UserJid userJid, String str, C30391dr r5, boolean z) {
        super(2, r5);
        this.this$0 = r2;
        this.$ownerJid = userJid;
        this.$collectionId = str;
        this.$isCategory = z;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new CollectionProductListViewModel$fetchNextPageProductsIfNeeded$1(this.this$0, this.$ownerJid, this.$collectionId, r8, this.$isCategory);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass8F1 r0 = this.this$0;
            CatalogManager catalogManager = r0.A04;
            UserJid userJid = this.$ownerJid;
            String str = this.$collectionId;
            int i2 = r0.A00;
            boolean z = this.$isCategory;
            this.label = 1;
            if (catalogManager.A08(userJid, str, this, i2, z) == r2) {
                return r2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CollectionProductListViewModel$fetchNextPageProductsIfNeeded$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
