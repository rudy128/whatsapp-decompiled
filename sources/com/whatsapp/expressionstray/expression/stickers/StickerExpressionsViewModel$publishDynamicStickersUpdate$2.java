package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.AnonymousClass1OW;
import X.AnonymousClass1OX;
import X.AnonymousClass60A;
import X.AnonymousClass60D;
import X.C18460wS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$publishDynamicStickersUpdate$2", f = "StickerExpressionsViewModel.kt", i = {}, l = {752, 761}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$publishDynamicStickersUpdate$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $giphyTenorResult;
    public final /* synthetic */ List $localResults;
    public final /* synthetic */ List $whatsAppStoreResult;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$publishDynamicStickersUpdate$2(StickerExpressionsViewModel stickerExpressionsViewModel, List list, List list2, List list3, C30391dr r6) {
        super(2, r6);
        this.$whatsAppStoreResult = list;
        this.this$0 = stickerExpressionsViewModel;
        this.$giphyTenorResult = list2;
        this.$localResults = list3;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        StickerExpressionsViewModel$publishDynamicStickersUpdate$2 stickerExpressionsViewModel$publishDynamicStickersUpdate$2 = new StickerExpressionsViewModel$publishDynamicStickersUpdate$2(this.this$0, this.$whatsAppStoreResult, this.$giphyTenorResult, this.$localResults, r8);
        stickerExpressionsViewModel$publishDynamicStickersUpdate$2.L$0 = obj;
        return stickerExpressionsViewModel$publishDynamicStickersUpdate$2;
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass1G4 r2;
        Object obj2;
        List list;
        List list2;
        C31751g4 r4 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            AnonymousClass1OX r3 = (AnonymousClass1OX) this.L$0;
            List list3 = this.$whatsAppStoreResult;
            if (list3 != null) {
                this.this$0.A04 = list3;
            }
            List list4 = this.$giphyTenorResult;
            if (list4 != null) {
                this.this$0.A02 = list4;
            }
            StickerExpressionsViewModel stickerExpressionsViewModel = this.this$0;
            stickerExpressionsViewModel.A03 = this.$localResults;
            StickerExpressionsViewModel.A0B(stickerExpressionsViewModel, (Long) null);
            if (!AnonymousClass1OW.A05(r3) || (this.$localResults.isEmpty() && (list = this.this$0.A04) != null && list.isEmpty() && (list2 = this.this$0.A02) != null && list2.isEmpty())) {
                r2 = this.this$0.A0l;
                obj2 = AnonymousClass60D.A00;
                this.label = 1;
            } else {
                StickerExpressionsViewModel stickerExpressionsViewModel2 = this.this$0;
                List list5 = this.$localResults;
                List list6 = stickerExpressionsViewModel2.A04;
                if (list6 == null) {
                    list6 = C18460wS.A00;
                }
                List list7 = stickerExpressionsViewModel2.A02;
                if (list7 == null) {
                    list7 = C18460wS.A00;
                }
                ArrayList A09 = StickerExpressionsViewModel.A09(stickerExpressionsViewModel2, list5, list6, list7);
                r2 = this.this$0.A0l;
                obj2 = new AnonymousClass60A(A09);
                this.label = 2;
            }
            if (r2.BJt(obj2, this) == r4) {
                return r4;
            }
        } else if (i == 1 || i == 2) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        return C27621Wu.A00;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerExpressionsViewModel$publishDynamicStickersUpdate$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
