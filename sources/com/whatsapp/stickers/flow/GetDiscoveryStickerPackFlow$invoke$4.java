package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass6H5;
import X.C130196j2;
import X.C17880vN;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C36001nB;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.GetDiscoveryStickerPackFlow$invoke$4", f = "GetDiscoveryStickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GetDiscoveryStickerPackFlow$invoke$4 extends C30431dv implements C36001nB {
    public final /* synthetic */ AnonymousClass6H5 $observer;
    public int label;
    public final /* synthetic */ C130196j2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetDiscoveryStickerPackFlow$invoke$4(AnonymousClass6H5 r2, C130196j2 r3, C30391dr r4) {
        super(3, r4);
        this.this$0 = r3;
        this.$observer = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C130196j2 r2 = this.this$0;
        return new GetDiscoveryStickerPackFlow$invoke$4(this.$observer, r2, (C30391dr) obj3).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            Log.i("GetDiscoveryStickerPackFlow/invoke collection finished");
            C17880vN.A0V(this.this$0.A01).unregisterObserver(this.$observer);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
