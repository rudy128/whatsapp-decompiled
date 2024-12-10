package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass6HC;
import X.AnonymousClass725;
import X.C108475bl;
import X.C108945cZ;
import X.C133436ok;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1", f = "StickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C108475bl $$this$callbackFlow;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1(StickerPackFlow stickerPackFlow, C30391dr r3, C108475bl r4) {
        super(2, r3);
        this.this$0 = stickerPackFlow;
        this.$$this$callbackFlow = r4;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1(this.this$0, r5, this.$$this$callbackFlow);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            StickerPackFlow stickerPackFlow = this.this$0;
            List<C133436ok> list = stickerPackFlow.A00.A00;
            ArrayList A0D = C29351c6.A0D(list);
            for (C133436ok r3 : list) {
                AnonymousClass725 A00 = r3.A00();
                A00.A00 = C108945cZ.A0z(stickerPackFlow.A03).A02(AnonymousClass725.A00(A00));
                A0D.add(r3);
            }
            StickerPackFlow.A00(new AnonymousClass6HC(A0D), this.this$0, this.$$this$callbackFlow);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerPackFlow$packFlow$1$observer$1$onStickerPackReordered$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
