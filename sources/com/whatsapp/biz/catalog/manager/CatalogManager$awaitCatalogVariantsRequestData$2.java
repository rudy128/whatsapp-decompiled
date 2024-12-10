package com.whatsapp.biz.catalog.manager;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C108975cc;
import X.C192559ob;
import X.C21728Are;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C71053Dp;
import com.whatsapp.jid.UserJid;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.biz.catalog.manager.CatalogManager$awaitCatalogVariantsRequestData$2", f = "CatalogManager.kt", i = {}, l = {755}, m = "invokeSuspend", n = {}, s = {})
public final class CatalogManager$awaitCatalogVariantsRequestData$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $bizJid;
    public final /* synthetic */ Set $variantInfoTypes;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public int label;
    public final /* synthetic */ CatalogManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CatalogManager$awaitCatalogVariantsRequestData$2(CatalogManager catalogManager, UserJid userJid, Set set, C30391dr r5) {
        super(2, r5);
        this.this$0 = catalogManager;
        this.$bizJid = userJid;
        this.$variantInfoTypes = set;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new CatalogManager$awaitCatalogVariantsRequestData$2(this.this$0, this.$bizJid, this.$variantInfoTypes, r6);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r6 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            CatalogManager catalogManager = this.this$0;
            UserJid userJid = this.$bizJid;
            Set set = this.$variantInfoTypes;
            this.L$0 = catalogManager;
            this.L$1 = userJid;
            this.L$2 = set;
            this.label = 1;
            C71053Dp A0k = C108975cc.A0k(this);
            ((C192559ob) catalogManager.A0J.getValue()).A01(userJid, set, new C21728Are(A0k, 7));
            obj = A0k.A00();
            if (obj == r6) {
                return r6;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CatalogManager$awaitCatalogVariantsRequestData$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
