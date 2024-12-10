package com.whatsapp.funstickers.logging;

import X.AnonymousClass1OS;
import X.C1404771o;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMediaDownloaded$2", f = "FunStickersFetchLogger.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FunStickersFetchLogger$logMediaDownloaded$2 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ C1404771o this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FunStickersFetchLogger$logMediaDownloaded$2(C1404771o r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new FunStickersFetchLogger$logMediaDownloaded$2(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new FunStickersFetchLogger$logMediaDownloaded$2(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        if (r7 == false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A0A, 7186) == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0025, code lost:
        if (X.C18020vd.A05(X.C18040vf.A02, r6.A0A, 7186) == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            if (r0 != 0) goto L_0x007c
            X.C30691eM.A01(r9)
            X.63l r5 = new X.63l
            r5.<init>()
            X.71o r6 = r8.this$0
            X.C1404771o.A00(r5, r6)
            long r3 = r6.A00
            long r1 = r6.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0027
            X.0ve r2 = r6.A0A
            r1 = 7186(0x1c12, float:1.007E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r0, r2, r1)
            r7 = 1
            r0 = 7
            if (r1 != 0) goto L_0x0029
        L_0x0027:
            r7 = 0
            r0 = 6
        L_0x0029:
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r0)
            r5.A01 = r0
            X.71o r0 = r8.this$0
            X.18K r0 = r0.A0B
            r0.CC7(r5)
            X.71o r6 = r8.this$0
            java.lang.Long r0 = r6.A06
            if (r0 == 0) goto L_0x006a
            long r4 = r0.longValue()
            X.63m r3 = r6.A02
            if (r3 == 0) goto L_0x006a
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r1 = r1 - r4
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r1)
            if (r7 == 0) goto L_0x006d
            r3.A03 = r0
        L_0x0052:
            X.71o r2 = r8.this$0
            X.63m r1 = r2.A02
            if (r1 == 0) goto L_0x005d
            X.18K r0 = r2.A0B
            r0.CC7(r1)
        L_0x005d:
            r0 = 0
            r2.A06 = r0
            if (r7 == 0) goto L_0x0067
            X.71o r0 = r8.this$0
            X.C1404771o.A01(r0)
        L_0x0067:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x006a:
            if (r7 != 0) goto L_0x0052
            goto L_0x006f
        L_0x006d:
            r3.A02 = r0
        L_0x006f:
            X.0ve r2 = r6.A0A
            r1 = 7186(0x1c12, float:1.007E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x0067
            goto L_0x0052
        L_0x007c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.funstickers.logging.FunStickersFetchLogger$logMediaDownloaded$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
