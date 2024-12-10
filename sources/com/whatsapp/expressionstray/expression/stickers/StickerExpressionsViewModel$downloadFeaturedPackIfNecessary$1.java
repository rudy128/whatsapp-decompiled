package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1YF;
import X.C108955ca;
import X.C133886pf;
import X.C146747Ql;
import X.C17880vN;
import X.C25251Nm;
import X.C25291Nq;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsViewModel$downloadFeaturedPackIfNecessary$1", f = "StickerExpressionsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsViewModel$downloadFeaturedPackIfNecessary$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ StickerExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerExpressionsViewModel$downloadFeaturedPackIfNecessary$1(StickerExpressionsViewModel stickerExpressionsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = stickerExpressionsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new StickerExpressionsViewModel$downloadFeaturedPackIfNecessary$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StickerExpressionsViewModel$downloadFeaturedPackIfNecessary$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            if (!C17880vN.A1W(C17880vN.A0C(((C25251Nm) this.this$0.A0X.get()).A05), "sticker_pack_featured_initial_download")) {
                String A0v = C108955ca.A0v(this.this$0.A0E, 12188);
                if (!AnonymousClass1YF.A0T(A0v) && C25291Nq.A04(this.this$0.A0E, 12817)) {
                    ((C133886pf) this.this$0.A0P.get()).A01(C146747Ql.A00(this.this$0, 14), A0v);
                }
            }
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
