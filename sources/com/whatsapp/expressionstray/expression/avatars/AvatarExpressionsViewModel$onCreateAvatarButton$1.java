package com.whatsapp.expressionstray.expression.avatars;

import X.AnonymousClass000;
import X.AnonymousClass1G3;
import X.AnonymousClass1OS;
import X.C108975cc;
import X.C117105zE;
import X.C137836w6;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel$onCreateAvatarButton$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {122}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$onCreateAvatarButton$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$onCreateAvatarButton$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = avatarExpressionsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new AvatarExpressionsViewModel$onCreateAvatarButton$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new AvatarExpressionsViewModel$onCreateAvatarButton$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108975cc.A0L(this.this$0.A0A).A03((Boolean) null, 2);
            AvatarExpressionsViewModel avatarExpressionsViewModel = this.this$0;
            AnonymousClass1G3 r2 = avatarExpressionsViewModel.A0K;
            C117105zE r0 = new C117105zE(C137836w6.A00(avatarExpressionsViewModel.A0D));
            this.label = 1;
            if (r2.BJt(r0, this) == r4) {
                return r4;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
