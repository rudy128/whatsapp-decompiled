package com.whatsapp.expressionstray.expression.stickers;

import X.AnonymousClass000;
import X.AnonymousClass6HC;
import X.C123216To;
import X.C18460wS;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.StickerExpressionsDataSource$getCombinedStickerPacksFlow$1", f = "StickerExpressionsDataSource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class StickerExpressionsDataSource$getCombinedStickerPacksFlow$1 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public StickerExpressionsDataSource$getCombinedStickerPacksFlow$1(C30391dr r2) {
        super(3, r2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        StickerExpressionsDataSource$getCombinedStickerPacksFlow$1 stickerExpressionsDataSource$getCombinedStickerPacksFlow$1 = new StickerExpressionsDataSource$getCombinedStickerPacksFlow$1((C30391dr) obj3);
        stickerExpressionsDataSource$getCombinedStickerPacksFlow$1.L$0 = obj;
        stickerExpressionsDataSource$getCombinedStickerPacksFlow$1.L$1 = obj2;
        return stickerExpressionsDataSource$getCombinedStickerPacksFlow$1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Iterable iterable;
        if (this.label == 0) {
            C30691eM.A01(obj);
            C123216To r2 = (C123216To) this.L$0;
            C123216To r1 = (C123216To) this.L$1;
            if (r1 instanceof AnonymousClass6HC) {
                iterable = ((AnonymousClass6HC) r1).A00;
            } else {
                iterable = C18460wS.A00;
            }
            if (r2 instanceof AnonymousClass6HC) {
                return new AnonymousClass6HC(C29431cG.A0k(iterable, ((AnonymousClass6HC) r2).A00));
            }
            return r2;
        }
        throw AnonymousClass000.A0l();
    }
}
