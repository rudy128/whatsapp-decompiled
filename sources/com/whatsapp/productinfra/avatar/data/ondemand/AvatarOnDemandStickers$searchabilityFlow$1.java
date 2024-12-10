package com.whatsapp.productinfra.avatar.data.ondemand;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.AnonymousClass4W9;
import X.AnonymousClass7IM;
import X.AnonymousClass7xR;
import X.C108475bl;
import X.C133686pK;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.data.ondemand.AvatarOnDemandStickers$searchabilityFlow$1", f = "AvatarOnDemandStickers.kt", i = {}, l = {405}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarOnDemandStickers$searchabilityFlow$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ int $qplInstanceKey;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ AvatarOnDemandStickers this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarOnDemandStickers$searchabilityFlow$1(AvatarOnDemandStickers avatarOnDemandStickers, C30391dr r3, int i) {
        super(2, r3);
        this.this$0 = avatarOnDemandStickers;
        this.$qplInstanceKey = i;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        AvatarOnDemandStickers$searchabilityFlow$1 avatarOnDemandStickers$searchabilityFlow$1 = new AvatarOnDemandStickers$searchabilityFlow$1(this.this$0, r5, this.$qplInstanceKey);
        avatarOnDemandStickers$searchabilityFlow$1.L$0 = obj;
        return avatarOnDemandStickers$searchabilityFlow$1;
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r5 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            C108475bl r3 = (C108475bl) this.L$0;
            ((C133686pK) this.this$0.A04.get()).A00 = new AnonymousClass7IM(r3, 2);
            ((C133686pK) this.this$0.A04.get()).A01(AnonymousClass3MW.A0v(this.$qplInstanceKey));
            this.label = 1;
            if (AnonymousClass4W9.A00(this, AnonymousClass7xR.A00, r3) == r5) {
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
        return ((AvatarOnDemandStickers$searchabilityFlow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
