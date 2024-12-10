package com.whatsapp.expressionstray.expression.stickers.received;

import X.AnonymousClass000;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.received.ReceivedStickersFlow$getTopReceivedStickers$2", f = "ReceivedStickersFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ReceivedStickersFlow$getTopReceivedStickers$2 extends C30431dv implements C36001nB {
    public /* synthetic */ Object L$0;
    public int label;

    public ReceivedStickersFlow$getTopReceivedStickers$2(C30391dr r2) {
        super(3, r2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        ReceivedStickersFlow$getTopReceivedStickers$2 receivedStickersFlow$getTopReceivedStickers$2 = new ReceivedStickersFlow$getTopReceivedStickers$2((C30391dr) obj3);
        receivedStickersFlow$getTopReceivedStickers$2.L$0 = obj2;
        return receivedStickersFlow$getTopReceivedStickers$2.invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            Log.e("ReceivedStickersFlow/error getting top received packs ", (Throwable) this.L$0);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
