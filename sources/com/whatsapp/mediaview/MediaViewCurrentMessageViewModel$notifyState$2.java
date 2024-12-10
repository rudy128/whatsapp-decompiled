package com.whatsapp.mediaview;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass85R;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediaview.MediaViewCurrentMessageViewModel$notifyState$2", f = "MediaViewCurrentMessageViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class MediaViewCurrentMessageViewModel$notifyState$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass85R $state;
    public int label;
    public final /* synthetic */ MediaViewCurrentMessageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaViewCurrentMessageViewModel$notifyState$2(AnonymousClass85R r2, MediaViewCurrentMessageViewModel mediaViewCurrentMessageViewModel, C30391dr r4) {
        super(2, r4);
        this.this$0 = mediaViewCurrentMessageViewModel;
        this.$state = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MediaViewCurrentMessageViewModel$notifyState$2(this.$state, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A01.A0F(this.$state);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaViewCurrentMessageViewModel$notifyState$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
