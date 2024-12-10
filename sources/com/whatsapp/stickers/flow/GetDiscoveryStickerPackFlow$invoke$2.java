package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass6HC;
import X.C133436ok;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.GetDiscoveryStickerPackFlow$invoke$2", f = "GetDiscoveryStickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GetDiscoveryStickerPackFlow$invoke$2 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public /* synthetic */ Object L$1;
    public int label;

    public GetDiscoveryStickerPackFlow$invoke$2(C30391dr r2) {
        super(3, r2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        GetDiscoveryStickerPackFlow$invoke$2 getDiscoveryStickerPackFlow$invoke$2 = new GetDiscoveryStickerPackFlow$invoke$2((C30391dr) obj3);
        getDiscoveryStickerPackFlow$invoke$2.L$0 = obj;
        getDiscoveryStickerPackFlow$invoke$2.L$1 = obj2;
        return getDiscoveryStickerPackFlow$invoke$2.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            AnonymousClass6HC r1 = (AnonymousClass6HC) this.L$0;
            Set set = (Set) this.L$1;
            r1.A00.size();
            List list = r1.A00;
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : list) {
                if (!set.contains(((C133436ok) next).A01())) {
                    A13.add(next);
                }
            }
            return new AnonymousClass6HC(A13);
        }
        throw AnonymousClass000.A0l();
    }
}
