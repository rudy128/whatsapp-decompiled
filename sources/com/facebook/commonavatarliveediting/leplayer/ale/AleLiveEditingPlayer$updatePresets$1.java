package com.facebook.commonavatarliveediting.leplayer.ale;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.C18090vk;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.leplayer.ale.AleLiveEditingPlayer$updatePresets$1", f = "AleLiveEditingPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AleLiveEditingPlayer$updatePresets$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C18090vk $runnable;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AleLiveEditingPlayer$updatePresets$1(C30391dr r2, C18090vk r3) {
        super(2, r2);
        this.$runnable = r3;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AleLiveEditingPlayer$updatePresets$1(r4, this.$runnable);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AleLiveEditingPlayer$updatePresets$1((C30391dr) obj2, this.$runnable).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            this.$runnable.invoke();
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
