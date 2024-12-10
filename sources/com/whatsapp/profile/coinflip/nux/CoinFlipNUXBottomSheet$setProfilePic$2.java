package com.whatsapp.profile.coinflip.nux;

import X.AnonymousClass000;
import X.AnonymousClass1G1;
import X.AnonymousClass1OS;
import X.AnonymousClass4FR;
import X.AnonymousClass5WL;
import X.C23401Fx;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C37801q9;
import X.C99614tB;
import com.whatsapp.profile.coinflip.profilepic.CoinFlipProfilePicViewModel;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.coinflip.nux.CoinFlipNUXBottomSheet$setProfilePic$2", f = "CoinFlipNUXBottomSheet.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
public final class CoinFlipNUXBottomSheet$setProfilePic$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CoinFlipNUXBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoinFlipNUXBottomSheet$setProfilePic$2(CoinFlipNUXBottomSheet coinFlipNUXBottomSheet, C30391dr r3) {
        super(2, r3);
        this.this$0 = coinFlipNUXBottomSheet;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CoinFlipNUXBottomSheet$setProfilePic$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CoinFlipNUXBottomSheet$setProfilePic$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1G1 r2 = ((CoinFlipProfilePicViewModel) this.this$0.A07.getValue()).A08;
            C37801q9 A1G = this.this$0.A1G();
            A1G.A00();
            AnonymousClass5WL A00 = AnonymousClass4FR.A00(C23401Fx.STARTED, A1G.A00, r2);
            C99614tB A002 = C99614tB.A00(this.this$0, 39);
            this.label = 1;
            if (A00.BFC(this, A002) == r4) {
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
