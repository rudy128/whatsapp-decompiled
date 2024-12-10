package com.whatsapp.media.share;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C83284En;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.media.share.ShareMediaViewModel$notifyState$2", f = "ShareMediaViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ShareMediaViewModel$notifyState$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C83284En $state;
    public int label;
    public final /* synthetic */ ShareMediaViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ShareMediaViewModel$notifyState$2(C83284En r2, ShareMediaViewModel shareMediaViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = shareMediaViewModel;
        this.$state = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new ShareMediaViewModel$notifyState$2(this.$state, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A02.A0F(this.$state);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ShareMediaViewModel$notifyState$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
