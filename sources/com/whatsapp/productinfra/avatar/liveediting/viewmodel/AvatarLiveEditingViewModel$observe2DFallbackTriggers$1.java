package com.whatsapp.productinfra.avatar.liveediting.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass1D6;
import X.AnonymousClass1OS;
import X.BE7;
import X.C18070vi;
import X.C22699BLb;
import X.C24883COb;
import X.C25179CaV;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.CEY;
import X.CV6;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.productinfra.avatar.liveediting.viewmodel.AvatarLiveEditingViewModel$observe2DFallbackTriggers$1", f = "AvatarLiveEditingViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AvatarLiveEditingViewModel$observe2DFallbackTriggers$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C22699BLb this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AvatarLiveEditingViewModel$observe2DFallbackTriggers$1(C22699BLb bLb, C30391dr r3) {
        super(2, r3);
        this.this$0 = bLb;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        AvatarLiveEditingViewModel$observe2DFallbackTriggers$1 avatarLiveEditingViewModel$observe2DFallbackTriggers$1 = new AvatarLiveEditingViewModel$observe2DFallbackTriggers$1(this.this$0, r4);
        avatarLiveEditingViewModel$observe2DFallbackTriggers$1.L$0 = obj;
        return avatarLiveEditingViewModel$observe2DFallbackTriggers$1;
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1D6 r0 = (AnonymousClass1D6) this.L$0;
            Object obj2 = r0.first;
            C25179CaV caV = (C25179CaV) r0.second;
            CV6 cv6 = this.this$0.A01;
            if (cv6 != null) {
                String str = caV.A00;
                CEY.A00(cv6.A00, "FALLBACK_TRIGGERED");
                cv6.A00("fallbackType", str);
            }
            StringBuilder A10 = AnonymousClass000.A10();
            C22699BLb bLb = this.this$0;
            BE7.A1N(A10, bLb.A09.A00.A00());
            String A0y = AnonymousClass000.A0y(caV.A01, A10);
            C24883COb cOb = bLb.A0C;
            C18070vi.A0d(obj2, 0);
            cOb.A00.invoke(obj2.toString(), A0y);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AvatarLiveEditingViewModel$observe2DFallbackTriggers$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
