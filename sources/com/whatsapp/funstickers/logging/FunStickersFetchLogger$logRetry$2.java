package com.whatsapp.funstickers.logging;

import X.AnonymousClass000;
import X.AnonymousClass1OS;
import X.AnonymousClass3MW;
import X.C1184363l;
import X.C1404771o;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import X.C30691eM;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$logRetry$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$logRetry$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C1404771o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$logRetry$2(C1404771o r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new FunStickersFetchLogger$logRetry$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FunStickersFetchLogger$logRetry$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            C30691eM.A01(obj);
            C1184363l r2 = new C1184363l();
            C1404771o r1 = this.this$0;
            r2.A05 = r1.A05;
            r2.A02 = r1.A03;
            r2.A06 = r1.A07;
            r2.A01 = AnonymousClass3MW.A0v(3);
            r2.A00 = AnonymousClass3MW.A0v(11);
            r1.A0B.CC7(r2);
            return C27621Wu.A00;
        }
        throw AnonymousClass000.A0l();
    }
}
