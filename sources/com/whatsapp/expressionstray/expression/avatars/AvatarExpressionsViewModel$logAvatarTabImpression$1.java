package com.whatsapp.expressionstray.expression.avatars;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6RS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel$logAvatarTabImpression$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {280}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$logAvatarTabImpression$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$logAvatarTabImpression$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = avatarExpressionsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AvatarExpressionsViewModel$logAvatarTabImpression$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarExpressionsViewModel$logAvatarTabImpression$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r3 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AvatarSquidConfiguration avatarSquidConfiguration = this.this$0.A03;
            AnonymousClass6RS r0 = AnonymousClass6RS.STICKER_TRAY;
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
        if (AnonymousClass000.A1Y(obj)) {
            this.this$0.A03.A02(AnonymousClass6RS.STICKER_TRAY);
        }
        return C27621Wu.A00;
    }
}
