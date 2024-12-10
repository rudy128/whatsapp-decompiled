package com.whatsapp.expressionstray.expression.stickers.mediacomposer;

import X.AnonymousClass1OS;
import X.C130076iq;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.mediacomposer.ContentStickerProvider$observeShapesStickers$1", f = "ContentStickerProvider.kt", i = {0}, l = {68, 79}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
public final class ContentStickerProvider$observeShapesStickers$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C130076iq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentStickerProvider$observeShapesStickers$1(C130076iq r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        ContentStickerProvider$observeShapesStickers$1 contentStickerProvider$observeShapesStickers$1 = new ContentStickerProvider$observeShapesStickers$1(this.this$0, r4);
        contentStickerProvider$observeShapesStickers$1.L$0 = obj;
        return contentStickerProvider$observeShapesStickers$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005d A[LOOP:1: B:15:0x0057->B:17:0x005d, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0075 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r13.label
            r7 = 2
            r12 = 1
            if (r0 == 0) goto L_0x0012
            if (r0 == r12) goto L_0x0029
            if (r0 != r7) goto L_0x0076
            X.C30691eM.A01(r14)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r14)
            java.lang.Object r5 = r13.L$0
            X.1G2 r5 = (X.AnonymousClass1G2) r5
            X.60T r0 = new X.60T
            r0.<init>()
            r13.L$0 = r5
            r13.label = r12
            java.lang.Object r0 = r5.BJt(r0, r13)
            if (r0 != r6) goto L_0x0030
            return r6
        L_0x0029:
            java.lang.Object r5 = r13.L$0
            X.1G2 r5 = (X.AnonymousClass1G2) r5
            X.C30691eM.A01(r14)
        L_0x0030:
            X.8B0[] r11 = X.AnonymousClass711.A00
            X.C18070vi.A0Z(r11)
            X.6iq r10 = r13.this$0
            java.util.ArrayList r9 = X.AnonymousClass000.A13()
            r8 = 6
            r3 = 0
        L_0x003d:
            r2 = r11[r3]
            android.content.Context r1 = r10.A00
            X.0vb r0 = r10.A02
            X.73u r0 = r2.BHq(r1, r0, r12)
            X.AnonymousClass1D6.A02(r0, r2, r9)
            int r3 = r3 + 1
            r4 = 0
            if (r3 < r8) goto L_0x003d
            java.util.ArrayList r3 = X.C29351c6.A0D(r9)
            java.util.Iterator r1 = r9.iterator()
        L_0x0057:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0061
            X.C139806zT.A00(r3, r1)
            goto L_0x0057
        L_0x0061:
            r2 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r1 = 1082130432(0x40800000, float:4.0)
            X.60U r0 = new X.60U
            r0.<init>(r3, r1, r2)
            r13.L$0 = r4
            r13.label = r7
            java.lang.Object r0 = r5.BJt(r0, r13)
            if (r0 != r6) goto L_0x000f
            return r6
        L_0x0076:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.mediacomposer.ContentStickerProvider$observeShapesStickers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContentStickerProvider$observeShapesStickers$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
