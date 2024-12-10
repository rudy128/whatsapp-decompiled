package com.facebook.wearable.mediastream.client.state;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.BQm;
import X.BXL;
import X.C24712CGy;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import X.C31751g4;
import X.C62882s9;
import X.EEE;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.wearable.mediastream.client.state.MediaStreamServiceStateDelegate$handleFrameStallTimeout$1", f = "MediaStreamServiceStateDelegate.kt", i = {}, l = {295}, m = "invokeSuspend", n = {}, s = {})
public final class MediaStreamServiceStateDelegate$handleFrameStallTimeout$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ BXL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaStreamServiceStateDelegate$handleFrameStallTimeout$1(BXL bxl, C30391dr r3) {
        super(2, r3);
        this.this$0 = bxl;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MediaStreamServiceStateDelegate$handleFrameStallTimeout$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MediaStreamServiceStateDelegate$handleFrameStallTimeout$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [X.C5p, java.lang.Object] */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = C31751g4.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            C30691eM.A01(obj);
            this.label = 1;
            if (C62882s9.A00(this, 3000) == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            C30691eM.A01(obj);
        } else {
            throw AnonymousClass000.A0l();
        }
        C24712CGy.A01.A04(this.this$0.A09(), "[MEDIA_STREAM_SERVICE]: Frame stall detected", (Throwable) null);
        BQm bQm = this.this$0.A00;
        ? obj3 = new Object();
        EEE[] eeeArr = BQm.A0R;
        bQm.A0B(obj3);
        return C27621Wu.A00;
    }
}
