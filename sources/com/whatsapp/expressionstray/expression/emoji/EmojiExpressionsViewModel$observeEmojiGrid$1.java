package com.whatsapp.expressionstray.expression.emoji;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel$observeEmojiGrid$1", f = "EmojiExpressionsViewModel.kt", i = {0, 1, 1}, l = {135, 152, 162}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "qplInstanceKey"}, s = {"L$0", "L$0", "L$1"})
public final class EmojiExpressionsViewModel$observeEmojiGrid$1 extends C30431dv implements AnonymousClass1OS {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;
    public final /* synthetic */ EmojiExpressionsViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmojiExpressionsViewModel$observeEmojiGrid$1(EmojiExpressionsViewModel emojiExpressionsViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = emojiExpressionsViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        EmojiExpressionsViewModel$observeEmojiGrid$1 emojiExpressionsViewModel$observeEmojiGrid$1 = new EmojiExpressionsViewModel$observeEmojiGrid$1(this.this$0, r4);
        emojiExpressionsViewModel$observeEmojiGrid$1.L$0 = obj;
        return emojiExpressionsViewModel$observeEmojiGrid$1;
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x007a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x008c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r6 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r10.label
            r7 = 3
            r9 = 2
            r1 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0016
            if (r0 == r1) goto L_0x002a
            if (r0 == r9) goto L_0x007d
            if (r0 != r7) goto L_0x00ae
            X.C30691eM.A01(r11)
        L_0x0013:
            X.1Wu r6 = X.C27621Wu.A00
            return r6
        L_0x0016:
            X.C30691eM.A01(r11)
            java.lang.Object r4 = r10.L$0
            X.1G2 r4 = (X.AnonymousClass1G2) r4
            X.5zr r0 = X.C117475zr.A00
            r10.L$0 = r4
            r10.label = r1
            java.lang.Object r0 = r4.BJt(r0, r10)
            if (r0 != r6) goto L_0x0031
            return r6
        L_0x002a:
            java.lang.Object r4 = r10.L$0
            X.1G2 r4 = (X.AnonymousClass1G2) r4
            X.C30691eM.A01(r11)
        L_0x0031:
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r10.this$0
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A0F
            r0 = 0
            boolean r0 = r1.getAndSet(r0)
            if (r0 == 0) goto L_0x007b
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r10.this$0
            X.00H r0 = r0.A0B
            int r0 = X.C139496yw.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass3MW.A0v(r0)
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r10.this$0
            int r3 = r1.intValue()
            X.00H r0 = r0.A0B
            X.6yw r2 = X.C108975cc.A0H(r0)
            java.lang.String r0 = "emoji_data_loading_start"
            r2.A02(r3, r0, r5)
        L_0x0059:
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r10.this$0
            X.00H r0 = r0.A09
            java.lang.Object r8 = r0.get()
            X.6k1 r8 = (X.C130796k1) r8
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r10.this$0
            boolean r3 = r0.A02
            r10.L$0 = r4
            r10.L$1 = r1
            r10.label = r9
            X.0wl r2 = r8.A09
            com.whatsapp.expressionstray.expression.emoji.data.EmojiExpressionsDataSource$getEmojiItems$2 r0 = new com.whatsapp.expressionstray.expression.emoji.data.EmojiExpressionsDataSource$getEmojiItems$2
            r0.<init>(r8, r1, r5, r3)
            java.lang.Object r11 = X.C30451dy.A00(r10, r2, r0)
            if (r11 != r6) goto L_0x0088
            return r6
        L_0x007b:
            r1 = r5
            goto L_0x0059
        L_0x007d:
            java.lang.Object r1 = r10.L$1
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.Object r4 = r10.L$0
            X.1G2 r4 = (X.AnonymousClass1G2) r4
            X.C30691eM.A01(r11)
        L_0x0088:
            boolean r0 = r11 instanceof X.C117465zq
            if (r0 == 0) goto L_0x00b3
            if (r11 == 0) goto L_0x00b3
            if (r1 == 0) goto L_0x00a1
            com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel r0 = r10.this$0
            X.00H r0 = r0.A0B
            X.6yw r2 = X.C108975cc.A0H(r0)
            int r1 = r1.intValue()
            java.lang.String r0 = "emoji_data_loading_end"
            r2.A02(r1, r0, r5)
        L_0x00a1:
            r10.L$0 = r5
            r10.L$1 = r5
            r10.label = r7
            java.lang.Object r0 = r4.BJt(r11, r10)
            if (r0 != r6) goto L_0x0013
            return r6
        L_0x00ae:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x00b3:
            java.lang.String r0 = "Null or loading result received."
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0n(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.expressionstray.expression.emoji.EmojiExpressionsViewModel$observeEmojiGrid$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((EmojiExpressionsViewModel$observeEmojiGrid$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
