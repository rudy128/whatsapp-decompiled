package com.whatsapp.calling.floatingview.usecase;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.jid.UserJid;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.calling.floatingview.usecase.FloatingViewUseCase$releaseVideoPortOnMainThread$2", f = "FloatingViewUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FloatingViewUseCase$releaseVideoPortOnMainThread$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ UserJid $this_releaseVideoPortOnMainThread;
    public int label;
    public final /* synthetic */ FloatingViewUseCase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingViewUseCase$releaseVideoPortOnMainThread$2(FloatingViewUseCase floatingViewUseCase, UserJid userJid, C30391dr r4) {
        super(2, r4);
        this.this$0 = floatingViewUseCase;
        this.$this_releaseVideoPortOnMainThread = userJid;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new FloatingViewUseCase$releaseVideoPortOnMainThread$2(this.this$0, this.$this_releaseVideoPortOnMainThread, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.this$0.A0A.A07(this.$this_releaseVideoPortOnMainThread);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((FloatingViewUseCase$releaseVideoPortOnMainThread$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
