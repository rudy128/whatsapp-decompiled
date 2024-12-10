package com.whatsapp.stickers.flow;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1", f = "StickerPackFlow.kt", i = {0, 1, 1}, l = {72, 94, 218}, m = "invokeSuspend", n = {"$this$callbackFlow", "$this$callbackFlow", "stickerPack"}, s = {"L$0", "L$0", "L$3"})
public final class StickerPackFlow$packFlow$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;
    public final /* synthetic */ StickerPackFlow this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StickerPackFlow$packFlow$1(StickerPackFlow stickerPackFlow, C30391dr r3) {
        super(2, r3);
        this.this$0 = stickerPackFlow;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        StickerPackFlow$packFlow$1 stickerPackFlow$packFlow$1 = new StickerPackFlow$packFlow$1(this.this$0, r4);
        stickerPackFlow$packFlow$1.L$0 = obj;
        return stickerPackFlow$packFlow$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009c  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e3 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r12.label
            r6 = 3
            r7 = 2
            r8 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0016
            if (r0 == r8) goto L_0x0031
            if (r0 == r7) goto L_0x0077
            if (r0 != r6) goto L_0x00e4
            X.C30691eM.A01(r13)
        L_0x0013:
            X.1Wu r5 = X.C27621Wu.A00
            return r5
        L_0x0016:
            X.C30691eM.A01(r13)
            java.lang.Object r3 = r12.L$0
            X.5bl r3 = (X.C108475bl) r3
            com.whatsapp.stickers.flow.StickerPackFlow r2 = r12.this$0
            X.0wl r1 = r2.A0B
            com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$packsWithLoadingStickers$1 r0 = new com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1$packsWithLoadingStickers$1
            r0.<init>(r2, r4)
            r12.L$0 = r3
            r12.label = r8
            java.lang.Object r13 = X.C30451dy.A00(r12, r1, r0)
            if (r13 != r5) goto L_0x0038
            return r5
        L_0x0031:
            java.lang.Object r3 = r12.L$0
            X.5bl r3 = (X.C108475bl) r3
            X.C30691eM.A01(r13)
        L_0x0038:
            java.util.List r13 = (java.util.List) r13
            com.whatsapp.stickers.flow.StickerPackFlow r1 = r12.this$0
            X.6HC r0 = new X.6HC
            r0.<init>(r13)
            com.whatsapp.stickers.flow.StickerPackFlow.A01(r0, r1, r3)
            com.whatsapp.stickers.flow.StickerPackFlow r0 = r12.this$0
            X.0ve r2 = r0.A01
            r1 = 6548(0x1994, float:9.176E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 != 0) goto L_0x00bf
            com.whatsapp.stickers.flow.StickerPackFlow r8 = r12.this$0
            java.util.Iterator r9 = r13.iterator()
        L_0x0058:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x00bf
            java.lang.Object r0 = r9.next()
            X.6HG r0 = (X.AnonymousClass6HG) r0
            X.725 r10 = r0.A00
            r12.L$0 = r3
            r12.L$1 = r8
            r12.L$2 = r9
            r12.L$3 = r10
            r12.label = r7
            java.lang.Object r13 = r8.A02(r10, r12)
            if (r13 != r5) goto L_0x008a
            return r5
        L_0x0077:
            java.lang.Object r10 = r12.L$3
            X.725 r10 = (X.AnonymousClass725) r10
            java.lang.Object r9 = r12.L$2
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r8 = r12.L$1
            com.whatsapp.stickers.flow.StickerPackFlow r8 = (com.whatsapp.stickers.flow.StickerPackFlow) r8
            java.lang.Object r3 = r12.L$0
            X.5bl r3 = (X.C108475bl) r3
            X.C30691eM.A01(r13)
        L_0x008a:
            X.6HC r0 = r8.A00
            java.util.List r0 = r0.A00
            java.util.ArrayList r7 = X.C29351c6.A0D(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x0096:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00b5
            java.lang.Object r2 = r11.next()
            X.6ok r2 = (X.C133436ok) r2
            X.725 r0 = r2.A00()
            java.lang.String r1 = r0.A0H
            java.lang.String r0 = r10.A0H
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x00b1
            r2 = r13
        L_0x00b1:
            r7.add(r2)
            goto L_0x0096
        L_0x00b5:
            X.6HC r0 = new X.6HC
            r0.<init>(r7)
            com.whatsapp.stickers.flow.StickerPackFlow.A01(r0, r8, r3)
            r7 = 2
            goto L_0x0058
        L_0x00bf:
            com.whatsapp.stickers.flow.StickerPackFlow r1 = r12.this$0
            r0 = 1
            X.6H6 r2 = new X.6H6
            r2.<init>(r1, r3, r0)
            X.00H r0 = r1.A05
            X.C108965cb.A1J(r2, r0)
            com.whatsapp.stickers.flow.StickerPackFlow r1 = r12.this$0
            X.7vQ r0 = new X.7vQ
            r0.<init>(r2, r1)
            r12.L$0 = r4
            r12.L$1 = r4
            r12.L$2 = r4
            r12.L$3 = r4
            r12.label = r6
            java.lang.Object r0 = X.AnonymousClass4W9.A00(r12, r0, r3)
            if (r0 != r5) goto L_0x0013
            return r5
        L_0x00e4:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.stickers.flow.StickerPackFlow$packFlow$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((StickerPackFlow$packFlow$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
