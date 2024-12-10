package com.whatsapp.wabloks.commerce.interpreter.actions;

import X.A20;
import X.A45;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7OQ;
import X.C108945cZ;
import X.C138506xC;
import X.C172548tb;
import X.C23761Hn;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30671eK;
import X.C30691eM;
import X.C31751g4;
import android.app.Activity;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.wabloks.commerce.interpreter.actions.FetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2", f = "FetchCatalogAction.kt", i = {}, l = {119}, m = "invokeSuspend", n = {}, s = {})
public final class FetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ A45 $callback;
    public final /* synthetic */ String $catalogId;
    public final /* synthetic */ A20 $productListRequest;
    public final /* synthetic */ boolean $showFullScreenError;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ AnonymousClass7OQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2(Activity activity, A20 a20, A45 a45, AnonymousClass7OQ r5, String str, C30391dr r7, boolean z) {
        super(2, r7);
        this.this$0 = r5;
        this.$productListRequest = a20;
        this.$catalogId = str;
        this.$activity = activity;
        this.$callback = a45;
        this.$showFullScreenError = z;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        AnonymousClass7OQ r4 = this.this$0;
        FetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2 fetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2 = new FetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2(this.$activity, this.$productListRequest, this.$callback, r4, this.$catalogId, r10, this.$showFullScreenError);
        fetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2.L$0 = obj;
        return fetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2;
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        boolean z;
        A45 a45;
        Activity activity;
        AnonymousClass7OQ r3;
        C31751g4 r8 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            r3 = this.this$0;
            A20 a20 = this.$productListRequest;
            String str = this.$catalogId;
            activity = this.$activity;
            a45 = this.$callback;
            z = this.$showFullScreenError;
            try {
                C172548tb A00 = r3.A00.A00(a20, str);
                this.L$0 = r3;
                this.L$1 = activity;
                this.L$2 = a45;
                this.Z$0 = z;
                this.label = 1;
                obj = A00.CBx(this, C23761Hn.A01);
                if (obj == r8) {
                    return r8;
                }
            } catch (Throwable th) {
                obj2 = C108945cZ.A1J(th);
            }
        } else if (i == 1) {
            z = this.Z$0;
            a45 = (A45) this.L$2;
            activity = (Activity) this.L$1;
            r3 = (AnonymousClass7OQ) this.L$0;
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        AnonymousClass7OQ.A00(activity, a45, (C138506xC) obj, r3, z);
        obj2 = C27621Wu.A00;
        AnonymousClass7OQ r4 = this.this$0;
        Activity activity2 = this.$activity;
        boolean z2 = this.$showFullScreenError;
        A45 a452 = this.$callback;
        if (C30671eK.A00(obj2) != null) {
            AnonymousClass7OQ.A01(activity2, a452, r4, z2);
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
