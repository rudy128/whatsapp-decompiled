package com.whatsapp.funstickers.logging;

import X.AnonymousClass1OS;
import X.C1404771o;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$logSearchStarted$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$logSearchStarted$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C1404771o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$logSearchStarted$2(C1404771o r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new FunStickersFetchLogger$logSearchStarted$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FunStickersFetchLogger$logSearchStarted$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003b, code lost:
        if (X.AnonymousClass6WW.A00(r3.A08, r1, r2) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            if (r0 != 0) goto L_0x0056
            X.C30691eM.A01(r7)
            X.63l r2 = new X.63l
            r2.<init>()
            X.71o r1 = r6.this$0
            X.C1404771o.A00(r2, r1)
            r0 = 4
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            r2.A01 = r0
            X.18K r0 = r1.A0B
            r0.CC7(r2)
            X.71o r5 = r6.this$0
            X.63m r4 = new X.63m
            r4.<init>()
            X.71o r3 = r6.this$0
            java.lang.Long r0 = r3.A04
            r4.A07 = r0
            X.1lS r0 = r3.A09
            X.1lW r2 = X.AnonymousClass6YY.A00
            X.732 r1 = r0.A00(r2)
            if (r1 == 0) goto L_0x003d
            X.11P r0 = r3.A08
            boolean r1 = X.AnonymousClass6WW.A00(r0, r1, r2)
            r0 = 0
            if (r1 == 0) goto L_0x003e
        L_0x003d:
            r0 = 1
        L_0x003e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A01 = r0
            r5.A02 = r4
            X.71o r3 = r6.this$0
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            r3.A06 = r0
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0056:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.funstickers.logging.FunStickersFetchLogger$logSearchStarted$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
