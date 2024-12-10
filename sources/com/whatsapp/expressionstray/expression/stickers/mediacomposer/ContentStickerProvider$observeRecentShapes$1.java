package com.whatsapp.expressionstray.expression.stickers.mediacomposer;

import X.AnonymousClass1OS;
import X.C130076iq;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.mediacomposer.ContentStickerProvider$observeRecentShapes$1", f = "ContentStickerProvider.kt", i = {0}, l = {88, 101}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
public final class ContentStickerProvider$observeRecentShapes$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C130076iq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentStickerProvider$observeRecentShapes$1(C130076iq r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        ContentStickerProvider$observeRecentShapes$1 contentStickerProvider$observeRecentShapes$1 = new ContentStickerProvider$observeRecentShapes$1(this.this$0, r4);
        contentStickerProvider$observeRecentShapes$1.L$0 = obj;
        return contentStickerProvider$observeRecentShapes$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c A[LOOP:0: B:12:0x0045->B:14:0x004c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006c A[LOOP:1: B:16:0x0066->B:18:0x006c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0081 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r11.label
            r7 = 2
            r10 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r10) goto L_0x0026
            if (r0 != r7) goto L_0x0082
            X.C30691eM.A01(r12)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r12)
            java.lang.Object r5 = r11.L$0
            X.1G2 r5 = (X.AnonymousClass1G2) r5
            X.60V r0 = X.AnonymousClass60V.A00
            r11.L$0 = r5
            r11.label = r10
            java.lang.Object r0 = r5.BJt(r0, r11)
            if (r0 != r6) goto L_0x002d
            return r6
        L_0x0026:
            java.lang.Object r5 = r11.L$0
            X.1G2 r5 = (X.AnonymousClass1G2) r5
            X.C30691eM.A01(r12)
        L_0x002d:
            X.6iq r0 = r11.this$0
            X.67s r0 = r0.A03
            java.util.ArrayList r1 = r0.A05()
            r0 = 10
            java.util.List r0 = X.C29431cG.A0v(r1, r0)
            X.6iq r9 = r11.this$0
            java.util.ArrayList r8 = X.AnonymousClass000.A13()
            java.util.Iterator r3 = r0.iterator()
        L_0x0045:
            boolean r0 = r3.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x005e
            java.lang.Object r2 = r3.next()
            X.8B0 r2 = (X.AnonymousClass8B0) r2
            android.content.Context r1 = r9.A00
            X.0vb r0 = r9.A02
            X.73u r0 = r2.BHq(r1, r0, r10)
            X.AnonymousClass1D6.A02(r0, r2, r8)
            goto L_0x0045
        L_0x005e:
            java.util.ArrayList r3 = X.C29351c6.A0E(r8)
            java.util.Iterator r1 = r8.iterator()
        L_0x0066:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0070
            X.C139806zT.A00(r3, r1)
            goto L_0x0066
        L_0x0070:
            r2 = 0
            r1 = 0
            X.60U r0 = new X.60U
            r0.<init>(r3, r1, r2)
            r11.L$0 = r4
            r11.label = r7
            java.lang.Object r0 = r5.BJt(r0, r11)
            if (r0 != r6) goto L_0x000f
            return r6
        L_0x0082:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.mediacomposer.ContentStickerProvider$observeRecentShapes$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContentStickerProvider$observeRecentShapes$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
