package com.whatsapp.expressionstray.expression.avatars;

import X.AnonymousClass000;
import X.AnonymousClass1G2;
import X.AnonymousClass1OB;
import X.AnonymousClass4Z6;
import X.C108955ca;
import X.C117335zb;
import X.C127256e3;
import X.C147197Se;
import X.C23421Fz;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C34081jt;
import X.C36001nB;
import X.C88604aC;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1", f = "AvatarExpressionsViewModel.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;
    public final /* synthetic */ AvatarExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1(AvatarExpressionsViewModel avatarExpressionsViewModel, C30391dr r3) {
        super(3, r3);
        this.this$0 = avatarExpressionsViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1 avatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1 = new AvatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1(this.this$0, (C30391dr) obj3);
        avatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1.L$0 = obj;
        avatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1.L$1 = obj2;
        return avatarExpressionsViewModel$observeEverything$$inlined$flatMapLatest$1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C23421Fz A0I;
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G2 r4 = (AnonymousClass1G2) this.L$0;
            if (!AnonymousClass000.A1Y(this.L$1)) {
                A0I = new C147197Se(C117335zb.A00, 5);
            } else {
                AvatarExpressionsViewModel avatarExpressionsViewModel = this.this$0;
                A0I = C108955ca.A0I(new AvatarExpressionsViewModel$observeAvatarStickers$2(avatarExpressionsViewModel, (C30391dr) null), AnonymousClass4Z6.A00(new AvatarExpressionsViewModel$observeAvatarStickers$$inlined$flatMapLatest$1(avatarExpressionsViewModel, (C30391dr) null), new C34081jt((AnonymousClass1OB) null, ((C127256e3) avatarExpressionsViewModel.A0F.get()).A01)));
            }
            this.label = 1;
            if (C88604aC.A02(this, A0I, r4) == r5) {
                return r5;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }
}
