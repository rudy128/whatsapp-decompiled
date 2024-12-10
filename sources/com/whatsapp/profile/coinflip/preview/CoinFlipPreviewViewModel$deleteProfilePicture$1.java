package com.whatsapp.profile.coinflip.preview;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass4YE;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel$deleteProfilePicture$1", f = "CoinFlipPreviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CoinFlipPreviewViewModel$deleteProfilePicture$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $meContact;
    public int label;
    public final /* synthetic */ CoinFlipPreviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoinFlipPreviewViewModel$deleteProfilePicture$1(AnonymousClass1E7 r2, CoinFlipPreviewViewModel coinFlipPreviewViewModel, C30391dr r4) {
        super(2, r4);
        this.$meContact = r2;
        this.this$0 = coinFlipPreviewViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CoinFlipPreviewViewModel$deleteProfilePicture$1(this.$meContact, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1E7 r2 = this.$meContact;
            if (r2 != null) {
                CoinFlipPreviewViewModel coinFlipPreviewViewModel = this.this$0;
                coinFlipPreviewViewModel.A05.A0D(r2);
                AnonymousClass4YE.A00(coinFlipPreviewViewModel.A06, 1, 2);
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CoinFlipPreviewViewModel$deleteProfilePicture$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
