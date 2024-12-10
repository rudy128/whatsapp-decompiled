package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass6HC;
import X.C27621Wu;
import X.C29431cG;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.GetDiscoveryStickerPackFlow$invoke$1", f = "GetDiscoveryStickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GetDiscoveryStickerPackFlow$invoke$1 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public GetDiscoveryStickerPackFlow$invoke$1(C30391dr r2) {
        super(3, r2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        GetDiscoveryStickerPackFlow$invoke$1 getDiscoveryStickerPackFlow$invoke$1 = new GetDiscoveryStickerPackFlow$invoke$1((C30391dr) obj3);
        getDiscoveryStickerPackFlow$invoke$1.L$0 = obj;
        getDiscoveryStickerPackFlow$invoke$1.L$1 = obj2;
        return getDiscoveryStickerPackFlow$invoke$1.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            return new AnonymousClass6HC(C29431cG.A0l(this.L$1, ((AnonymousClass6HC) this.L$0).A00));
        }
        throw AnonymousClass000.A0l();
    }
}
