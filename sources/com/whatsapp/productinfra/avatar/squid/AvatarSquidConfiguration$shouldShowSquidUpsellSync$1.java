package com.whatsapp.productinfra.avatar.squid;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6RS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration$shouldShowSquidUpsellSync$1", f = "AvatarSquidConfiguration.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarSquidConfiguration$shouldShowSquidUpsellSync$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass6RS $entryPoint;
    public int label;
    public final /* synthetic */ AvatarSquidConfiguration this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarSquidConfiguration$shouldShowSquidUpsellSync$1(AvatarSquidConfiguration avatarSquidConfiguration, AnonymousClass6RS r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = avatarSquidConfiguration;
        this.$entryPoint = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new AvatarSquidConfiguration$shouldShowSquidUpsellSync$1(this.this$0, this.$entryPoint, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AvatarSquidConfiguration avatarSquidConfiguration = this.this$0;
            AnonymousClass6RS r0 = this.$entryPoint;
            this.label = 1;
            obj = avatarSquidConfiguration.A01(r0, this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return obj;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarSquidConfiguration$shouldShowSquidUpsellSync$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
