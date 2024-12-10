package com.facebook.commonavatarliveediting.leplayer.ale;

import X.AnonymousClass000;
import X.AnonymousClass1D7;
import X.AnonymousClass1OS;
import X.BRE;
import X.C17890vO;
import X.C18070vi;
import X.C26294Cx6;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C8y;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.leplayer.ale.AleLiveEditingPlayer$replayFirstLiveEditingPlayerRequestAfterAvatarGen$1", f = "AleLiveEditingPlayer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AleLiveEditingPlayer$replayFirstLiveEditingPlayerRequestAfterAvatarGen$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ BRE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AleLiveEditingPlayer$replayFirstLiveEditingPlayerRequestAfterAvatarGen$1(BRE bre, C30391dr r3) {
        super(2, r3);
        this.this$0 = bre;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AleLiveEditingPlayer$replayFirstLiveEditingPlayerRequestAfterAvatarGen$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AleLiveEditingPlayer$replayFirstLiveEditingPlayerRequestAfterAvatarGen$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("replayFirstLiveEditingPlayerRequestAfterFirstAvatarGen, toBeReplayedBodyMorphsAfterFirstGeneration: ");
            A10.append(this.this$0.A07);
            A10.append(", toBeReplayedColorParametricConfigAfterFirstGeneration:");
            C26294Cx6.A04("AleLiveEditingPlayer", C17890vO.A0V(this.this$0.A08, A10));
            this.this$0.A08(C18070vi.A0H(C8y.A00()), this.this$0.A07);
            this.this$0.A07 = AnonymousClass1D7.A0I();
            this.this$0.A09(C18070vi.A0H(C8y.A00()), this.this$0.A09);
            this.this$0.A09 = AnonymousClass1D7.A0I();
            this.this$0.A07(C18070vi.A0H(C8y.A00()), this.this$0.A08);
            this.this$0.A08 = AnonymousClass1D7.A0I();
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
