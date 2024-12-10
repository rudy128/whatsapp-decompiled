package com.whatsapp.profile.coinflip.preview;

import X.AnonymousClass000;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import android.content.Context;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.coinflip.preview.CoinFlipPreviewViewModel$getProfilePicBitmapSuspend$2", f = "CoinFlipPreviewViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CoinFlipPreviewViewModel$getProfilePicBitmapSuspend$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public final /* synthetic */ Context $context;
    public final /* synthetic */ int $imageSize;
    public int label;
    public final /* synthetic */ CoinFlipPreviewViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoinFlipPreviewViewModel$getProfilePicBitmapSuspend$2(Context context, AnonymousClass1E7 r3, CoinFlipPreviewViewModel coinFlipPreviewViewModel, C30391dr r5, int i) {
        super(2, r5);
        this.this$0 = coinFlipPreviewViewModel;
        this.$context = context;
        this.$contact = r3;
        this.$imageSize = i;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new CoinFlipPreviewViewModel$getProfilePicBitmapSuspend$2(this.$context, this.$contact, this.this$0, r8, this.$imageSize);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return this.this$0.A01.A04(this.$context, this.$contact, "CoinFlipPreview", -1.0f, this.$imageSize, true);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CoinFlipPreviewViewModel$getProfilePicBitmapSuspend$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
