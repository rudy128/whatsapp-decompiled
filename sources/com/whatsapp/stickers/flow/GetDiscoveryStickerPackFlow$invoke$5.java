package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.GetDiscoveryStickerPackFlow$invoke$5", f = "GetDiscoveryStickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GetDiscoveryStickerPackFlow$invoke$5 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public int label;

    public GetDiscoveryStickerPackFlow$invoke$5(C30391dr r2) {
        super(3, r2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        GetDiscoveryStickerPackFlow$invoke$5 getDiscoveryStickerPackFlow$invoke$5 = new GetDiscoveryStickerPackFlow$invoke$5((C30391dr) obj3);
        getDiscoveryStickerPackFlow$invoke$5.L$0 = obj2;
        return getDiscoveryStickerPackFlow$invoke$5.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            Log.e("GetDiscoveryStickerPackFlow/error collecting discovery packs", (Throwable) this.L$0);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
