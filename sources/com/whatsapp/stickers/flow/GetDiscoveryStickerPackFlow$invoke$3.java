package com.whatsapp.stickers.flow;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass2LK;
import X.AnonymousClass6H5;
import X.C130196j2;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C30691eM;
import com.whatsapp.util.Log;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.GetDiscoveryStickerPackFlow$invoke$3", f = "GetDiscoveryStickerPackFlow.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GetDiscoveryStickerPackFlow$invoke$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass6H5 $observer;
    public int label;
    public final /* synthetic */ C130196j2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GetDiscoveryStickerPackFlow$invoke$3(AnonymousClass6H5 r2, C130196j2 r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = r3;
        this.$observer = r2;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new GetDiscoveryStickerPackFlow$invoke$3(this.$observer, this.this$0, r5);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            Log.i("GetDiscoveryStickerPackFlow/invoke starting collection");
            ((AnonymousClass2LK) this.this$0.A01.get()).registerObserver(this.$observer);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GetDiscoveryStickerPackFlow$invoke$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
