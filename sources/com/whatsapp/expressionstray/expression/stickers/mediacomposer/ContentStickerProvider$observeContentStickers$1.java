package com.whatsapp.expressionstray.expression.stickers.mediacomposer;

import X.AnonymousClass1OS;
import X.C130076iq;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.stickers.mediacomposer.ContentStickerProvider$observeContentStickers$1", f = "ContentStickerProvider.kt", i = {0, 1, 2}, l = {38, 53, 60}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow"}, s = {"L$0", "L$0", "L$0"})
public final class ContentStickerProvider$observeContentStickers$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ C130076iq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContentStickerProvider$observeContentStickers$1(C130076iq r2, C30391dr r3) {
        super(2, r3);
        this.this$0 = r2;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        ContentStickerProvider$observeContentStickers$1 contentStickerProvider$observeContentStickers$1 = new ContentStickerProvider$observeContentStickers$1(this.this$0, r4);
        contentStickerProvider$observeContentStickers$1.L$0 = obj;
        return contentStickerProvider$observeContentStickers$1;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005c A[LOOP:0: B:12:0x005a->B:13:0x005c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007a A[LOOP:1: B:15:0x0074->B:17:0x007a, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0039 A[RETURN] */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r13.label
            r5 = 3
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0014
            if (r0 == r3) goto L_0x003a
            if (r0 == r4) goto L_0x008e
            if (r0 == r5) goto L_0x003a
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0014:
            X.C30691eM.A01(r14)
            java.lang.Object r2 = r13.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            X.6iq r0 = r13.this$0
            X.00H r0 = r0.A04
            java.lang.Object r0 = r0.get()
            X.0ve r0 = (X.C18030ve) r0
            X.8B0[] r0 = X.AnonymousClass711.A01(r0)
            int r1 = r0.length
            X.60R r0 = new X.60R
            r0.<init>(r1)
            r13.L$0 = r2
            r13.label = r3
            java.lang.Object r0 = r2.BJt(r0, r13)
        L_0x0037:
            if (r0 != r6) goto L_0x0041
            return r6
        L_0x003a:
            java.lang.Object r2 = r13.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            X.C30691eM.A01(r14)
        L_0x0041:
            X.6iq r0 = r13.this$0
            X.00H r0 = r0.A04
            java.lang.Object r0 = r0.get()
            X.0ve r0 = (X.C18030ve) r0
            X.8B0[] r12 = X.AnonymousClass711.A01(r0)
            X.C18070vi.A0X(r12)
            X.6iq r11 = r13.this$0
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            int r9 = r12.length
            r8 = 0
        L_0x005a:
            if (r8 >= r9) goto L_0x006c
            r7 = r12[r8]
            android.content.Context r1 = r11.A00
            X.0vb r0 = r11.A02
            X.73u r0 = r7.BHq(r1, r0, r3)
            X.AnonymousClass1D6.A02(r0, r7, r10)
            int r8 = r8 + 1
            goto L_0x005a
        L_0x006c:
            java.util.ArrayList r7 = X.C29351c6.A0D(r10)
            java.util.Iterator r1 = r10.iterator()
        L_0x0074:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007e
            X.C139806zT.A00(r7, r1)
            goto L_0x0074
        L_0x007e:
            X.60Q r0 = new X.60Q
            r0.<init>(r7)
            r13.L$0 = r2
            r13.label = r4
            java.lang.Object r0 = r2.BJt(r0, r13)
            if (r0 != r6) goto L_0x0095
            return r6
        L_0x008e:
            java.lang.Object r2 = r13.L$0
            X.1G2 r2 = (X.AnonymousClass1G2) r2
            X.C30691eM.A01(r14)
        L_0x0095:
            long r7 = java.lang.System.currentTimeMillis()
            r0 = 60000(0xea60, double:2.9644E-319)
            long r7 = r7 % r0
            long r0 = r0 - r7
            r13.L$0 = r2
            r13.label = r5
            java.lang.Object r0 = X.C62882s9.A00(r13, r0)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.stickers.mediacomposer.ContentStickerProvider$observeContentStickers$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ContentStickerProvider$observeContentStickers$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
