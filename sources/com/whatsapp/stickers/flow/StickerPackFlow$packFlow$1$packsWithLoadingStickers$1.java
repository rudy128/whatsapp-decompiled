package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass1ZT;
import X.AnonymousClass6HG;
import X.AnonymousClass702;
import X.AnonymousClass725;
import X.AnonymousClass72N;
import X.AnonymousClass73Q;
import X.C108945cZ;
import X.C134416qY;
import X.C147027Rn;
import X.C27354DcQ;
import X.C27621Wu;
import X.C29351c6;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$packsWithLoadingStickers$1", f = "StickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerPackFlow$packFlow$1$packsWithLoadingStickers$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$1$packsWithLoadingStickers$1(StickerPackFlow stickerPackFlow, C30391dr r3) {
        super(2, r3);
        this.this$0 = stickerPackFlow;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new StickerPackFlow$packFlow$1$packsWithLoadingStickers$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new StickerPackFlow$packFlow$1$packsWithLoadingStickers$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            StickerPackFlow stickerPackFlow = this.this$0;
            C27354DcQ A01 = AnonymousClass1ZT.A01();
            A01.addAll(AnonymousClass73Q.A01((AnonymousClass73Q) stickerPackFlow.A06.get(), 1));
            A01.addAll(((AnonymousClass702) stickerPackFlow.A09.get()).A01());
            C27354DcQ A02 = AnonymousClass1ZT.A02(A01);
            LinkedHashSet A00 = ((C134416qY) this.this$0.A0A.get()).A00();
            StickerPackFlow stickerPackFlow2 = this.this$0;
            ArrayList A0D = C29351c6.A0D(A02);
            Iterator it = A02.iterator();
            while (it.hasNext()) {
                AnonymousClass725 A0y = C108945cZ.A0y(it);
                AnonymousClass72N A0z = C108945cZ.A0z(stickerPackFlow2.A03);
                String A002 = AnonymousClass725.A00(A0y);
                A0y.A00 = A0z.A02(A002);
                A0y.A0B = A00.contains(A002);
                A0D.add(new AnonymousClass6HG(A0y, A002));
            }
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : A0D) {
                if (!((AnonymousClass6HG) next).A00.A0S) {
                    A13.add(next);
                }
            }
            return C147027Rn.A00(A13, 44);
        }
        throw AnonymousClass000.A0l();
    }
}
