package com.whatsapp.wabloks.commerce.interpreter.actions;

import X.A20;
import X.A45;
import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass7OQ;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import android.app.Activity;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.wabloks.commerce.interpreter.actions.FetchCatalogAction$perform$1$2", f = "FetchCatalogAction.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
public final class FetchCatalogAction$perform$1$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ Activity $activity;
    public final /* synthetic */ A45 $callback;
    public final /* synthetic */ String $catalogId;
    public final /* synthetic */ A20 $productListRequest;
    public final /* synthetic */ boolean $showFullScreenError;
    public int label;
    public final /* synthetic */ AnonymousClass7OQ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FetchCatalogAction$perform$1$2(Activity activity, A20 a20, A45 a45, AnonymousClass7OQ r5, String str, C30391dr r7, boolean z) {
        super(2, r7);
        this.this$0 = r5;
        this.$activity = activity;
        this.$productListRequest = a20;
        this.$catalogId = str;
        this.$callback = a45;
        this.$showFullScreenError = z;
    }

    public final C30391dr create(Object obj, C30391dr r10) {
        AnonymousClass7OQ r4 = this.this$0;
        return new FetchCatalogAction$perform$1$2(this.$activity, this.$productListRequest, this.$callback, r4, this.$catalogId, r10, this.$showFullScreenError);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass7OQ r7 = this.this$0;
            Activity activity = this.$activity;
            A20 a20 = this.$productListRequest;
            String str = this.$catalogId;
            A45 a45 = this.$callback;
            boolean z = this.$showFullScreenError;
            this.label = 1;
            if (C30451dy.A00(this, r7.A03, new FetchCatalogAction$fetchCatalogUsingGraphqlSuspended$2(activity, a20, a45, r7, str, (C30391dr) null, z)) == r2) {
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
        return ((FetchCatalogAction$perform$1$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
