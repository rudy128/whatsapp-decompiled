package com.whatsapp.profile.coinflip.edit;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1E7;
import X.AnonymousClass1OS;
import X.AnonymousClass25I;
import X.AnonymousClass25J;
import X.C17900vP;
import X.C218617r;
import X.C27621Wu;
import X.C29681ch;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C72463Mc;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.profile.coinflip.edit.CoinFlipEditBottomSheetViewModel$getTempOrigPhotoFile$2", f = "CoinFlipEditBottomSheetViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CoinFlipEditBottomSheetViewModel$getTempOrigPhotoFile$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public int label;
    public final /* synthetic */ CoinFlipEditBottomSheetViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoinFlipEditBottomSheetViewModel$getTempOrigPhotoFile$2(AnonymousClass1E7 r2, CoinFlipEditBottomSheetViewModel coinFlipEditBottomSheetViewModel, C30391dr r4) {
        super(2, r4);
        this.$contact = r2;
        this.this$0 = coinFlipEditBottomSheetViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CoinFlipEditBottomSheetViewModel$getTempOrigPhotoFile$2(this.$contact, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        C218617r r2;
        C29681ch r0;
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass1E7 r4 = this.$contact;
            String str = "tmpi";
            if (r4 instanceof AnonymousClass25I) {
                r2 = this.this$0.A01;
                str = AnonymousClass000.A0y(((AnonymousClass25I) r4).A00, AnonymousClass000.A11(str));
            } else {
                AnonymousClass25J r02 = C29681ch.A03;
                AnonymousClass1BI r22 = r4.A0J;
                if (!(r22 instanceof C29681ch) || (r0 = (C29681ch) r22) == null || !r0.A00) {
                    r2 = this.this$0.A01;
                } else {
                    return this.this$0.A01.A0a(C17900vP.A0A(str, C72463Mc.A0n(r22)));
                }
            }
            return r2.A0a(str);
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CoinFlipEditBottomSheetViewModel$getTempOrigPhotoFile$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
