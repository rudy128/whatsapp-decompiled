package com.whatsapp.mediaview;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass21V;
import X.AnonymousClass7JZ;
import X.C18090vk;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30451dy;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.mediaview.MediaViewCurrentMessageViewModel$loadMessageMedia$1", f = "MediaViewCurrentMessageViewModel.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
public final class MediaViewCurrentMessageViewModel$loadMessageMedia$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18090vk $callback;
    public int label;
    public final /* synthetic */ MediaViewCurrentMessageViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaViewCurrentMessageViewModel$loadMessageMedia$1(MediaViewCurrentMessageViewModel mediaViewCurrentMessageViewModel, C30391dr r3, C18090vk r4) {
        super(2, r3);
        this.$callback = r4;
        this.this$0 = mediaViewCurrentMessageViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new MediaViewCurrentMessageViewModel$loadMessageMedia$1(this.this$0, r5, this.$callback);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            MediaViewCurrentMessageViewModel mediaViewCurrentMessageViewModel = this.this$0;
            AnonymousClass7JZ r3 = new AnonymousClass7JZ((AnonymousClass21V) this.$callback.invoke());
            this.label = 1;
            if (C30451dy.A00(this, mediaViewCurrentMessageViewModel.A07, new MediaViewCurrentMessageViewModel$notifyState$2(r3, mediaViewCurrentMessageViewModel, (C30391dr) null)) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MediaViewCurrentMessageViewModel$loadMessageMedia$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
