package com.whatsapp.bot.home;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C147267Sm;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.bot.home.AiHomeViewAllViewModel$sectionLiveData$lambda$2$$inlined$transform$1", f = "AiHomeViewAllViewModel.kt", i = {}, l = {36}, m = "invokeSuspend", n = {}, s = {})
public final class AiHomeViewAllViewModel$sectionLiveData$lambda$2$$inlined$transform$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C23421Fz $this_transform;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AiHomeViewAllViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiHomeViewAllViewModel$sectionLiveData$lambda$2$$inlined$transform$1(AiHomeViewAllViewModel aiHomeViewAllViewModel, C30391dr r3, C23421Fz r4) {
        super(2, r3);
        this.$this_transform = r4;
        this.this$0 = aiHomeViewAllViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        AiHomeViewAllViewModel$sectionLiveData$lambda$2$$inlined$transform$1 aiHomeViewAllViewModel$sectionLiveData$lambda$2$$inlined$transform$1 = new AiHomeViewAllViewModel$sectionLiveData$lambda$2$$inlined$transform$1(this.this$0, r5, this.$this_transform);
        aiHomeViewAllViewModel$sectionLiveData$lambda$2$$inlined$transform$1.L$0 = obj;
        return aiHomeViewAllViewModel$sectionLiveData$lambda$2$$inlined$transform$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            Object obj2 = this.L$0;
            C23421Fz r2 = this.$this_transform;
            C147267Sm r0 = new C147267Sm(obj2, this.this$0, 1);
            this.label = 1;
            if (r2.BFC(this, r0) == r5) {
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
        return ((AiHomeViewAllViewModel$sectionLiveData$lambda$2$$inlined$transform$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
