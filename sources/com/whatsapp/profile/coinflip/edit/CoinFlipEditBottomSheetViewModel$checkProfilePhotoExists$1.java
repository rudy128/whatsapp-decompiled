package com.whatsapp.profile.coinflip.edit;

import X.AnonymousClass000;
import X.AnonymousClass11S;
import X.AnonymousClass1E8;
import X.AnonymousClass1OS;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C86694Sr;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.coinflip.edit.CoinFlipEditBottomSheetViewModel$checkProfilePhotoExists$1", f = "CoinFlipEditBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CoinFlipEditBottomSheetViewModel$checkProfilePhotoExists$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ CoinFlipEditBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoinFlipEditBottomSheetViewModel$checkProfilePhotoExists$1(CoinFlipEditBottomSheetViewModel coinFlipEditBottomSheetViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = coinFlipEditBottomSheetViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new CoinFlipEditBottomSheetViewModel$checkProfilePhotoExists$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new CoinFlipEditBottomSheetViewModel$checkProfilePhotoExists$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass11S A0H = C17880vN.A0H(this.this$0.A06);
            A0H.A0I();
            AnonymousClass1E8 r0 = A0H.A0D;
            if (r0 != null) {
                z = r0.A0g;
            } else {
                z = false;
            }
            this.this$0.A00.A0E(new C86694Sr(z));
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
